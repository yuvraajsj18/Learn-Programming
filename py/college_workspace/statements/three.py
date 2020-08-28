import math

# a: 9 x 10

# print(9 x 10) # Error - x is not an operator
print(9 * 10)  # fixed


# b: 1 1/2 + 2 2/3
# print(1 1/2 + 2 2/3) # Error - space between ints
print((3 / 2) + (8 / 3))  # fixed


# c: 3cos(35)
# print(3cos35) # Error - * operator not used and cos is not a function
print(3 * math.cos(35))


# d: 8.31 x 10^9
# print(8.31 x 10 ^ 9) # Error - wrond operators
print(8.31 * 10 ** 9)  # fixed

# e: 7% + 8% + 9%
# print(7% + 8% + 9%) # Error - % is not percentage operator
print(7 / 100 + 8 / 100 + 9 / 100)

# f: (-)54.2 + 9.2
# print((-)54.2 + 9.2) # Error - parenthesis around -
print(-54.2 + 9.2)


# g: '5' / '4'
# print('5' / '4') # Error - string used
print(5 / 4)

# h: ln(e) - log(10)
# print(ln(e) - log(10)) # no such functions
print(math.log(math.e) - math.log10(10))
