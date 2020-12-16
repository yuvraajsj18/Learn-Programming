import string

class Player:
    def __init__(self, name, score, startswith):
        self.name = name
        self.score = score
        self.startswith = startswith    

def find_num_substrings_startswith(string_, startswith):
    """Returns how many substring that starts with 
    'startswith' are present in the given string.
    """
    substrings_count = 0
    for i in range(len(string_)):
        if string_[i] in startswith:
            substrings_count += len(string_) - i
    return substrings_count
                
def minion_game(string_):
    vowels = 'AEIOU'
    consonants = "".join(set(string.ascii_uppercase) - set('AEIOU')) 

    kevin = Player('Kevin', 0, vowels)
    stuart = Player('Stuart', 0, consonants)
    
    kevin.score = find_num_substrings_startswith(string_, kevin.startswith)
    stuart.score = find_num_substrings_startswith(string_, stuart.startswith)
    
    if stuart.score == kevin.score:
        print('Draw')
    elif stuart.score > kevin.score:
        print("Stuart", stuart.score)
    else:
        print("Kevin", kevin.score)
    
if __name__ == '__main__':
    s = input()
    minion_game(s)