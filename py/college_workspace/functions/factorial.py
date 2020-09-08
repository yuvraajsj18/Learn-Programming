"""Write a Python function that takes a number as an input from the user and computes its factorial."""

def factorial(number:int) -> int:
    """Calculates factorial of a number"""
    factorial_value = 1
    for i in range(1, number + 1):
        factorial_value *= i

    return factorial_value

    
number = int(input("Enter a number: "))
print(factorial(number))

"""
    Enter a number: 5
    120
"""

