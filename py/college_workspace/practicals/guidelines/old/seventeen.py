"""
Write a function that takes n as an input and creates a list of n lists such that ith list
contains first five multiples of i. 
"""

def get_multiples_list(n:int) -> list:
    n_list = []
    for i in range(1, n + 1):
        i_list = [i * j for j in range(1, 6)]
        n_list.append(i_list)

    return n_list

n = int(input("Enter a number: "))
n_list = get_multiples_list(n)

print(n_list)

"""
Enter a number: 5
[[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15], [4, 8, 12, 16, 20], [5, 10, 15, 20, 25]]
"""