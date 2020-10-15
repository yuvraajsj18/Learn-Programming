"""
Write a Python function that copies the content of one file to another.
"""

def copy_file(file1:str, file2:str) -> None:
    """Copies of content of file1 into file2"""

    with open(file1) as input, open(file2, 'w') as output:
        content1 = input.read()
        output.write(content1)
    

copy_file('file1', 'file2')

"""
File1:

Line 1
Line 2
Line 3
Line 4
Line 5

File2:

Line 1
Line 2
Line 3
Line 4
Line 5
"""
