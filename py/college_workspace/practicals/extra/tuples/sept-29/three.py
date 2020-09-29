"""
Sort a tuple of tuples by 2nd item
tuple1 = (('a', 13),('b', 27),('c', 11), ('d',18))
Expected output:
(('c', 11), ('a', 13), ('d', 18), ('b', 27))
"""

def main():
    tup = (('a', 13), ('b', 27), ('c', 11), ('d', 18))

    sorted_tup = sorted(tup, key=lambda t: t[1])

    print("Sorted tuple:", sorted_tup)


if __name__ == "__main__":
    main()

"""
Sorted tuple: [('c', 11), ('a', 13), ('d', 18), ('b', 27)]
"""
