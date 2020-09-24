"""
Given a sentence, return the sentence with all its letters transposed by 1 in the alphabet.
[Use list comprehension]
Sample -
Given - 'the quick brown fox jumps over the lazy dog'
Output - 'uif rvjdl cspxo gpy kvnqt pwfs uif mbay eph'
"""

def transpose(letter:str, increment:int) -> str:
    transposed_letter = chr(ord(letter) + increment)
    if transposed_letter > 'z':
        transposed_letter = chr(ord(transposed_letter) % ord('z') + ord('a') - 1)
    elif transposed_letter > 'Z' and transposed_letter < 'a':
        transposed_letter = chr(ord(transposed_letter) % ord('Z') + ord('A') - 1)
    return transposed_letter

def encode(sentence:str) -> str:
    """Returns the sentence with all its letters transposed by 1 alphabet"""
    inc = 1
    encoded_sentence = [transpose(letter, inc) if letter != ' ' else letter for letter in sentence]
    encoded_sentence = "".join(encoded_sentence)

    return encoded_sentence

sentence = input("Enter a sentence: ")
encoded_sentence = encode(sentence)

print("Encoded sentence: ", encoded_sentence)

"""
Enter a sentence: the quick brown fox jumps over the lazy dog
Encoded sentence:  uif rvjdl cspxo gpy kvnqt pwfs uif mbaz eph

--------------

Enter a sentence: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
Encoded sentence:  UIF RVJDL CSPXO GPY KVNQT PWFS UIF MBAZ EPH
"""
