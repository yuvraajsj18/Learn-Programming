"""
Write a function that finds the sum of the n terms of the following series:
a) 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + … x^n / n!
b) 1 + x^2 / 2! + x^4 / 4! + x^6 / 6! + … x^n / n!
"""
import math

def sum_a_series(x:int, n:int) -> float:
    """returns the sum of a series upto n terms"""
    sum = 1.0
    term_count = 0
    for i in range(2, n + 1, 2):
        term = (x ** i) / math.factorial(i)
        term = -1 * term if term_count % 2 else term
        term_count += 1
        sum += term

    return sum

def sum_b_series(x:int, n:int) -> float:
    """returns the sum of b series upto n terms"""
    sum = 1.0
    for i in range(2, n + 1, 2):
        term = (x ** i) / math.factorial(i)
        sum += term

    return sum


x = int(input("Enter, x = "))
n = int(input("Enter, n = "))
print("Sum of a series:", sum_a_series(x, n))
print("Sum of b series:", sum_b_series(x, n))


"""
Enter, x = 100
Enter, n = 10
Sum of a series: 27310688078193.24
Sum of b series: 27806728157558.32
"""
