def f(l = []):
    print('l before id:', id(l))
    l.append("#")
    print('l after id:', id(l))
    print(l)

def g(l = None):
    print("lnone before id:", id(l))
    if l is None:
        l = []
    l.append("#")
    print("lnone after id:", id(l))
    print(l)

def h(t = ()):
    print("t before id:", id(t))
    t += ('#',)
    print("t after id:", id(t))
    print(t)

def f1(n = 1):
    print("n before id:", id(n))
    n += 1
    print("n after id:", id(n))
    print(n)

f()
f()
print()

g()
g()
print()

h()
h()
print()

f1()
f1()