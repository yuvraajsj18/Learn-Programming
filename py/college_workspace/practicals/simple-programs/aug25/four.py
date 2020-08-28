"""
    Write a python program to convert the distance (in feet) to inches, yards, and miles.
"""

distance_feet = float(input("Distance in feet: "))

distance_inches = distance_feet * 12
distance_yards = distance_feet / 0.3
distance_miles = distance_feet / 5280

print(
        f"Distance in inches {distance_inches : 0.4f}",
        f"Distance in yards {distance_yards : 0.4f}",
        f"Distance in miles {distance_miles : 0.4f}",
        sep="\n"
    )

"""
    Output:
            Distance in feet: 1
            Distance in inches  12.0000
            Distance in yards  3.3333
            Distance in miles  0.0002
"""
