"""
    Hackerrank Problem Function
    https://www.hackerrank.com/challenges/write-a-function/problem
"""

def is_leap(year):
    """ check if year is a leap year or not """
    leap = False

    if year % 4 == 0:
        leap = True
        if year % 100 == 0:
            leap = False
            if year % 400 == 0:
                leap = True

    return leap

year = int(input())
print(is_leap(year))