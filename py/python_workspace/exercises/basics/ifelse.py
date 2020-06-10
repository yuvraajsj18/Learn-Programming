"""
    Hackerrank Python if-else problem
    https://www.hackerrank.com/challenges/py-if-else/problem
"""

def main():
    n = int(input())
    isWeird(n)

def isWeird(n):
    """ check if a number is weird on the basis of the specification given in question
    """
    if n & 1:   # if n is odd
        print("Weird")
    elif not n & 1 and n in range(2, 6):    # n is even in [2,5]
        print("Not Weird")
    elif not n & 1 and n in range(6, 21):   # n is even in [6, 20]
        print("Weird")
    else:
        print("Not Weird")

if __name__ == "__main__":
    main()