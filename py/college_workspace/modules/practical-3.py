"""
    Write a Python program to illustrate the various functions of the “Math” module.
"""

import math     # importing math module

# Some constants in math module
print('e = ', math.e)
print('pi = ', math.pi)
print('tau = ', math.tau)

# ceil function
print(math.ceil(10.8))

# floor function
print(math.floor(10.8))

# logarithmic functions
print(math.log(math.e))     # by default base is e
print(math.log10(100))
print(math.log2(8))
print(math.log(16, 2))

# trignometry functions
print(math.sin(math.radians(90)))
print(math.cos(0))
