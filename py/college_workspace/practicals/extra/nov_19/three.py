"""
Given a list of integers, return the difference between the largest and smallest integers in the list.
"""

def diff_largest_smallest(nums):
    return max(nums) - min(nums)

def main():
    nums = eval(input("Enter a number list: "))

    print("Difference between largest and smallest number:", diff_largest_smallest(nums))

if __name__ == "__main__":
    main()
