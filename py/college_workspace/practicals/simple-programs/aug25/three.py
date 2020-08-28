"""
    Write a python program to compute the distance between the points
    (x1, y1) and (x2, y2).
"""

import math

x1 = float(input("x1 = "))
y1 = float(input("y1 = "))
x2 = float(input("x2 = "))
y2 = float(input("y2 = "))

distance = math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 -y1) * (y2 - y1)))
print(f"Distance = {distance : 0.4f}")


"""
    Output:
            x1 = -7
            y1 = -4
            x2 = 17
            y2 = 6.5
            Distance =  26.1964
"""
