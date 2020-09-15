"""
Write a menu driven program to perform the following on strings:
a)Find the length of string.
b)Return maximum of three strings.
c)Accept a string and replace all vowels with “#”
d)Find number of words in the given string.
e)Check whether the string is a palindrome or not.
"""

def main():
    while(True):
        print("Select an option:")
        print("1. Find the length of string.",
            "2. Return maximum of three strings.",
            "3. Accept a string and replace all vowels with '#'",
            "4. Find number of words in the given string.",
            "5. Check whether the string is a palindrome or not.",
            "6. Exit", sep="\n")

        choice = int(input("Enter your choice[1-6]: "))

        if choice == 1:
            find_length()
        if choice == 2:
            max_strings(3)
        if choice == 3:
            replace_vowels()
        if choice == 4:
            find_words()
        if choice == 5:
            is_plalindrome()
        if choice == 6:
            break

        print()
        print()
        
    
def find_length():
    string = input("Enter a string: ")
    print(f"Length of {string} is {len(string)}")

def max_strings(num_strings):
    print(f"Enter {num_strings} strings:")
    strings = []

    for i in range(num_strings):
        strings.append(input(f"Enter string {i + 1}: "))

    max_string =  sorted(strings, key=len, reverse=True)[0]

    print("Maximum string is", max_string)

def replace_vowels():
    string = input("Enter a string: ")
    new_string = ""
    for c in string:
        if c in 'aeiou':
            new_string += '#'
        else:
            new_string += c

    print("New string is:", new_string)

def find_words():
    string = input("Enter a string: ")
    count_words = 0
    for word in string.split():
        count_words += 1
    
    print("Number of words in given string is", count_words)

def is_plalindrome():
    string = input("Enter a string: ")
    if string == string[::-1]:
        print("String is palindrome")
    else:
        print("String is not palindrome")


if __name__ == "__main__":
    main()    
