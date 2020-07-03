def func():
    pass

a = func()
print(a) # None

def factorial(n):
    if n in (0, 1):
        return 1
    result = 1
    for k in range(2, n + 1):
        result *= k
    
    return result

f5 = factorial(5)
print(f5)

# writing factorial more succintly
from functools import reduce
from operator import mul

def factorial(n):
    return reduce(mul, range(2, n + 1), 1)

f5 = factorial(5)
print(f5)


# returning multiple values

def moddiv(a, b):
    return a % b, a // b

print(moddiv(5, 2))