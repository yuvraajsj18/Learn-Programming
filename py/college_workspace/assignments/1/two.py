"""PROBLEM:
Write a Python program for the following problem:

You are given a string S
S contains alphanumeric characters only.

Your task is to SORT the string S in the following manner:
    - All sorted lowercase letters are ahead of uppercase letters.
    - All sorted uppercase letters are ahead of digits.
    - All sorted odd digits are ahead of sorted even digits.
Input Format:
    A single line of input contains the string S
Constraints:
    0 < len(S) < 1000
Output Format:
    Output the sorted string S
Sample Input:
    Sorting1234
Sample Output:
    ginortS1324
"""

def sorting_criteria(element):
    # Low number means high priority
    priority = {
        'lower': 1,
        'upper': 2,
        'odd': 3,
        'even': 4,
    }
    if element.islower():
        return priority['lower'], element   # returing a tuple for default sorting when same priority
    elif element.isupper():
        return priority['upper'], element
    elif element.isdigit() and int(element) & 1:
        return priority['odd'], element
    elif element.isdigit() and not int(element) & 1:
        return priority['even'], element
        
def sort_alphanumeric(string:str) -> str:
    """Sort a string with this criteria:
    - All sorted lowercase letters are ahead of uppercase letters.
    - All sorted uppercase letters are ahead of digits.
    - All sorted odd digits are ahead of sorted even digits.
    """
    return "".join(sorted(string, key=sorting_criteria))


def main():
    string = input("Enter a string: ")
    sorted_string = sort_alphanumeric(string)

    print("Sorted string is", sorted_string)

if __name__ == "__main__":
    main()

"""OUTPUT:
Enter a string: Sorting1234
Sorted string is ginortS1324
"""
