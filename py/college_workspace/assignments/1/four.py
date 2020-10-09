"""
Given a nested list, convert it into a dictionary with elements from the first list
element serving as keys and subsequent list elements acting as their corresponding values.
Input​ : input_list = [[4, 5, 7], [10, 8, 4], [19, 4, 6], [9, 3, 6]]
Output​ : {4: [10, 19, 9], 5: [8, 4, 3], 7: [4, 6, 6]}

Samples: 
[[4, 5, 7], [1, 2, 3], [1, 2]]
{
    4: [1, 1],
    5: [2, 2],
    7: [3],
}

[[1, 2], [1, 2, 3], [4, 5, 6]]
{
    1: [1, 4]
    2: [2, 5]
}

[[4, 5, 7], [1, 2], [1, 2]]
{
    4: [1, 1],
    5: [2, 2],
    7: [],
}

"""

def lists_to_dict(lists:list) -> dict:  # SOLUTION
    """convert a list of lists into a dictionary by using
    values from first list as keys and list of corresponding values from other
    lists as value of that key.
    
    Parameters:
        lists: a list of lists, [[4, 5, 7], [10, 8, 4], [19, 4, 6], [9, 3, 6]]
    Returns:
        adict: a dict formed through lists, {4: [10, 19, 9], 5: [8, 4, 3], 7: [4, 6, 6]}
    """

    adict = {key:[] for key in lists[0]}
    
    for index, key in enumerate(adict.keys(), 0):
        for list in lists[1: ]:
            if index < len(list):
                adict[key].append(list[index])

    return adict

def main():
    input_list = [[4, 5, 7], [10, 8, 4], [19, 4, 6], [9, 3, 6]]
    output_dict = lists_to_dict(input_list)
    assert output_dict == {4: [10, 19, 9], 5: [8, 4, 3], 7: [4, 6, 6]}
    print(output_dict)
    print()

    input_list = [[4, 5, 7], [1, 2, 3], [1, 2]]
    output_dict = lists_to_dict(input_list)
    print(output_dict)
    print()

    input_list = [[1, 2], [1, 2, 3], [4, 5, 6]]
    output_dict = lists_to_dict(input_list)
    print(output_dict)
    print()

    input_list = [[4, 5, 7], [1, 2], [1, 2]]
    output_dict = lists_to_dict(input_list)
    print(output_dict)

if __name__ == "__main__":
    main()

"""Output:
{4: [10, 19, 9], 5: [8, 4, 3], 7: [4, 6, 6]}

{4: [1, 1], 5: [2, 2], 7: [3]}

{1: [1, 4], 2: [2, 5]}

{4: [1, 1], 5: [2, 2], 7: []}
"""
