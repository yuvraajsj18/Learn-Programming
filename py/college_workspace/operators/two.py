"""
def check(x):
   if x+1 is 1+x:
       return False
   if x+2 is not 2+x:
       return False
   return True

What could you input as x to make this function return True?
"""

def check(x):
   if x+1 is 1+x:
       return False
   if x+2 is not 2+x:
       return False
   return True

x = -7
print(check(x))   # True

"""
Reason:
    The range for integer caching is -5 to 256
    for x = -7 => x + 1 is -6 which is out of range
    and x + 2 is -5 which is in range so both of the condition will be false with is operator.
"""
