"""Write a Python program to count the occurrences of each word in a given sentence"""

def count_word_freq(text:str) -> dict:
    text = text.lower()
    all_words = text.split()
    unique_words = set(all_words)

    word_count = {val:0 for val in unique_words}
    
    for word in all_words:
        word_count[word] += 1

    return word_count

text = input("Enter text: ")
word_count = count_word_freq(text)

sorted_word_count = sorted(word_count.items(), key=lambda word_count: word_count[1], reverse=True)
print()
for word, count in sorted_word_count:
    print(f"{word:20}{count:10}")
print()


"""
Sample Output:

Enter text: This is a line with this

this                         2
with                         1
line                         1
is                           1
a                            1
"""

