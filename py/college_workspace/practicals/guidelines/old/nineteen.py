"""
Write a Python function that takes a dictionary of word:meaning pairs as an input from
the user and creates an inverted dictionary of the form meaning:list-of-words.
"""

def reverse_dict(d:dict) -> dict:
    return {v:k for k, v in d.items()}

word_mean = {}
num_words = int(input("Enter number of words: "))
for i in range(num_words):
    word = input("Enter word: ")
    meaning = input("Enter meaning: ")
    word_mean[word] = meaning

print("Word:Meaning dictionary is:", word_mean)

mean_word  = reverse_dict(word_mean)

print("meaning:word dictionary is", mean_word)

"""
Enter number of words: 3
Enter word: griffindore
Enter meaning: brave
Enter word: slytherine
Enter meaning: ambitious 
Enter word: ravenclaw
Enter meaning: intelligent
Word:Meaning dictionary is: {'griffindore': 'brave', 'slytherine': 'ambitious', 'ravenclaw': 'intelligent'}
meaning:word dictionary is {'brave': 'griffindore', 'ambitious': 'slytherine', 'intelligent': 'ravenclaw'}

"""
