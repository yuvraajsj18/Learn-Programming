"""
Write a Python program to unzip a list of tuples into individual lists.
Sample:
Input: [(1,2),(3,4),(‘hi’,’hello’)]
Expected Output: [1,2] [3,4] [‘hi’,’hello’]
"""

def main():
    list_tup = list(map(tuple, map(str.split, input("Enter a list of tuples(tuples separated by commas): ").split(','))))
    print("You entered:", list_tup)

    lists = []
    for tup in list_tup:
        lists.append(list(tup))

    print("Unzipped tuples into list:")
    for l in lists:
        print(l, end="")
    print()

if __name__ == "__main__":
    main()

"""
Enter a list of tuples(tuples separated by commas): 1 2, 3 4, hi hello
You entered: [('1', '2'), ('3', '4'), ('hi', 'hello')]
Unzipped tuples into list:
['1', '2']['3', '4']['hi', 'hello']
"""
