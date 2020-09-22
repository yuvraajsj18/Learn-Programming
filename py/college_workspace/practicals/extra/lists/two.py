"""Write a Python program to remove duplicates from a list."""

def remove_duplicates(alist:list) -> list:
    new_list = []
    for item in alist:
        if item not in new_list:
            new_list.append(item)

    return new_list


alist = input("Enter a list: ").split()

print("List without duplicates is", remove_duplicates(alist))

"""
Enter a list: 1 2 3 2 4 1
List without duplicates is ['3', '4', '2', '1']
"""
