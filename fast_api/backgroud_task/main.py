from fastapi import BackgroundTasks ,FastAPI

app = FastAPI(
    title="My Super Project",
    description="This is a very fancy project, with auto docs for the API and everything",
    version="2.5.0",
)


def write_notification(email: str, message: str =""):
    with open("log.txt", mode="w") as email_file:
        content = f"notification for {email}: {message}"
        email_file.write(content)


@app.post("/send-notification/{email}")
async def send_notification(email: str, backgroud_task: BackgroundTasks):
    backgroud_task.add_task(write_notification, email, message="some notification")
    return {"message": "Notification sent in the background"}

