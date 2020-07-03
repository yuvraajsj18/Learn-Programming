def get_multiples_of_five(n):
    return list(filter(lambda n : not n % 5, range(n)))

multiples = get_multiples_of_five(40)
print(multiples)

# def func_name([parameter_list]): return expression
func_name = lambda x, y, z = 0 : x + y + z
print(func_name(1,2,3))
print(func_name(1,2))

foo = lambda : print("Hello")
foo()

(lambda : print("Hello"))()

print(lambda : print("Hello"))