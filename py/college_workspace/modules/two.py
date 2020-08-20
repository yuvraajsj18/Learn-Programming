"""
    Write a program to convert a given number in any base to a decimal number.
    (Take the number and its base from the user)
"""

number = input("Enter a number: ")
base = int(input("Enter base for the number: "))

base_number = int(number, base=base)

decimal_number = int(str(base_number), base=10)
print(decimal_number)
