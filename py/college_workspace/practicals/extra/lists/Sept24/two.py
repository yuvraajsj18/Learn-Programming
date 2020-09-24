"""Write a Python program to check whether a list contains a given sublist."""

def list_contains(list1:list, list2:list) -> bool:
    """Returns True if list1 contains list2 otherwise False"""
    if list2 in list1:
        return True
    return False

list1 = [1, 2, 3, [100, 200], 4]
list2 = [100, 200]
list3 = [1, 2]

if list_contains(list1, list2):
    print("list1 contains list2")
else: 
    print("list1 does not contains list2")

if list_contains(list1, list3):
    print("list1 contains list3")
else:
    print("list1 does not contain list3")

"""
list1 contains list2
list1 does not contain list3
"""
