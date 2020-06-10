"""
    Hackerrank Problem Alphabet Rangoli
    https://www.hackerrank.com/challenges/alphabet-rangoli/problem
"""


def print_rangoli(size):
    """ prints the rangoli pattern """

    no_of_lines = 2 * size - 1

    actual_line = 0     # tracks number of character and dashes that is needed to be print
    for line in range(0, no_of_lines):
        # set limit of dashes and characters for printing
        no_of_dashes = 2 * (size - actual_line - 1)
        no_of_chars = 2 * actual_line + 1

        # print required number of dashes
        print("-" * no_of_dashes, end = "")

        # print required characters as per pattern
        actual_letter = 0
        for letter in range(0, no_of_chars):
            ch = ord('a') + (size - 1) - actual_letter
            print(chr(ch), end = "")

            # add a - between characters except last char
            if letter < no_of_chars - 1:
                print('-', end = "")

            # when printed half characters reduce actual_size
            if letter < no_of_chars // 2:
                actual_letter += 1;
            else:
                actual_letter -= 1

        # again print trailing dashes
        print("-" * no_of_dashes)

        # if printed half of required lines start reducing your characters
        if line < no_of_lines // 2:
            actual_line += 1
        else:
            actual_line -= 1
       


if __name__ == '__main__':
    n = int(input())
    print_rangoli(n)