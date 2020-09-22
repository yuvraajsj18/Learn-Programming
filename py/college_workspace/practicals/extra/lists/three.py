"""Write a Python program to get the difference between the two lists without using sets."""

def get_difference(list1:list, list2:list) -> list:
    diff_list = [item for item in list1 if item not in list2]
    return diff_list

list1 = input("Enter first list: ").split()
list2 = input("Enter second list: ").split()

diff_list = get_difference(list1, list2)

print("Difference between two list: ", diff_list)

"""
Enter first list: 1 2 3 4
Enter second list: 1 2
Difference between two list:  ['3', '4']
"""
