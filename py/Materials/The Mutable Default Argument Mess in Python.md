# The Mutable Default Argument Mess in Python

Meet Kevin, :boy: Kevin has just started to learn programming with Python. One day he was given a problem to solve as follows:

> Design a function that appends '#' to a list provided as argument and then prints it. If no argument is provided than the function should use empty list as a default.

Kevin quickly comes up with the following solution:

```python
def append(l = []):
    l.append('#')
    print(l)
```

Looks good, time for testing the solution:

```python
append([1, 2, 3])
# OUTPUT: [1, 2, 3, '#'] | OK

append()
# OUTPUT: ['#']	| OK

append()
# OUTPUT: ['#', '#']  | Strange!!
```

- The first call to `append` worked fine. It added **#** to the list `[1, 2, 3]` and then printed it.

- The second also worked as expected. This time no list is provided as argument, so it used the default empty list and appended a **#** to it.

- Now, the third call resulted in something unexpected.

  When we once again called the `append` without argument, it printed `['#', '#']` instead of `['#']` as we got in the above call.

# Problem

Now, Kevin search the Google for the problem and found that 

