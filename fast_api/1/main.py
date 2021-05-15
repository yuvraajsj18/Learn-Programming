from enum import Enum
from typing import List, Optional, Set

from fastapi import Body, FastAPI, Path, Query
from pydantic import BaseModel, Field, HttpUrl

app = FastAPI()


# Intro
@app.get('/')
async def root():
    return {"message": "Hello, FastAPI!"}
    

# Path parameters
@app.get("/items/{item_id}")
async def read_item(item_id: int, q: Optional[str] = None):
    if q:
        return {"item_id": item_id, "q": q}
    return {"item_id": item_id}


# Order matters for path parameters
@app.get("/users/me")
async def read_user_me():
    return {"user_id": "the current user"}

@app.get("/users/{user_id}")
async def read_user(user_id: str):
    return {"user_id": user_id}


# Using predefined values for parameters

class AvailableProduct(str, Enum):
    product1 = "Product1"
    product2 = "Product2"
    product3 = "Product3"

@app.get("/products/{product_name}")
async def get_product(product_name: AvailableProduct):
    if product_name == AvailableProduct.product1:
        return {"product_name": product_name, "rating": 8}
    elif product_name == "Product2":
        return {"product_name": product_name, "rating": 9}
    else:
        return {"product_name": product_name, "rating": 10}


# Query Parameters

fake_items_db = [{"item_name": "Foo"}, {"item_name": "Bar"}, {"item_name": "Baz"}]

@app.get("/items/")
async def get_items(skip: int = 0, limit: int = 10):
    return fake_items_db[skip: skip + limit]

# Bool query parameter
@app.get("/info/")
async def get_info(short: Optional[bool] = False):  # short is True if 1, True, true, on, yes, or other case variation
    if not short:
        return {"info": "long info"}
    
    return {"info": "short info"}

# Required query parameter (no default)
@app.get("/info/{product_id}")
async def get_product_info(product_id: int, required_param: int):
    return {"product_id": product_id, "required_param": required_param}


# Request Body

# import pydantic base model

class Item(BaseModel):
    name: str
    description: Optional[str] = None
    price: float
    tax: Optional[float] = None # Use None to make attribute value optional

@app.post("/items/")
async def create_item(item: Item):
    item_dict = item.dict()
    if item.tax:
        price_with_tax = item.price + item.tax
        item_dict.update({"price_with_tax": price_with_tax})
    
    return item_dict

# You can also declare body, path and query parameters, all at the same time.

# The function parameters will be recognized as follows:

# If the parameter is also declared in the path, it will be used as a path parameter.
# If the parameter is of a singular type (like int, float, str, bool, etc) it will be interpreted as a query parameter.
# If the parameter is declared to be of the type of a Pydantic model, it will be interpreted as a request body.


# Query parameter and string validations

# import Query from fastapi

@app.get("/products/")
async def read_products(q: Optional[str] = Query(None, alias="item-query", title="Query String", min_length=3, max_length=50)):
    results = {"items": [{"item_id": "Foo"}, {"item_id": "Bar"}]}
    if q:
        results.update({'q': q})
    return results

# You can declare additional validations and metadata for your parameters.

# Generic validations and metadata:
# alias
# title
# description
# deprecated

# Validations specific for strings:
# min_length
# max_length
# regex


# Path parameters and numeric validation

# import Path from fastapi

@app.get("/items1/{item_id}")
async def read_items_1(
    item_id: int = Path(..., title="The ID of the item to get", ge=1)
):
    result = {"item_id": item_id}

    return result

# ge: greater than or equal
# gt: greater than
# le: less than or equal
# lt: less than


# Body multiple parameters

class Product1(BaseModel):
    name: str
    description: Optional[str] = None
    price: float
    tax: Optional[float] = None

class User1(BaseModel):
    username: str
    full_name: Optional[str] = None

@app.post("/products/{product_id}")
async def update_item(product_id: int, product: Product1, user: User1, importance: int = Body(...)):
    result = {"product_id": product_id, "product": product, "user": user, "importance": importance}

    return result;

# Singular value in body

# import Body from fastapi
# do as done for importance in above function


# Body fields

# Adding validation in Pydantic models
# import Field from pydantic

class Item2(BaseModel):
    name: str
    description: Optional[str] = Field(
        None, title="The description of the item", max_length=300
    )
    price: float = Field(..., gt=0, description="The price must be greater than zero")
    tax: Optional[float] = None

@app.put("/items/{item_id}")
async def update_item_2(item_id: int, item: Item = Body(..., embed=True)):
    results = {"item_id": item_id, "item": item}
    return results


# Body nested models

class Image(BaseModel):
    url: HttpUrl
    name: str

class Item3(BaseModel):
    name: str
    description: Optional[str] = None
    price: float
    tax: Optional[float] = None
    tags: Set[str] = set()
    image: Optional[Image] = None

@app.put("/items3/{item_id}")
async def update_item_3(item_id: int, item: Item3):
    result = {"item_id": item_id, "item": item}

    return result


# Declare request example data

# Using Pydantic schema_extra
class Item4(BaseModel):
    name: str # = Field(..., example="Item Name 1")  # example using Field
    description: Optional[str] = None
    price: float
    tax: Optional[float] = None

    class Config:   # Config example will override Field Example
        schema_extra = {
            "example": {
                "name": "Item Name",
                "description": "Item Description",
                "price": 35.4,
                "tax": 3.2,
            }
        }

@app.put("/items4/{item_id}")
async def update_item_4(item_id: int, item: Item4):
    results = {"item_id": item_id, "item": item}
    return results



    