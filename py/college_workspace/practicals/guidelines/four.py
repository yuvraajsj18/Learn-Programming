"""
Write a function that takes the lengths of three sides: side1, side2 and side3 of the
triangle as the input from the user using input function and return the area of the
triangle as the output. Also, assert that sum of the length of any two sides is greater
than the third side
"""
from itertools import permutations
import math

def triangle_area(side1:float, side2:float, side3:float) -> float:
    """returns area of a triangle using sides"""
    assert side1 + side2 > side3, f"{side1} + {side2} is not bigger than {side3}"
    assert side2 + side3 > side1, f"{side2} + {side3} is not bigger than {side1}"
    assert side3 + side1 > side2, f"{side3} + {side1} is not bigger than {side2}"

    p = (side1+ side2 + side3) / 2
    area = math.sqrt(p * (p - side1) * (p - side2) * (p - side3))

    return area


def get_sides():
    side1 = float(input("Side 1: "))
    side2 = float(input("Side 2: "))
    side3 = float(input("Side 3: "))

    return side1, side2, side3

side1, side2, side3 = get_sides()

print(triangle_area(side1, side2, side3))


"""
Side 1: 24
Side 2: 30
Side 3: 18
216.0
"""
