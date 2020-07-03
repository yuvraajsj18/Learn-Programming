# zip(*iterables) returns an iterator of tuples, where the ith tuple 
# contains the ith element from each of the argument sequences or 
# iterables.

grades = [18, 23, 30, 27]
avgs = [22, 21, 29, 24]
print(list(zip(avgs, grades)))
print(list(map(lambda *a: a, avgs, grades)))  # equivalent to zip

# find max of each tuple from a list of tuple
a = [5, 9, 2, 4, 7]
b = [3, 7, 1, 9, 2]
c = [6, 8, 0, 5, 3]
max_each = list(map(max, zip(a, b, c)))
print(max_each)