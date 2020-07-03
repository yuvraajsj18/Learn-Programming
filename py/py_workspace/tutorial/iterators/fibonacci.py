def fibonacci0(N):
    """Return all fibonacci numbers up to N"""
    result = [0]
    next_n = 1
    while next_n <= N:
        result.append(next_n)
        next_n = sum(result[-2 : ])
    return result

print(fibonacci0(0))
print(fibonacci0(1))
print(fibonacci0(50))

def fibonacci1(N):
    """ Generates fibonnaci numbers upto N"""
    yield 0
    if N == 0:
        return
    a = 0
    b = 1
    while b <= N:
        yield b
        a, b = b, a + b

print(list(fibonacci1(0)))
print(list(fibonacci1(1)))
for n in fibonacci1(50):
    print(n, end = " ")
print()



def fibonacci2(N):
    """ More readable fibonacci generator"""
    a, b = 0, 1
    while a <= N:
        yield a
        a, b = b, a + b

print(list(fibonacci2(0)))
print(list(fibonacci2(1)))
for n in fibonacci2(50):
    print(n, end = " ")
print()


def fibonacci_terms(N):
    """Generate fibonacci sequence upto N terms"""
    a, b = 0, 1
    terms = 0
    while terms < N:
        yield a
        a, b = b, a + b
        terms += 1

print(list(fibonacci_terms(3)))
print(list(fibonacci_terms(5)))
print(list(fibonacci_terms(10)))

