# all .py file containing valid python code are modules
# a folder containing __init__.py is also a module, though this file is not necessary now

def add(x):
    return x + x

"""
importing
1. import calculator - use - calculator.add(1,2)
2. from calculator import * - use - add(1,2)
3. from calculator import add - use - add(2,3)
4. from calculator import add as a - use a(2,3)
5. import calculator as calc
6. from calculator import add, twice
"""