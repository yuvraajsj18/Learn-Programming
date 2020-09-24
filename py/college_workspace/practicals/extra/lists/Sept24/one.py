"""
Write a menu-driven Python program to perform the following using list:
    - Check if all elements in the list are numbers or not.
    - If it is a numeric list, then count the number of odd values in it.
    - If the list contains strings,then display the largest string in the list.
    - Display the list in reverse form.
    - Find A Specified Element In List.
    - Accept 2 lists and find the common members in them.

    - Remove the specified member from the list
    - Sort the list in descending order
"""

def main():
    while (True):
        print("\nChoose an option: ", end="")
        print(f"""
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            """)
        choice = int(input("Enter Choice: "))

        if choice == 1:
            alist = input("Enter a list: ").split()
            if (all_numbers(alist)):
                print("All elements in the list are numbers.")
            else:
                print("Some elements in the list are not numbers.")
        elif choice == 2:
            alist = input("Enter a list: ").split()
            odd_count = count_odd_values(alist)
            if odd_count == -1:
                print("Not a numeric list")
            else:
                print("Number of odd values is", odd_count)
        elif choice == 3:
            alist = input("Enter a list: ").split()
            largest_string = get_largest_string(alist)
            if largest_string:
                print("Largest string is", largest_string)
            else:
                print("List contains no strings")
        elif choice == 4:
            alist = input("Enter a list: ").split()
            rev_list = get_reverse_list(alist)
            print("List in reverse order is", rev_list)
        elif choice == 5:
            alist = input("Enter a list: ").split()
            element = input("Enter an element to find: ")
            index = find_list(alist, element)
            if index != -1:
                print("Element found at index", index)
            else:
                print("Element not found in the list")
        elif choice == 6:
            list1 = input("Enter a list: ").split()
            list2 = input("Enter a list: ").split()
            common_list = find_common_members(list1, list2)
            print("Common members in the list are:", common_list)
        elif choice == 7:
            alist = input("Enter a list: ").split()
            to_remove = input("Enter a member to remove: ")
            alist.remove(to_remove)
            print(f"{to_remove} is removed from the list: {alist}")
        elif choice == 8:
            alist = input("Enter a list: ").split()
            alist.sort(reverse=True)
            print("Sorted list in descending order:", alist)
        elif choice == 9:
            exit(0)
        else:
            print("Invalid Choice.\nTry Again.")


        

def all_numbers(alist:list) -> bool:
    """Check if all elements in the list are numbers or not"""
    for item in alist:
        if not item.isdigit():
            return False
    return True

def count_odd_values(alist:list) -> int:
    """If it is a numeric list, then count the number of odd values in it"""
    if not all_numbers(alist):
        return -1   # not a numeric list
    count = 0
    for item in alist:
        if int(item) & 1:
            count += 1
    
    return count

def get_largest_string(alist:list) -> str:
    """If the list contains strings,then display the largest string in the list"""
    # get all strings from the list
    strings = tuple(filter(lambda item: type(item) is str, alist))
    if strings:
        return max(strings, key=len)
    
    return ""   # if no string in list

def get_reverse_list(alist:list) -> list:
    """Returns the list in reverse form"""
    return alist[::-1]

def find_list(alist:list, element:object) -> int:
    """Find A Specified Element In List"""
    for i in range(len(alist)):
        if alist[i] == element:
                return i
    return -1

def find_common_members(list1:list, list2:list) -> list:
    common_mem_list = [item for item in list1 if item in list2]
    return common_mem_list


if __name__ == "__main__":
    main()


"""
Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 1
Enter a list: 1 2 3
All elements in the list are numbers.

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 1
Enter a list: 1 a 1
Some elements in the list are not numbers.

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 2
Enter a list: 1 2 3 4 5
Number of odd values is 3

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 2
Enter a list: 1 a1 1
Not a numeric list

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 3
Enter a list: He who must not be named
Largest string is named

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 4
Enter a list: tom morvalo riddle
List in reverse order is ['riddle', 'morvalo', 'tom']

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 5
Enter a list: find me in the list
Enter an element to find: me
Element found at index 1

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 6
Enter a list: I will be common  
Enter a list: I am here
Common members in the list are: ['I']

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 7
Enter a list: remove me from this list
Enter a member to remove: me
me is removed from the list: ['remove', 'from', 'this', 'list']

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 8
Enter a list: a b c d e f g
Sorted list in descending order: ['g', 'f', 'e', 'd', 'c', 'b', 'a']

Choose an option: 
            1. Check if all elements in the list are numbers or not.
            2. If it is a numeric list, then count the number of odd values in it.
            3. If the list contains strings,then display the largest string in the list.
            4. Display the list in reverse form.
            5. Find A Specified Element In List.
            6. Accept 2 lists and find the common members in them.
            7. Remove the specified member from the list
            8. Sort the list in descending order
            9. Exit
            
Enter Choice: 9
"""