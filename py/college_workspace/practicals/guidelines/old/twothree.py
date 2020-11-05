# """
# Write a menu-driven program to create mathematical 3D objects
# Curve, Sphere, Cone, Arrow, Ring, Cylinder.
# """

# from visual import *

# def main():
#     while True:
#         print("Draw 3D objects")
#         print("""
#             1. Curve
#             2. Sphere
#             3. Cone
#             4. Arrow
#             5. Ring
#             6. Cylinder
#             7. Exit
#         """)

#         choice = int(input("choice: "))

#         if choice == 1:
#             points = eval(input("Enter a list of list with points: "))
#             radius = float(input("Enter radius: "))

#             curve(pos=points, radius=radius)

#         elif choice == 2:
#             center = eval(input("Enter center as (x,y,z): "))
#             radius = float(input("Enter radius"))

#             sphere(pos=center, radius=radius, color=color.cyan, opacity=0.75)

#         elif choice == 3:
#             center = eval(input("Enter center as (x, y, z): "))
#             axis = eval(input("Enter axis as (x, y, z): "))
#             radius = float(input("Enter radius"))

#             cone(pos=center, axis=axis, radius=radius)

#         elif choice == 4:
#             center = eval(input("Enter center as (x, y, z): "))
#             axis = eval(input("Enter axis as (x, y, z): "))
            
#             arrow(pos=center, axis=axis, shaftwidth=0.5, color=color.yellow, up=(0, 10, 20))

#         elif choice == 5:
#             axis = eval(input("Enter axis as (x, y, z): "))
#             radius = float(input("Enter radius"))

#             ring(axis=axis, radius=radius, thickness=0.15)

#         elif choice == 6:
#             center = eval(input("Enter center as (x, y, z): "))
#             axis = eval(input("Enter axis as (x, y, z): "))
#             radius = float(input("Enter radius"))

#             cylinder(pos=center, axis=axis, radius=radius)

#         elif choice == 7:
#             print("Exiting...")
#             exit(0)
#         else:
#             print("Invalid option")

