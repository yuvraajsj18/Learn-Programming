from functools import wraps

has_logined = False

def login_required(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        if has_logined:
            return func(*args, **kwargs)
        else:
            login()
            return func(*args, **kwargs)
    
    return wrapper

def login():
    global has_logined
    username = input("Enter username: ")
    password = input("Enter password: ")
    if password == "stupid":
        has_logined = True
        print("Loggined")
    else:
        print("Incorrect password")

@login_required
def secret_function():
    print("Secret function accessed")

secret_function()   # need to login first time
secret_function()   # no need to login again

