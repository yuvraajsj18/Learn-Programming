"""Write a Python program to generate all permutations of a list."""

from itertools import permutations

def permute(alist:list) -> list:
    return list(permutations(alist))

alist = input("Enter a list: ").split()

print("Permutations:")
for l in permute(alist):
    print(l)

"""
Enter a list: 1 2 3
Permutations:
('1', '2', '3')
('1', '3', '2')
('2', '1', '3')
('2', '3', '1')
('3', '1', '2')
('3', '2', '1')
"""
