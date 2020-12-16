"""
Write a Python program to find numbers in a given string, store them 
in a list and display the numbers which are bigger than the length of the list in 
increasing order. Can use lambda expressions.
	
Original string:  sdf 23 safs8 5 sdfsd8 sdfs 56 21sfs 20 5
Numbers in sorted order: 20 23 56
"""

def get_nums(string:str) -> list:
    nums = []
    for word in string.split():
        if word.isdigit():
            nums.append(int(word))
        else:
            for letter in word:
                if letter.isdigit():
                    nums.append(int(letter))

    return nums

def main():
    string = input("Enter string: ")

    nums = get_nums(string)

    bigger_nums_length = list(filter(lambda num: num > len(nums), nums))
    bigger_nums_length.sort()
    print("Numbers in sorted order: ", *bigger_nums_length)

if __name__ == "__main__":
    main()
