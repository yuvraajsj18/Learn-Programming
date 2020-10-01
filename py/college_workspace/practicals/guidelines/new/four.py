"""
Write a function that takes a number >= 10 as an input and returns the digit of the numbers as a set
"""

def digits(num:int) -> set:
    return set(int(c) for c in str(num))

num = int(input("Enter a number: "))
digit_set = digits(num)

print("Digits:", digit_set)

"""
Enter a number: 12345
Digits: {1, 2, 3, 4, 5}
"""
