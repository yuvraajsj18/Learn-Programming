from functools import wraps

has_loggedin = False

def login_required(func):
    @wraps(func)
    def wrapper(*args, **kwargs):
        if has_loggedin:
            return func(*args, **kwargs)
        else:
            login()
            return func(*args, **kwargs)
    
    return wrapper

def login():
    global has_loggedin
    username = input("Enter username: ")
    password = input("Enter password: ")
    if password == "stupid":
        has_loggedin = True
        print("Logged in")
    else:
        print("Incorrect password")

@login_required
def secret_function():
    print("Secret function accessed")

secret_function()   # need to login first time
secret_function()   # no need to login again

