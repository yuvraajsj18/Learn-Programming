"""
    Hackerrank problem Capitalize!
    https://www.hackerrank.com/challenges/capitalize/problem
"""

def solve(fullname):
    capitalized_name = ""
    for word in fullname.split(" "):
        capitalized_name += word.capitalize() + " "

    return capitalized_name


if __name__ == "__main__":
    fullname = input()
    result = solve(fullname)
    print(result)