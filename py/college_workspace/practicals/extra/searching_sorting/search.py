"""Functions for searching
1. Linear Search
    1. Recursive implementation
    2. Iterative implementation
2. Binary Search
    1. Recursive implementation
    2. Iterative implementation
"""

def linear_search_iter(sequence, item) -> int:
    """Iterative linear search to take a sequence and
    return its positive index if found, otherwise -1.
    """
    for index in range(len(sequence)):
        if sequence[index] == item:
            return index
        
    return -1

def linear_search_rec(sequence, item, index=0) -> int:
    """Recursive linear search to take a sequence and
    return its positive index if found, otherwise -1
    """
    if len(sequence) == index:
        return -1
    elif sequence[index] == item:
        return index

    return linear_search_rec(sequence, item, index + 1)


def binary_search_iter(sequence, item) -> int:
    """Iterative binary search to take a sequence and
    return its positive index if found, otherwise -1.
    Note: the sequence must be sorted.
    """
    lower, upper = 0, len(sequence) - 1

    while lower <= upper:
        mid = (lower + upper) // 2
        if item == sequence[mid]:
            return mid
        elif item < sequence[mid]:
            upper = mid - 1
        else:
            lower = mid + 1
    
    return -1

def binary_search_rec(sequence, item) -> int:
    """Recursive binary search to take a sequence and
    return its positive index if found, otherwise -1.
    Note: the sequence must be sorted
    """

    return binary_search_rec_help(sequence, item, lower=0, upper=len(sequence) - 1)

def binary_search_rec_help(sequence, item, *, lower, upper) -> int:
    if lower > upper:
        return -1
    
    mid = (lower + upper) // 2
    if item == sequence[mid]:
        return mid
    elif item < sequence[mid]:
        return binary_search_rec_help(sequence, item, lower=lower, upper=mid-1)
    else:
        return binary_search_rec_help(sequence, item, lower=lower+1, upper=upper)

def main():
    """For testing the functions"""
    seq = tuple(map(int, input("Enter a sequence: ").split()))
    item = int(input("Enter a item: "))
    print("Linear search iterative:", linear_search_iter(seq, item))
    print("Linear search recursive:", linear_search_rec(seq, item))

    print("Sorted sequence is: ", sorted(seq))
    print("Binary search iteratively:", binary_search_iter(sorted(seq), item))
    print("Binary search recursively:", binary_search_rec(sorted(seq), item))

if __name__ == "__main__":
    main()
