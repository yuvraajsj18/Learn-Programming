"""
Write a function that reads a file file1 and displays the number of words and the
number of vowels in the file. 
"""

def count_words_vowels(filename:str) -> tuple:
    """Reads a file with 'filename' and returns a tuple with
    (number_of_words, number_of_vowels)
    """
    number_of_words = 0
    number_of_vowels = 0
    with open(filename) as file:
        for line in file:
            for word in line.split():
                number_of_words += 1
                for letter in word:
                    if letter in 'aeiou':
                        number_of_vowels += 1


    return number_of_words, number_of_vowels

def main():
    num_words, num_vowels = count_words_vowels('file1')

    print("Number of words =", num_words)
    print("Number of vowels =", num_vowels)

if __name__ == "__main__":
    main()

"""
Number of words = 17
Number of vowels = 28

---------------------
file1:
This is a file
This file's name is file1

This file contains words
those words contains vowels

"""
