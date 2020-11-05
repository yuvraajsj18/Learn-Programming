"""
Write a program that makes use of a function to accept a list of n 
integers and displays a histogram.
"""

import matplotlib.pyplot as plt

def display_histogram(integers:list) -> None:
    """Display a histogram using integers"""

    plt.hist(integers)
    plt.xlabel("integers")
    plt.ylabel("frequency")
    plt.title("Histogram")
    plt.xlim(min(integers) - 1, max(integers) + 1)
    plt.show()
    plt.savefig("twelve")

def main():
    integers = eval(input("Enter integers in a list: "))
    display_histogram(integers)

if __name__ == "__main__":
    main()
