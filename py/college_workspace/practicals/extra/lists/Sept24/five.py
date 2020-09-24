"""
Given a list of numbers, return the list with all even numbers doubled, and all odd numbers
turned negative. [Use list comprehension]
"""

def transform(alist:list) -> list:
    """Given a list of numbers, return the list with all even numbers doubled, and all odd numbers
    turned negative.
    """
    transformed_list = [-num if num & 1 else num * 2 for num in alist]
    return transformed_list

alist = list(map(int, input("Enter a number list: ").split()))
print("Transformed list: ", transform(alist))

"""
Enter a number list: 1 2 3 4 5 6 7 8 9 10
Transformed list:  [-1, 4, -3, 8, -5, 12, -7, 16, -9, 20]
"""

