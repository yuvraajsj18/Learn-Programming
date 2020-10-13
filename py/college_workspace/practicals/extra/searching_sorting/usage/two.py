"""
Given a list of distinct integers and a range [start, end], 
find all the numbers that are in the range, but not in the list. 
The missing elements should be printed in sorted order.

Input: input_list = [10, 12, 11, 15], 
       start = 10, end = 15
Output: 13, 14
"""

def find_missing_elements(numbers:list, start:int, end:int) -> list:
    """Find missing elements in the 'numbers' list
    that are not in the given range of [start, end]
    """
    missing_elements = [element for element in range(start, end+1) if element not in numbers]
    return sorted(missing_elements)

def main():
    numbers = list(map(int, input("Enter a list containing numbers: ").split()))
    start = int(input("Enter start: "))
    end = int(input("Enter end: "))

    missing_numbers = find_missing_elements(numbers, start, end)

    print("Missing numbers are:", end=" ")
    for number in missing_numbers:
        print(number, end=" ")
    print()

if __name__ == "__main__":
    main()

"""OUTPUT:
Enter a list containing numbers: 10 12 11 15
Enter start: 10
Enter end: 15
Missing numbers are: 13 14 
"""
