# Generators are of two types:

#### Generator functions: 
# These are very similar to regular functions, 
# but instead of returning results through return statements, they 
# use 
# yield, which allows them to suspend and resume their state between 
# each call.

#### Generator expressions: 
# These are very similar to the list 
# comprehensions we've seen in this lesson, but instead of returning 
# a 
# list they return an object that produces results one by one.


# Genearator Functions

def get_squares(n):            # classic function approach
    return [x ** 2 for x in range(n)]
 
print(get_squares(10))
 
def get_squares_gen(n):        # generator approach
    for x in range(n):
        yield x ** 2        # we yield, we don't return
 
print(list(get_squares_gen(10)))  # result will same as above because list will exhaust the generator

squares = get_squares_gen(4)    # this creates a generator object
print(squares)

print(next(squares))  # prints: 0
print(squares.__next__())  # prints: 1 same as next(generator)
print(next(squares))  # prints: 4
print(next(squares))  # prints: 9
 
# the following raises StopIteration as the generator is exhausted...
# any further call to next will keep raising StopIteration

#######################
# print(next(squares))#
#######################

# when the amount of data you have to iterate over is so huge that 
# you cannot keep it all in memory in a list. In this case, generators are incredibly valuable: they make computations possible 
# what wouldn't be possible otherwise.

# So, in order to save memory (and time), use generator functions 
# whenever possible.


# It's also worth noting that you can use the return statement in a 
# generator function. It will produce a StopIteration exception to 
# be raised, effectively ending the iteration. 

def geometric_progression(a, q):
    k = 0
    while True:
        result = a * q**k
        if result <= 100000:
            yield result
        else:
            return
        k += 1
 
for n in geometric_progression(2, 5):
    print(n)


# The Yield From Expression

# without yield from
def print_squares(start, end):
    for n in range(start, end):
        yield n ** 2
 
for n in print_squares(2, 5):
    print(n)

# with yield from

def print_squares(start, end):
    yield from (n ** 2 for n in range(start, end))
 
for n in print_squares(2, 5):
    print(n)

w
# Generator Expressions
# like list comprehensions but with round brackets
# only one iteration allowed then will get exhausted

cubes = [k**3 for k in range(10)]        # regular list
print(cubes)
print(type(cubes))
print(cubes) # can reprint any number of time
 
cubes_gen = (k**3 for k in range(10))    # create as generator
print(cubes_gen)
print(type(cubes_gen))
 
print(_(cubes_gen))  # this will exhaust the generator
print(_(cubes_gen))  # nothing more to give

s1 = sum([n**2 for n in range(10**6)])  # list comprehension
# s2 and s3 are same, parenthesis are reduntant
s2 = sum((n**2 for n in range(10**6)))
s3 = sum(n**2 for n in range(10**6))


