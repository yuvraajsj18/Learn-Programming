"""Write a Python function to return nth terms of Fibonacci sequence"""

def fibonacci_n(n: int) -> int:
    """Returns nth term of fibonacci sequence"""
    if n == 1:
        return 0
    if n == 2:
        return 1
    
    return fibonacci_n(n - 1) + fibonacci_n(n - 2)

for i in range(1, 10):
    print(fibonacci_n(i))


"""
0
1
1
2
3
5
8
13
21
"""