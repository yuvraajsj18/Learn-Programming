"""
The try…except…else block is a minor modification of the traditional try…except block so that it can include an else block. The code in the else block is always executed if no error has occurred.
"""

try:
    with open('input1.txt', 'r') as myinputfile:
        for line in myinputfile:
            print(line)
except FileNotFoundError:
    print("Whoops! File does not exist.")
except ValueError:
    print("A value error occurred")
except Exception:
    print("Something unforeseen happened")
else:
    print("No error because file exists")
 
print("Execution will continue to here.")
