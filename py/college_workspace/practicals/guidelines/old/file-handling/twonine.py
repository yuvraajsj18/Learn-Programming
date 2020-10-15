"""
Write a function that reads a file file1 and copies only alternative lines to another file
file2. Alternative lines copied should be the odd numbered lines.
"""

def copy_alternate(file1:str, file2:str) -> None:
    """Copies alternate lines of file1 to file2"""

    with open(file1) as input, open(file2, 'w') as output:
        lines = input.readlines()

        for line_num, line in enumerate(lines, 1):
            if line_num & 1:
                output.write(line)
        

copy_alternate('file1', 'file2')

"""
File1:

Line 1
Line 2
Line 3
Line 4
Line 5

File2:

Line 1
Line 3
Line 5
"""

