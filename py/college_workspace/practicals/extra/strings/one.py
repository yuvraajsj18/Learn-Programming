"""
Write a Python program to get a single string from two given strings, separated by a space and swap the first two characters of each string.
"""

string1 = input("Enter first string: ")
string2 = input("Enter second string: ")

single_string = string2[:2] + string1[2:] + " " + string1[:2] + string2[2:]

print("Single string with swapped first character is", single_string)

"""
Enter first string: Hello
Enter second string: World
Single string with swapped first character is Wollo Herld
"""