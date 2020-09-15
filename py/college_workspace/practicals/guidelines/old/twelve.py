"""
Write a Python function that takes two strings as an input from the user and counts the
number of matching characters in the given pair of strings.
"""

def count_matching_chars(string1, string2):
    string1 = string1.lower()
    string2 = string2.lower()
    count_chars = 0
    for ch1 in string1:
        matched = False
        for ch2 in string2:
            if ch1 == ch2 and not matched:
                count_chars += 1
                matched = True
    return count_chars
        

string1 = input("Enter first string: ")
string2 = input("Enter second string: ")

print("Number of matching characters:", count_matching_chars(string1, string2))


"""
Enter first string: abcd
Enter second string: aacc
Number of matching characters: 2
------------------
Enter first string: abcd
Enter second string: cdef
Number of matching characters: 2
------------------
Enter first string: abcd
Enter second string: efgh
Number of matching characters: 0
------------------
Enter first string: cs50
Enter second string: cs50
Number of matching characters: 4
-----------------
Enter first string: ABCD
Enter second string: abcd
Number of matching characters: 4
"""

