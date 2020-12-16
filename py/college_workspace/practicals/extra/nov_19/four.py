"""
You are given three integers x,y,z  and  representing the dimensions of a cuboid along 
with an integer n . Print a list of all possible coordinates given by (i,j,k) on 
a 3D grid where the sum of  (i+j+k) is not equal to n. Here 0<=i<=x, 0<=j<=y, 0<=k<=z 
"""

def sum_not_n(x, y, z, n):
    not_n_perms = [(i, j, k) for i in range(x + 1) for j in range(y + 1) for k in range(z + 1) if i + j + k != n]
    return not_n_perms


def main():
    x, y, z, n = eval(input("Enter x, y, z, n: "))

    not_n = sum_not_n(x, y, z, n)

    print(not_n)

if __name__ == "__main__":
    main()

"""
Enter x, y, z, n: (1, 1, 2, 3)
[(0, 0, 0), (0, 0, 1), (0, 0, 2), (0, 1, 0), (0, 1, 1), (1, 0, 0), (1, 0, 1), (1, 1, 0), (1, 1, 2)]
"""
