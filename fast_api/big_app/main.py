from fastapi import FastAPI
from fastapi.param_functions import Depends

from .dependencies import get_token_header, get_query_token
from .internal import admin
from .routers import items, users

app = FastAPI(dependencies=[Depends(get_query_token)])     # global dependencies

app.include_router(users.router)
app.include_router(items.router)

app.include_router(
    admin.router,
    prefix="/admin",
    tags=["admin"],
    dependencies=[Depends(get_token_header)],
    responses={418: {"description": "I'm a teapot"}},
)

@app.get("/")
async def root():
    return {"message": "Hello Bigger Applications!"}
