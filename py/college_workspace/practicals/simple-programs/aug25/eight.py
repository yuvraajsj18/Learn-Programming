"""
    Write a program to add two 1 digit positive integers without using the + operator.
    Note: Use bitwise operator to add two numbers.
"""

num1 = int(input("Number1 = "))
num2 = int(input("Number2 = "))

sum = (num1 ^ num2) ^ (num1 & num2) << 1

print("Sum is", sum)

"""
    Output:
            Number1 = 4
            Number2 = 8
            Sum is 12
"""

