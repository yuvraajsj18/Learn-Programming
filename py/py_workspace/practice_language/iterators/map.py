# The map function has the signature map(function, iterable, ...) and 
# returns an iterator that applies function to every item of iterable, 
# yielding the results. 

#################################
#           Example             #
#  print(list(map(lambda a: a * a * a, range(10))))
#                               #
#################################
# sorting students by descending grades with map function

from operator import attrgetter, itemgetter

students = [
    dict(id=0, credits=dict(math=9, physics=6, history=7)),
    dict(id=1, credits=dict(math=6, physics=7, latin=10)),
    dict(id=2, credits=dict(history=8, physics=9, chemistry=10)),
    dict(id=3, credits=dict(math=5, physics=5, geography=7)),
]

def decorate(student):
    student['sum'] = sum(student['credits'].values())
    return student

def undecorate(student):
    del student['sum']
    return student

students = sorted(map(decorate, students), key = itemgetter('sum') ,reverse = True)

students = list(map(undecorate, students))

for student in students:
    print(student)