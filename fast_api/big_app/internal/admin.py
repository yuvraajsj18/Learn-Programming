from fastapi import APIRouter

router = APIRouter(prefix="")

@router.get("/admin/", tags=["admin"])
async def read_admin():
    return [{"username": "Rick"}, {"username": "Morty"}]

@router.get("/admin/me", tags=["admin"])
async def read_user_me():
    return {"username": "fakecurrentuser"}


@router.get("/admin/{username}", tags=["admin"])
async def read_user(username: str):
    return {"username": username}
