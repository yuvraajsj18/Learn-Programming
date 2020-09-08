"""
    Write a function that takes a number with two or more digits as an input and finds its
    reverse and computes the sum of its digits.
"""

def sum_digits(number:int) -> int:
    """Returns sum of digits in a number"""
    num_str = str(number)
    sum = 0
    for i in num_str:
        sum += int(i)

    return sum

def reverse(number:int) -> int:
    """Returns reverse of a number"""
    num_str = str(number)
    reverse_num_str = num_str[::-1]
    return int(reverse_num_str)

number = int(input("Enter a number: "))

print("Sum of its digit is", sum_digits(number))
print("Reverse of number is", reverse(number))

"""
Enter a number: 12345
Sum of its digit is 15
Reverse of number is 54321
"""


