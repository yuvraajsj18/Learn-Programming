"""
    a = 'Here is a string'
    b = 'Here is a string'
    Do a and b point to the same object?
    c = 'here_is_a_string'
    d = 'here_is_a_string'
    Do c and d point to the same object?
    Justify your answer.
"""
a = 'Here is a string'
b = 'Here is a string'

print(a is b) # False when executed in Interpreter True when as a script

c = 'here_is_a_string'
d = 'here_is_a_string'

print(c is d) # True

"""
Reason: 
any string that contains only letters, digits and underscores will generally be interned.
That's why c and d refers to same objects, while a and b not(sometimes)
"""



