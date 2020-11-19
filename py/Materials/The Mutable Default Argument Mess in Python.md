# The Mutable Default Argument Mess in Python

Meet Kevin, :boy: Kevin is learning Python. One day he was given a problem to solve as follows:

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



# Why this happened?

The reason this happened is because Python defines its default argument *only once when the function is first defined.*

This is because python is parsed line by line, when the parser encounters `def` it sets the default argument to a value and that value is used in every future call.

This behaviour of Python becomes of special concern when the default argument is a **mutable**.

As the value of **immutables** can not be changed, if you update the argument variable inside the function it will create a new object and start pointing to that object instead of changing the original default object.

But in case of mutable default argument, the object created at the time of parsing the function is updated instead of creating a different object for that function call.



## Solution

The solution to this problem is to use an immutable default argument instead of mutable. The preferred choice is `None` (though you can choose any immutable value).

```python
def append(l = None):
    if l is None:
        l = []
    l.append('#')
    print(l)
```

Let's test this solution -

```python
append([1, 2, 3])
# OUTPUT: [1, 2, 3, '#']	| OK

append()
# OUTPUT: ['#'] 	| OK

append()
# OUTPUT: ['#']		| Works fine!
```

Great! this solution worked as expected.

But why? Let's take a look inside..



## Why the solution works?

Watch this video to find out what happened in the **wrong version** of the code -

%[https://youtu.be/NAEQd0HFxyQ]

As, you can see, in this case the original `l` was modified instead of creating a new `l`  for each function call as a `list` is a mutable value.



Now, see the **corrected version** of the code -

%[https://youtu.be/sQWhLwnAh04]

Here as `None` is immutable value therefore it cannot be changed and a new list object is created for each function call.

> Note: The default argument is property of the **function object** therefore, initially it is same for all function calls.

### Thanks For Reading :slightly_smiling_face:

---



#### You may also like:

- [Modern C++ Features](https://blog.yuvv.xyz/modern-cpp-features)
- [What Happens When You Run a Computer Program?](https://blog.yuvv.xyz/what-happens-when-you-run-a-computer-program)
- [Comprehensions in Python: Explained](https://blog.yuvv.xyz/comprehensions-in-python-explained)
- [Linux Commands Reference With Examples](https://blog.yuvv.xyz/linux-commands-reference-with-examples)

Connect with me on [Twitter](https://twitter.com/yuvraajsj18), [GitHub](https://github.com/yuvraajsj18), and [LinkedIn](https://www.linkedin.com/in/yuvraajsj18/).





