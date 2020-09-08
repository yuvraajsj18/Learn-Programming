"""
Write a Python function to produce the outputs such as:
a)      *
      * * *
    * * * * *
      * * *
        *
(b) 
        1
       232
      34543
     4567654
    567898765
"""

def pattern_a(lines):
    for i in range(lines // 2 + 1):
        for space in range(lines - 2 * i  + 1):
            print(" ", end="")
        for j in range(2 * i + 1):
            print('*', end=" ")
        print()
    for i in range(lines // 2 + 1, -1, -1):
        for space in range(lines - 2 * i  + 1):
            print(" ", end="")
        for j in range(2 * i + 1):
            print('*', end=" ")
        print()


def pattern_b(lines):
    gap = lines - 1
    for j in range(1, lines + 1): 
        num = j 
        for _ in range(1, gap + 1) : 
            print(" ", end="") 
        gap = gap - 1
            
        for _ in range(1, j + 1) : 
            print(num, end="") 
            num = num + 1
        
        num = num - 2
        for i in range(1, j) : 
            print(num, end="") 
            num = num - 1
        print()


lines = int(input("Enter number of lines: "))

pattern_a(lines)
pattern_b(lines)


"""
    Output:
    Enter number of lines: 5
      * 
    * * * 
  * * * * * 
* * * * * * * 
  * * * * * 
    * * * 
      * 
    1
   232
  34543
 4567654
567898765
"""