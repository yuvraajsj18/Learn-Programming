"""Write a Python program to generate all sublists of a list."""

from itertools import combinations

def get_sublists(alist:list) -> list:
    super_list = []
    for i in range(len(alist) + 1):
        for comb in combinations(alist, i):
            super_list.append(list(comb))

    return super_list

alist = input("Enter a list: ").split()
all_sublists = get_sublists(alist)

print("All sublist of your list are:", all_sublists)

"""
Enter a list: a b c
All sublist of your list are: [[], ['a'], ['b'], ['c'], ['a', 'b'], ['a', 'c'], ['b', 'c'], ['a', 'b', 'c']]
"""