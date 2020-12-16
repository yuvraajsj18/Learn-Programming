"""
Given two .txt files that have lists of numbers in them, find the numbers 
that are overlapping. One .txt file has a list of all prime numbers under 1000, 
and the other .txt file has a list of odd numbers up to 1000.
"""

def find_commons(filename1, filename2):
    with open(filename1) as file1, open(filename2) as file2:
        nums1 = file1.read().split()
        nums2 = file2.read().split()

        common_nums = set(nums1) & set(nums2)

        return common_nums

def main():
    file1 = input("Enter filename 1: ")
    file2 = input("Enter filename 2: ")

    commons = find_commons(file1, file2)

    print(commons)

if __name__ == "__main__":
    main()
