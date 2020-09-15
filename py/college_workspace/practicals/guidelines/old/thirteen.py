"""
Write a Python function that takes a string as an input from the user and displays its
reverse.
"""
def display_reverse(string:str) -> None:
    print(string[::-1])

string = input("Enter a string: ")
print("Its reverse is:", end="")
display_reverse(string)

"""
Enter a string: cs50
Its reverse is:05sc
-----------------------
Enter a string: Thirteen reasons why
Its reverse is:yhw snosaer neetrihT
"""
