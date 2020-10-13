"""
Given a list of integers, write a program using recursion to check 
if it is sorted in ascending order or not. Duplicate values are allowed in 
the list and two consecutive equal values are considered sorted.
"""

def is_sorted(numbers:list) -> bool:
    """A recursive function return True if the list is sorted 
    in ascending order, False otherwise
    """
    if len(numbers) == 1:
        return True
    elif numbers[0] > numbers[1]:
        return False
    return is_sorted(numbers[1: ])

def main():
    numbers = list(map(int, input("Enter a list of integers: ").split()))

    if (is_sorted(numbers)):
        print("Your list is sorted in ascending order")
    else:
        print("Your list is not sorted in ascending order")

if __name__ == "__main__":
    main()

"""Output:
Enter a list of integers: 1 1 2 3 4 4 5
Your list is sorted in ascending order

---------------------------------------

Enter a list of integers: 1 3 2 4 5 6
Your list is not sorted in ascending order
"""
