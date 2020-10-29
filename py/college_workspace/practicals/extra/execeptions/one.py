"""
Add exception handling to the get_value() function so that, 
if an IndexError exception occurs because the specified index does
not exist, the function returns the keyword None. 
Do not handle any other types of exceptions.

def get_value(data_list, index):
    return data_list[index]

# Sample list data
my_list = ['a', 'b', 'c']
"""

def get_value(data_list:list, index:int):
    """Return value at index, if index does not exists
    then return None
    """
    try:
        return data_list[index]
    except IndexError:
        return None

def test_get_value():
    """Test the get value function with hard coded values"""
    my_list = ['a', 'b', 'c']

    assert get_value(my_list, 0) == 'a'
    assert get_value(my_list, 1) == 'b'
    assert get_value(my_list, 2) == 'c'
    assert get_value(my_list, 3) == None

def main():
    test_get_value()

    my_list = ['a', 'b', 'c']

    print(get_value(my_list, 0))
    print(get_value(my_list, 1))
    print(get_value(my_list, 2))
    print(get_value(my_list, 3))

if __name__ == "__main__":
    main()

"""OUTPUT
a
b
c
None
"""
