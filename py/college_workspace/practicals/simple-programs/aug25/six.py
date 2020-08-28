"""
    Write a Python program which accepts the radius of a circle from the use
    and compute the area.
"""
from math import pi

radius_circle = float(input("Enter Radius: "))

area_circle = pi * radius_circle * radius_circle

print(f"Area of circle with radius {radius_circle} is {area_circle : 0.2f}")

"""
    Output:
            Enter Radius: 10
            Area of circle with radius 10.0 is  314.16
"""
