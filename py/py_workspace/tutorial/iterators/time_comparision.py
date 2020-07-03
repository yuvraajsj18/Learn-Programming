from time import time

mx = 1000

# timing the for loop
t = time()
floop = []
for a in range(1, mx):
    for b in range(a, mx):
        floop.append(divmod(a, b))

print(f'for loop: {time() - t:.4f} s') # elapsed time

# timing the list comprehensions
t = time()
compr = [divmod(a, b) for a in range(1, mx) for b in range(a, mx)]

print(f'list comprehensions: {time() - t:.4f} s')

# timing the generator expressions
t = time()
gener = list(divmod(a, b) for a in range(1, mx) for b in range(a, mx))

print(f'generator expression: {time() - t:.4f} s')