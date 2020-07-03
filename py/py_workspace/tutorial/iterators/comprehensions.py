# List comprehensions

squares = [n ** 2 for n in range(10)]
print(squares)

sq_even = [n ** 2 for n in range(10) if not n & 1]                          

# nested list comprehensions

items = 'ABCD'
 
pairs = []
for a in range(len(items)):
    for b in range(a, len(items)):
        pairs.append((items[a], items[b]))
 
print(pairs)

# same thing with nested comprehensions

items = 'ABCD'
 
pairs = [(items[a], items[b]) for a in range(len(items)) for b in range(a, len(items))]
 
print(pairs)

# map and filter with list comhrehensions

from math import sqrt
 
mx = 10
triples = [(a, b, sqrt(a**2 + b**2))
           for a in range(1, mx) for b in range(a, mx)]
triples = filter(
    lambda triple: triple[2].is_integer(), triples)
 
# this will make the third number in the tuples integer
triples = list(map(
    lambda triple: triple[:2] + (int(triple[2]),), triples))
 
print(triples)

# same can be done in a better way like this

from math import sqrt
 
# this step is the same as before
mx = 10
triples = [(a, b, sqrt(a**2 + b**2))
           for a in range(1, mx) for b in range(a, mx)]
 
# here we combine filter and map in one CLEAN list comprehension
triples = [(a, b, int(c)) for a, b, c in triples if c.is_integer()]
print(triples)

# dict comhrehensions

from string import ascii_lowercase

lettermap = dict((c, k) for c, k in enumerate(ascii_lowercase, 1))
print(lettermap)

# another way
lettermap = {c: k for k,c in enumerate(ascii_lowercase, 1)}
print(lettermap)

# Set Comprehesion

word = 'Hello'

letters1 = set(c for c in word)
letters2 = {c for c in word}
print(letters1)
print(letters2)