"""
Given a list of integers, write a program to display all the elements 
whose digits are in increasing order.


Input : test_list = [1234, 7373, 3643, 3527, 148, 49] 
Output : [1234, 148, 49]
"""

def digits_increasing(integers:list) -> list:
    """Returns a list with integers whose digits are in increasing order"""

    increasing_integers = [integer for integer in integers if "".join(sorted(str(integer))) == str(integer)]

    return increasing_integers

def main():

    integers = list(map(int, input("Enter a list of integers: ").split()))

    output_list = digits_increasing(integers)

    print(output_list)

if __name__ == "__main__":
    main()

"""OUTPUT
Enter a list of integers: 1234 7373 3643 3527 148 49
[1234, 148, 49]
"""

"""ALTERNATE SOLUTION
def digits_increasing(integers:list) -> list:

    increasing_integers = []

    for num in integers:
        num = str(num)
        for i in range(len(num) - 1):
            if num[i] > num[i + 1]:     # If out of order
                break
        else:
            increasing_integers.append(int(num))

    return increasing_integers
"""

