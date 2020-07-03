# types of argument in python functions

def positional(a, b, c):
    print('postional')
    print(f"a = {a} b = {b} c = {c}")
    print()

positional(1,2,3)

def keyword(a, b, c):
    print('keyword')
    print(f"a = {a} b = {b} c = {c}")
    print()

keyword(b = 1, c = 2, a = 3)

def default(a, b = 100, c = 200):
    print('default')
    print(f"a = {a} b = {b} c = {c}")    
    print()

default(1)
default(1, c = 3) # positonal argument must come before keyworded argument
default(1,2,3)


def variable(*args):
    print('variable arguments')
    print(args)
    print()

variable(2,1,3,4,4)
variable(1)
variable(2,1)
variable()
values = [1,2,3,4]
variable(values)
variable(*values) # unpacking


def var_keyword(**kwargs):
    print('variable keyword')
    print(kwargs)
    print()

var_keyword(a = 1, b = 2)
# var_keyword(1, 2)     # no positional argument allowed
values = dict(a = 1, b = 2)
var_keyword(**values)


def keyword_only(*, a, b, c):
    print('keyword only')
    print(f"a = {a} b = {b} c = {c}")    
    print()

# keyword_only(1,2,3)
keyword_only(a = 3, b = 2, c = 1)
# keyword_only('a', 'b', a = 3, b = 2, c = 1)

# When defining a function, normal positional arguments come first 
# (name), then any default arguments (name=value), then the variable 
# positional arguments (*name or simply *), then any keyword-only 
# arguments (either name or name=value form is good), and then any 
# variable keyword arguments (**name).

# On the other hand, when calling a function, arguments must be given 
# in the following order: positional arguments first (value), then 
# any combination of keyword arguments (name=value), variable 
# positional arguments (*name), and then variable keyword arguments 
# (**name).

def func(a, b, c=7, *args, **kwargs):
    print('a, b, c:', a, b, c)
    print('args:', args)
    print('kwargs:', kwargs)
 
func(1, 2, 3, *(5, 7, 9), **{'A': 'a', 'B': 'b'})
func(1, 2, 3, 5, 7, 9, A='a', B='b')

# Mutable Defaults

def func(a=[], b={}):
    # Both parameters have mutable default values. This means that, if 
    # you affect those objects, any modification will stick around in 
    # subsequent function calls.
    print(a)
    print(b)
    print('#' * 12)
    a.append(len(a))    # this will affect a's default value
    b[len(a)] = len(a)    # and this will affect b's one
 
func()
func()
func()

# fresh start with mutable defaults
def func(a=None):
    if a is None:
        a = []
    print(a)

    