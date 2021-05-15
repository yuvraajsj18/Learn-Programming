from typing import Dict, List, Optional, Set

from fastapi import FastAPI, File, UploadFile, Form, status, HTTPException
from pydantic import BaseModel, Field
from pydantic.networks import EmailStr
from fastapi.responses import HTMLResponse

app = FastAPI()

@app.get("/")
async def root():
    return {"message": "Hello, FastAPI"}

class Item(BaseModel):
    name: str
    description: Optional[str] = Field(None, max_length=300)
    price: float
    tax: Optional[float] = None
    tags: Set[str] = set()

@app.post(
    "/items/", 
    response_model=Item, 
    status_code=status.HTTP_201_CREATED, 
    tags=["items"],
    summary="Create an item",
    response_description="The created item",
)
async def create_item(item: Item):
    """
        Create an item with all the information:

        - **name**: each item must have a name
        - **description**: a long description
        - **price**: required
        - **tax**: if the item doesn't have tax, you can omit this
        - **tags**: a set of unique tag strings for this item
    """
    return item


class UserBase(BaseModel):
    username: str
    email: EmailStr
    full_name: Optional[str] = None

class UserIn(UserBase):
    password: str

class UserOut(UserBase):
    pass

class UserInDB(UserBase):
    hashed_password: str

def fake_password_hasher(raw_password: str):
    return "supersecret" + raw_password

def fake_save_user(user_in: UserIn):
    hashed_password = fake_password_hasher(user_in.password)
    user_in_db = UserInDB(**user_in.dict(), hashed_password=hashed_password)
    print("User saved! ..not really")
    return user_in_db

@app.post("/user/", response_model=UserOut)
async def create_user(user_in: UserIn):
    user_saved = fake_save_user(user_in)
    return user_saved


@app.post("/login/")
async def login(username: str = Form(...), password: str = Form(...)):
    return HTMLResponse(f"<h1>Hello, {username}</h1>")


@app.post("/files/")
async def create_file(file: bytes = File(...)):
    return {"file_size": len(file)}

@app.post("/uploadfile")
async def create_upload_file(file: UploadFile = File(...)):
    # return {"filename": file.filename}

    contents = file.file.read().decode("utf-8")
    content_html = """
            <div style="background:lightgray; padding:10px; border-radius:12px;
                font-weight: bold; font-size: 16px; word-break:break-all">
            <code>
        """
    for ch in contents:
        if ch == '\n':
            content_html += "<br>"
        elif ch == " ":
            content_html += "&nbsp;"
        elif ch == "<":
            content_html += "&lt;"
        elif ch == ">":
            content_html += "&gt;"
        elif ch == "\t":
            content_html += "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
        else:
            content_html += ch;
    content_html += "</code></div>"
    return HTMLResponse(content_html)


items = {"foo": "The Foo Wrestlers"}

@app.get("/items/{item_id}", tags=["items"])
async def read_item(item_id: str):
    if item_id not in items:
        raise HTTPException(status_code=404, detail="Item not found")

    return {"item": items[item_id]}