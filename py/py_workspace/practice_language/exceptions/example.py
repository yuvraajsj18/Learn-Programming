class UserNotFoundError(Exception):
    def __init__(self):
        self._message = "User is not found in the database"

    def __str__(self):
        return self._message

# Test you custom exception class below
try:   
    users = ['Harry', 'Hermoinie', 'Ron']
    userName = input("Enter username: ")
    if userName not in users:
        raise UserNotFoundError
except UserNotFoundError as e:
    print(e)
except TypeError:
    print("Its a type error")
except Exception:
    print("Something undforeseen happened")
else:
    print(f"Welcome {userName}")
finally:
    print("Logging out")

print("Bye!!")