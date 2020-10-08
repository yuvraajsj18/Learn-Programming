"""Functions for sorting
1. Bubble Sort
2. Selection Sort
3. Insertion Sort
"""

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


def main():
    """For testing the functions"""
    seq = list(map(int, input("Enter a sequence: ").split()))
    print('bubble sort:',bubble_sort(seq))

if __name__ == "__main__":
    main()


