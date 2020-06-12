"""
    Hackerrank Problem List Comprehensions
    https://www.hackerrank.com/challenges/list-comprehensions/problem
"""

def solve(x, y, z, n):
    answer = [[i, j, k] for i in range(x + 1) for j in range(y + 1) for k in range(z + 1) if i + j + k != n]  

    return answer

if __name__ == '__main__':
    x = int(input())
    y = int(input())
    z = int(input())
    n = int(input())

    answer = solve(x, y, z, n)
    print(answer)