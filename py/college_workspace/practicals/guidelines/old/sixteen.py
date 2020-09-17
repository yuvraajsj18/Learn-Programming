"""
Write a function that takes a list of numbers as input from the user and produces the
corresponding cumulative list where each element in the list present at index i is the
sum of elements at index j <= i.
"""

def get_cumulative_sum_list(list_:int) -> list:
    """Returns a cumulative sum of list members"""
    sum_list = [list_[0]]
    for num in list_[1: ]:
        sum_list.append(sum_list[-1] + num)

    return sum_list

list_ = list(map(float, input("Enter a list: ").split()))

sum_list = get_cumulative_sum_list(list_)

print(sum_list)

"""
Enter a list: 1 2 3 4
[1.0, 3.0, 6.0, 10.0]
"""
