"""Write a function that takes a number as an input and determine whether it is prime or not"""
from math import sqrt

def is_prime(number:int) -> bool:
    """Return True if number is prime otherwise False"""
    for i in range(2, int(sqrt(number)) + 1):
        if (not number % i):
            return False
    
    return True


print("Primes upto 50")
for i in range(2, 50):
    if (is_prime(i)):
        print(i, end=" ")

print()

"""
    Primes upto 50
    2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 
"""
