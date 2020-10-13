"""
Write a Python program to sort the elements at odd positions in ascending order
and the elements at even positions in descending order.
Input​ : input_list = [7, 10, 11, 3, 6, 9, 2, 13, 0]
Output​ : [11, 3, 7, 9, 6, 10, 2, 13, 0]
"""

def sort_odd_even(numbers:list) -> list:
    """Sort elements at odd position in ascending order
    and elements at even position in descending order.
    Parameters:
        numbers: the given input list with numbers
    Returns:
        sorted_numbers: a sorted list as required
    """
    odd_pos = [element for i, element in enumerate(numbers, 0) if i & 1]
    even_pos = [element for i, element in enumerate(numbers, 0) if not i & 1]

    odd_pos.sort()
    even_pos.sort(reverse=True)

    sorted_list = []
    j, k = 0, 0
    for i in range(len(numbers)):
        if i & 1:
            sorted_list.append(odd_pos[j])
            j += 1
        else:
            sorted_list.append(even_pos[k])
            k += 1

    return sorted_list

def main():
    numbers = list(map(int, input("Enter a list of numbers: ").split()))

    sorted_numbers = sort_odd_even(numbers)
    print("Sorted list:", sorted_numbers)


if __name__ == "__main__":
    main()

"""Output:
Enter a list of numbers: 7 10 11 3 6 9 2 13 0
Sorted list: [11, 3, 7, 9, 6, 10, 2, 13, 0]
"""
