"""Functions for sorting
1. Bubble Sort
2. Selection Sort
3. Insertion Sort
"""

import unittest

def bubble_sort(sequence:list) -> list:
    """Accept an iterable and sort it using bubble sort"""
    seq_len = len(sequence)
    while (True):
        swapped = False
        
        for i in range(seq_len - 1):
            if sequence[i] > sequence[i + 1]:
                sequence[i], sequence[i + 1] = sequence[i + 1], sequence[i]
                swapped = True
        seq_len -= 1

        if swapped == False:
            break

    return sequence

def selection_sort(sequence:list) -> list:
    """Accepts an iterable and sort it using selection sort"""
    for i in range(len(sequence) - 1):
        min = i
        for j in range(i + 1, len(sequence)):
            if sequence[j] < sequence[min]:
                min = j
        if sequence[i] != sequence[min]:
            sequence[i], sequence[min] = sequence[min], sequence[i]

    return sequence

def insertion_sort(sequence:list) -> list:
    """Accepts an iterable and sort it using insertion sort"""
    for i in range(1, len(sequence)):
        to_sort = sequence[i]
        
        j = i - 1
        while j >= 0 and sequence[j] > to_sort:
            sequence[j + 1] = sequence[j]
            j -= 1
        
        sequence[j + 1] = to_sort

    return sequence

def main():
    """For testing the functions"""
    seq = list(map(int, input("Enter a sequence: ").split()))

    print('bubble sort:', bubble_sort(list(seq)))

    print('selection sort:', selection_sort(list(seq)))

    print('insertion sort:', insertion_sort(list(seq)))

if __name__ == "__main__":
    main()


# Test cases for all sorts



