"""
Write a Python program to concatenate and display each line from 
the first file with the corresponding line in the second file.
"""
from itertools import zip_longest
from os import sep

def concat_file_lines(filename1:str, filename2:str) -> None:
    """Concat corresponding lines from both files and display"""

    with open(filename1) as file1, open(filename2) as file2:
        lines1 = [line[:len(line) - 1] if line[len(line) - 1] == '\n' else line for line in file1.readlines()] # To remove the \n character from line
        lines2 = file2.readlines()

        for line1, line2 in zip_longest(lines1, lines2, fillvalue=""):
            print(line1, line2)

def main():

    file1 = input("Enter first file: ")
    file2 = input("Enter second file: ")

    concat_file_lines(file1, file2)

if __name__ == "__main__":
    main()

"""OUTPUT
Enter first file: numbers.txt
Enter second file: numbers10.txt
One Eleven

Two Twelve

Three Thirteen

Four Fourteen

Five Fiveteen

Six Sixteen

Seven Seventeen

Eight Eighteen

Nine Nineteen

Ten Twenty
Eleven 
Twelve 
Thirteen 
Fourteen 
Fiveteen 
Sixteen 
Seventeen 
Eighteen 
Nineteen 
Twenty 
"""
