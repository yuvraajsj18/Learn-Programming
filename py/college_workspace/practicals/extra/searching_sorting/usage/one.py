"""
Given a list containing 0s, 1s and 2s randomly, 
write a Python program to sort the given list putting all 0s 
first followed by all 1s and then 2s.
"""

def sort012(numbers:list) -> list:
    return sorted(numbers)

def main():
    numbers = list(map(int, input("Enter a list containing 0s, 1s, and 2s: ").split()))
    sorted_numbers = sort012(numbers)
    print("Sorted numbers:", sorted_numbers)

if __name__ == "__main__":
    main()

"""OUTPUT:
Enter a list containing 0s, 1s, and 2s: 0 1 2 1 1 2 2 0 0 1 1 0 1 0 2
Sorted numbers: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2]
"""
