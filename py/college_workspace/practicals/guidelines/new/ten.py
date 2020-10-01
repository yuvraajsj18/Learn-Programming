"""
Write a function that takes a sentence as input from user and calculate the frequency of each letter.
Use a variable of dictionary type and maintain the count.
"""

def freq_letter(sentence:str) -> dict:
    sentence = sentence.lower()
    unique_letters = set(sentence)

    frequency_letters = {val:0 for val in unique_letters if val != ' '}

    for letter in sentence:
        if letter != ' ':
            frequency_letters[letter] += 1

    return frequency_letters

sentence = input("Enter a sentence: ")
letter_freq = freq_letter(sentence)

print("Letter\tFrequency")
for letter, freq in letter_freq.items():
    print(f"{letter:5}{freq:5}")

"""
Enter a sentence: harry potter
Letter  Frequency
h        1
a        1
t        2
r        3
o        1
y        1
e        1
p        1
"""

