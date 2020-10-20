"""
Write a Python program to read the last n lines of a file and 
write it to another file.
"""

def copy_last_lines(source_filename:str, target_filename:str, n_lines:int) -> None:
    """Write last n lines from source file to target file"""
    with open(source_filename) as source, open(target_filename, 'w') as target:
        lines = source.readlines()
        target.writelines(lines[len(lines) - n_lines: ])    # Last n lines
    
def main():
    file1 = input("Enter source filename: ")
    file2 = input("Enter target filename: ")
    num_lines = int(input("Enter number of last lines: "))

    copy_last_lines(file1, file2, num_lines)

    print(f"Copied last {num_lines} lines from source file to target file")

if __name__ == "__main__":
    main()

"""OUTPUT
Enter source filename: numbers.txt
Enter target filename: numbers10.txt
Enter number of last lines: 10
Copied last 10 lines from source file to target file

----------------------------------------------------------
numbers.txt ------------>
One
Two
Three
Four
Five
Six
Seven
Eight
Nine
Ten
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
----------------------------------------------------------
numbers10.txt ---------------->
Eleven
Twelve
Thirteen
Fourteen
Fiveteen
Sixteen
Seventeen
Eighteen
Nineteen
Twenty⏎   
"""
