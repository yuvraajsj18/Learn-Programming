"""Problem:
There is an array of n integers. There are also 2 disjoints sets,
A and B, each containing m integers. You like all the integers in set A
and dislike all the integers in set B.
Your initial happiness is 0. For each i integer in the array, if i belongs
to A, you add 1 to your happiness, if i belongs to B, you add -1 to your
happiness. Otherwise, your happiness does not change.
Output your final happiness at the end.

NOTE: 
    - A and B are Sets, no repeated elements.
    - The array might contain duplicate elements.
CONSTRAINTS:
    - 1 <= n <= 10^5
    - 1 <= m <= 10^5
    - 1 <= any number in the input <= 10^9
INPUT FORMAT:
    - The first line contains integers n and m separated by a space.
    - The second line contains n integers, the elements of the array.
    - The third and fourth line contains m integers, A and B, respectively.
OUTPUT FORMAT:
    - Output a single integer, your total happiness.
SAMPLE INPUT:
    3 2
    1 5 3
    3 1
    5 7
SAMPLE OUTPUT:
    1
"""

def calculate_happiness(numbers:list, numbers_liked:set, numbers_disliked:set) -> int:
    """Return happiness calculated as
    happiness + 1 for common numbers in numbers and numbers_liked
    happiness - 1 for common numbers in numbers and numbers_disliked
    """

    numbers_liked = set(numbers_liked)  # In case a set is not passed
    numbers_disliked = set(numbers_disliked) # In case a set is not passed

    common_liked = len(numbers_liked.intersection(numbers))
    common_disliked = len(numbers_disliked.intersection(numbers))

    happiness = common_liked - common_disliked

    return happiness


def main():
    n, m = map(int, input().split())

    numbers = list(map(int, input().split(maxsplit=n-1)))

    A = set(map(int, input().split(maxsplit=m-1)))
    B = set(map(int, input().split(maxsplit=m-1)))

    happiness = calculate_happiness(numbers, A, B)

    print(happiness)

if __name__ == "__main__":
    main()

"""OUTPUT
3 2 
1 5 3
3 1
5 7
1
"""
