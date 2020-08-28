# Question #4

A, B = True + 0, False + 0
print(A, B)

# Output -> 1, 0
# Reason - True is evaluated as 1 and False as 0

# Question #5
print(str(bool(1) + float(10) / float(2)))
# Output -> 6.0

str(bool(1) + float(10) / float(2))
# Output -> 6.0
# This will only output in python shell
# in scripts the value will be evaluated and ignored
