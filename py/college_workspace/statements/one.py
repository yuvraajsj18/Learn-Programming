import math

# 1 a

a, b, c = 50, 51, 10
root1 = (-b + math.sqrt(b * b - (4 * a * c))) / (2 * a)
print(root1)

# 1 b
x, y = 50, 51
result = (((2 * x * y) - (9 * y)) / (2 * x * y ** 3)) - \
    ((4 * y * x * x) / (2 * y))
print(result)

# 1 c
x, y, v = 90, 45, 10
result = (2 * math.cos((x + y) / 2) * math.cos((x - y) / 2)) + \
    (math.e ** x - 1 - (x / 4) + math.tan(x)) - math.log(v)
print(result)
