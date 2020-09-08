import sys

n = len(sys.argv)
print("num of args =", n)

print("Name of py script:", sys.argv[0])

for arg in sys.argv[1:]:
    print(arg, end=" ")

