# with exception handling program will be halted on exception
"""
with open('input.txt', 'r') as inputFile:
    for line in inputFile:
        print(line)

print("Execution never gets here")
"""

try:
    with open('input.txt', 'r') as inputFile:
        for line in inputFile:
            print(line)
except FileNotFoundError:
    print("Whoops! File does not exist")

print("this will execute")


# handling exceptions as tuple
try:
    with open('input.txt', 'r') as myinputfile:
        for line in myinputfile:
            print(line)
except (FileNotFoundError, ValueError):
    print("Whoops! File does not exist.")
 
print("Execution will continue to here.")

# handling exceptions individually
try:
    with open('input.txt', 'r') as myinputfile:
        for line in myinputfile:
            print(line)
 
except FileNotFoundError:
    print("Whoops! File does not exist.")
except ValueError:
    print("A value error occurred")
except Exception:
    print("Something unforeseen happened")

print("this will execute")
