"""
Write a function that takes two numbers as input parameters and returns their least
common multiple and highest common factor
"""

def eval_lcm(num1:int, num2:int) -> int:
    start = num1 if num1 > num2 else num2
    while start % num1 or start % num2:
        start += 1
    
    return start

def eval_hcf(num1:int, num2:int) -> int:

   while(num2):
       num1, num2 = num2, num1 % num2
   return num1

   
def get_lcm_gcd(num1:int, num2:int) -> int:
    lcm = eval_lcm(num1, num2)
    hcf = eval_hcf(num1, num2)

    return lcm, hcf

num1 = int(input("Number 1: "))
num2 = int(input("Number 2: "))

lcm, hcf = get_lcm_gcd(num1, num2)

print("LCM =", lcm)
print("HCF =", hcf)

"""
Number 1: 20
Number 2: 18
LCM = 180
HCF = 2
"""

