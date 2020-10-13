"""
Write a Python program for the following problem -

Return the sum of the numbers in the list, except ignore sections
of numbers starting with a 6 and extending to the next 7
(every 6 will be followed by at least one 7). Return 0 for no
numbers.

sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
sum67([2, 3, 6, 4, 5, 7, 7]) → 12
"""

def sum67(numbers:list) -> list:
    """Return sum of numbers in the list,
    skip numbers between 6 and 7 including both
    """

    numbers_gen = (num for num in numbers)

    sum = 0
    for number in numbers_gen:
        if number == 6:
            while (number != 7):
                number = next(numbers_gen)
        else:
            sum += number

    return sum

def main():
    numbers = list(map(int, input("Enter a list of numbers: ").split()))
    sum67value = sum67(numbers)

    print("Sum without including numbers between 6 and 7(inclusive):", sum67value)

if __name__ == "__main__":
    main()


"""OUTPUT:
Enter a list of numbers: 2 3 6 4 5 7 7 
Sum without including numbers between 6 and 7(inclusive): 12
"""
