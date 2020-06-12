"""
    Hackerrank Problem String Formatting
    https://www.hackerrank.com/challenges/python-string-formatting/problem

    help : [[fill]align][sign][#][0][minimumwidth][.precision][type]
"""
from math import log2, floor

def print_formatted(n):
    width = floor(log2(n)) + 2

    for i in range(1, n + 1):
        print(f'{i : {width}d}{i : {width}o}{i : {width}X}{i : {width}b}')

if __name__ == '__main__':
    n = int(input())
    print_formatted(n)