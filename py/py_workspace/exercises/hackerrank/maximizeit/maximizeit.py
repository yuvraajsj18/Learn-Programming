"""
    Maximize It
    Problem from hackerrank: https://www.hackerrank.com/challenges/maximize-it/problem

    provided K list and a number M give the maximum value for -
    S = (f(x_1) + ... + f(x_k)) % M where f(x) = x^2
    and
    x is taken from list such that exactly one x belongs to each list
"""

from itertools import product # for doing cartesian product

# specific input as needed by program
def parseInput(input_string):
    parsed_input = list(map(int, input_string.split()))
    first = parsed_input[0] # this is an integers
    second = parsed_input[1 : ] # this is remaining list
    return first, second

def takeInput():
    k, m = parseInput(input())
    m = m[0]
    lists = [[] for i in range(k)]

    for line in range(k):
        number_of_elements, lists[line] = parseInput(input())
        assert len(lists[line]) == number_of_elements

    return m, lists

# using brute force to solve problem
def main():
    m, lists = takeInput()

    all_combination_of_x = list(product(*lists))
    all_x_squared = []
    for x in all_combination_of_x:
        all_x_squared.append(list(map(lambda x : x ** 2, x)))
    all_S = []
    for x in all_x_squared:
        all_S.append(sum(x) % m)

    s_max = max(all_S)

    print(s_max)    

    
if __name__ == "__main__":
    main()