"""
Given a list containing tuples as its elements, 
write a program to remove all the tuples having only None as their values.

Input : input_list = [(None, 2), (None, None), (3, 4), (12, 3), (None, )] 
Output : [(None, 2), (3, 4), (12, 3)]
"""

def every(iterable:list, value:object) -> bool:
    """Return true if all values in iterable equals 'value'
    otherwise False
    """

    for val in iterable:
        if val != value:
            return False
    
    return True

def remove_none_tuple(tuples_list:list) -> list:
    """Receives a list of tuples and returns the list without tuples
    with only None value in it
    """

    without_none_tuple = [tup for tup in tuples_list if not every(tup, None)]

    return without_none_tuple

def main():

    input_list = [(None, 2), (None, None), (3, 4), (12, 3), (None, )]
    output_list = remove_none_tuple(input_list)

    print(output_list)

if __name__ == "__main__":
    main()

"""OUTPUT:
[(None, 2), (3, 4), (12, 3)]
"""
