"""
1) Consider a tuple t1 = (1,2,5,7,9,2,4,6,8,10). Write a menu-driven program to perform the following operations:
    a) Print another tuple whose values are even numbers in the given tuple.
    b) Concatenate tuple t2 = (11,13,15) with t1.
    c) Return the maximum and minimum values from this tuple.
"""

def main():
    tup1 = tuple(map(int, input("Enter a tuple: ").split()))

    while (True):
        print(f"""Choose an option:
        1. Print another tuple whose values are even numbers in the given tuple.
        2. Concatenate tuple t2 with t1.
        3. Return the maximum and minimum values from this tuple.
        4. Exit""")

        choice = int(input("Choice: "))

        if choice == 1:
            even_tup = tuple(val for val in tup1 if not val & 1)
            print("Even values tuple:", even_tup)
        elif choice ==  2:
            tup2 = tuple(map(int, input("Enter another tuple: ").split()))
            tup_concat = tup1 + tup2
            print("Concatenated Tuple:", tup_concat)
        elif choice == 3:
            max_val = max(tup1)
            min_val = min(tup1)
            print("Maximum value:", max_val)
            print("Minimum value:", min_val)
        elif choice == 4:
            exit(0)
        else:
            print("Invalid choice")

if __name__ == "__main__":
    main()

"""
Enter a tuple: 1 2 5 7 9 2 4 6 8 10
Choose an option:
        1. Print another tuple whose values are even numbers in the given tuple.
        2. Concatenate tuple t2 with t1.
        3. Return the maximum and minimum values from this tuple.
        4. Exit
Choice: 1
Even values tuple: (2, 2, 4, 6, 8, 10)
Choose an option:
        1. Print another tuple whose values are even numbers in the given tuple.
        2. Concatenate tuple t2 with t1.
        3. Return the maximum and minimum values from this tuple.
        4. Exit
Choice: 2
Enter another tuple: 11 13 15
Concatenated Tuple: (1, 2, 5, 7, 9, 2, 4, 6, 8, 10, 11, 13, 15)
Choose an option:
        1. Print another tuple whose values are even numbers in the given tuple.
        2. Concatenate tuple t2 with t1.
        3. Return the maximum and minimum values from this tuple.
        4. Exit
Choice: 3
Maximum value: 10
Minimum value: 1
Choose an option:
        1. Print another tuple whose values are even numbers in the given tuple.
        2. Concatenate tuple t2 with t1.
        3. Return the maximum and minimum values from this tuple.
        4. Exit
Choice: 4
"""
