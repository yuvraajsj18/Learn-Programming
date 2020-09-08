def foo(my_list=[]):
    my_list.append('###')

    return my_list

foo()
foo()
print(foo())