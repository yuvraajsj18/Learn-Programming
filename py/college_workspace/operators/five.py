"""
    What will be the output of the following statements?
    'a' * 20 is 'aaaaaaaaaaaaaaaaaaaa'
    'a' * 21 is 'aaaaaaaaaaaaaaaaaaaaa'
    Why is the output different?
"""

print('a' * 20 is 'aaaaaaaaaaaaaaaaaaaa')
print('a' * 21 is 'aaaaaaaaaaaaaaaaaaaaa')

"""
Output:

five.py:8: SyntaxWarning: "is" with a literal. Did you mean "=="?
  print('a' * 20 is 'aaaaaaaaaaaaaaaaaaaa')
five.py:9: SyntaxWarning: "is" with a literal. Did you mean "=="?
  print('a' * 21 is 'aaaaaaaaaaaaaaaaaaaaa')
True
True
"""

