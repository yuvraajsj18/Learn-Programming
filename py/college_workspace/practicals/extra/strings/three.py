"""Write a program to convert a hexadecimal number to decimal number"""

import time

def hex_to_dec(hex:str) -> int:
    """Converts hexadecimal number to decimal"""
    hex = hex.upper()
    hex_digits = ('0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F')
    hex_dec_map = {k:v for v, k in enumerate(hex_digits, 0)}

    dec_num = 0
    place = len(hex) - 1
    for digit in hex:
        dec_num += hex_dec_map[digit] * (16**place)
        place -= 1
        
    return dec_num

hex_num = input("Enter hexadecimal number: ")
dec_num = hex_to_dec(hex_num)
print("Decimal Number is", dec_num)

"""
Enter hexadecimal number: FF
Decimal Number is 255
"""
