"""
    Write a Python program to calculate surface volume and area of a cylinder.
    (Use input() function and other necessary constants and functions from the math
    module)
"""

import math

radius_cylinder = int(input("Enter radius of cylinder: "))
height_cylinder = int(input("Enter height of cylinder: "))

volume_cylinder = math.pi * radius_cylinder * radius_cylinder * height_cylinder
area_cylinder = 2 * math.pi * radius_cylinder * height_cylinder + \
                2 * math.pi * radius_cylinder * radius_cylinder

print(f"Volume of cylinder is {volume_cylinder : 0.4f} m^2")
print(f"Area of cylinder is {area_cylinder : 0.4f} m^2")
