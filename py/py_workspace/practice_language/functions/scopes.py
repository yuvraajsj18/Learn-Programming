def outer():
    test = 1
    test1 = 100

    def inner():
        nonlocal test # refers to enclosing scope excluding global scope
        test = 2
        test1 = 200
        print('inner: test = ', test)
        print('inner: test1 = ', test1)
    
    inner()
    print('outer: test = ', test)
    print('outer: test1 = ', test1)

test = 0
outer()
print('global:', test)

def my_function():
    global test # refers to global scope
    test = 3
    print('my_function:', test)

my_function()
print('global:', test)
