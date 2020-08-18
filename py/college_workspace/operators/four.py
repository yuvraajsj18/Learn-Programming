"""
    a = ‘hello!’
    b = ‘hello!’
    Do a & b point to the same object?
    c, d = ‘hello!’,’hello!’
    Do c & d point to the same object?
    Justify your answer.
"""

a = 'hello!'
b = 'hello!'

print(a is b) # True

c, d = 'hello!', 'hello!'
print(c is d) # True

"""
Reason:
    Both strings are interned as there length is short.
"""