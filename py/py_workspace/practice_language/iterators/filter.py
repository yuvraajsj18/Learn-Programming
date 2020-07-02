# filter(function, iterable) construct an iterator from those elements 
# of iterable for which function returns True. iterable may be either 
# a sequence, a container which supports iteration, or an iterator. If 
# function is None, the identity function is assumed, that is, all 
# elements of iterable that are false are removed.

test = [2, 5, 8, 0, 0, 1, 0]
print(_(filter(None, test)))
print(_(filter(lambda x: x, test)))        # equivalent to previous one
print(_(filter(lambda x: x > 4, test)))    # keep only items > 4

