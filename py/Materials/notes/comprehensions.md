# Comprehensions In Python

## What is comprehension?

Comprehensions are a *concise notation* for performing some operation for a collection of elements, and/or selecting a subset of them that meet some condition.

**Types of Comprehensions:**

- List Comprehensions.

- Dict Comprehensions.
- Set Comprehensions.

**Simply Put,** you can use comprehensions to define new Sequences(List, Dict, Set) from existing once in an elegant way.

Let's see comprehensions in Action.



## List Comprehensions

- Suppose, you want to create a list with the squares of the first 10 natural numbers.

  You can do this using a *for loop* like this:

  ```python
  squares = []
  for n in range(10):
      squares.append(n * n)
  print(squares)	# [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
  ```

  You can perform the same thing using *list comprehensions* in a much more elegant and concise way:

  ```python
  squares = [n * n for n in range(10)]
  print(squares)	# [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
  ```

  Same result!!

  **Basically we have put a `for` loop within a square brackets.**

- You can also use a `if` condition inside of your comprehension.

  Let's select the even numbers from the *square* list we just created:

  ```python
  squares = [0, 1, 4, 9, 16, 25, 36, 49, 64, 81]
  even_nums = [num for num in squares if not num % 2]
  print(even_nums)	# [0, 4, 16, 36, 64]
  ```

  Quite neat! isn't it?

- **Nested Comprehensions**: You can use multiple for loop inside a comprehensions.

  Suppose you want to create a matrix from two lists:

  Using `for` loop:

  ```python
  matrix = []
  for a in range(3):
      for b in range(3):
          matrix.append([a, b])
  print(matrix)
  """ Output: 
  [[0, 0], [0, 1], [0, 2],
   [1, 0], [1, 1], [1, 2], 
   [2, 0], [2, 1], [2, 2]]
  """
  ```

  Using `list comprehension`: 

  ```python
  matrix = [[a, b] for a in range(3) for b in range(3)]
  print(matrix)
  """ Output: 
  [[0, 0], [0, 1], [0, 2],
   [1, 0], [1, 1], [1, 2], 
   [2, 0], [2, 1], [2, 2]]
  """
  ```

  From 4 lines to 1 lines!!

  **Note**:  `for` loop over `b` has a dependency on `a`, it must follow the `for` loop over `a` in the comprehension.



## Set Comprehensions

Set comprehension work exactly like list comprehension, only there is a little difference in the syntax.

```python
name = "Harry"
letters1 = set(c for c in name)	# First way using set()
letters2 = {c for c in name}	# Second way using {}
print(letters1)		# {'H', 'y', 'a', 'r'}
print(letters2)		# {'H', 'y', 'a', 'r'}
```



## Dict Comprehensions

Dict comprehension is similar to list and set comprehensions but it requires a key: value pair instead of single values.

```python
d1 = dict((k, v) for k, v in enumerate("Hello", 1))
print(d1)	# {1: 'H', 2: 'e', 3: 'l', 4: 'l', 5: 'o'}
d2 = {k: v for k, v in enumerate("Bye", 1)}
print(d2)	# {1: 'B', 2: 'y', 3: 'e'}
```

**Note**: 

- enumerate function returns a key: value pair using the iterable passed to it and the start value.
- Dictionaries do not allow duplication in the keys.

----

### References:

- Learn Python Programming: The no-nonsense, beginner's guide to programming, data science, and web development with Python 3.7, 2nd Edition by [Fabrizio Romano](https://www.google.com/search?sxsrf=ALeKk02LrSjHLjqjCy3Pbzme4k9fnfZ4uA:1598606190833&q=Fabrizio+Romano&stick=H4sIAAAAAAAAAOPgE-LVT9c3NMyoMswrz84yV4Jwk81Ns4ryqiy1ZLKTrfST8vOz9cuLMktKUvPiy_OLsq0SS0sy8osWsfK7JSYVZVZl5isE5ecm5uXvYGUEAJclzA5TAAAA&sa=X&ved=2ahUKEwjnqY-RyL3rAhXVgeYKHRp1AwsQmxMoATAYegQICxAD).

#### Thanks















