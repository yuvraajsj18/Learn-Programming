# Python

## Beginning with Python

<details> <summary> Basics - Syntax, Variables, Input, Comments, Indentation </summary>

### Introduction

  1. Installation

      - [Download Python](https://www.python.org/downloads/)

  2. Writing script
      - a python file is called a **module**.
      - a module that can be run is called a **script**.

  3. Creating a script

      - Write this line in a file called `hello.py`

        ```python
        print("Hello, World!")
        ```

        - This is it, that's our `Hello, World` program in python. Just one line.

  4. Running a script

      - To run a python script, execute the following command in the terminal -

        `python scriptname.py`

        - For our hello.py, it will be - `python hello.py`.

  5. Interpreter

      - Python provides an interpreter to quickly run instruction of Python.
      - To start the interpreter, just type `python` in your terminal.
      - Then you can run any Python instruction without creating files.
      - This is useful for quickly checking code snippets or test something.

### Types And Syntax

  1. Command Line Arguments:
      - `import sys`
      - use args through `sys.argv[index]`

  2. Types:
      - *Python is a dynamically typed language*.
      - type of a value is decided on run time.
      - type() function returns the type of the value passed.
          - `type(value)`
          - returns `<class type>`
      - **type conversion** <a name = "type-conversion"></a>
          - you can convert one type to another if they are compatible
          - `int("100")` = 100
          - `string(100)` = "100"
          - `float(199)` = 199.0
          - `int(float("3.3"))` = `int(3.3)` = 3
          - *Python is a strongly typed language*
              - means you can not add a string to integer all types have their certain predefined function.
              - `1 + " = One"` will give you *value error*.

### Variables

  0. stores address of values in memory, prevents repetition

  1. Assigning - `number = 8`

  2. usage - `print(number)`

  3. Cannot use a variable before assigning
      - Error: \<variable> is not defined
      - `del number` - for unbinding(deleting) a variable from its value

  4. A namespace is a mapping of names/variables to their values
  
  5. variables in python are like labels. You can label any type with any label at any time.
     
- `x = 8` ... `x = "str"` is OK
      
  6. In python variables are not deeply linked mean

      ```python
            x = 1
            y = x
            x = 2
            print(x, y)  # will print 2 1
      ```

      ![illustration of variables in memory](./pythonref.assets/mNqKMXUXRYuOmvgdSr4Z)

  7. Mupltiple assignment:
      - `a, b, c = 1, 2, 3` will assign a = 1, b = 2, c = 3
          - errors:
              - `a, b = 1, 2` - not enough values to unpack
              - `a, b, c = 1, 2, 3, 4` - too many values to unpack
      - notice the comma between vars and values

  8. **identifier Naming Rules:**
      - An identifier can consist of upper and lowercase letters of the alphabet, underscores, unicode identifiers, and digits 0 to 9.

      - An identifier cannot begin with a digit; for example, 7x is an invalid variable name.

      - No other characters can be in identifiers. This means spaces or any other symbols. Spaces most notably occur in module names as some operating systems will permit filenames with spaces. This should be avoided.

      - A Python keyword cannot be used in an identifier name, for example, import, if, for, and lambda.
        - you can use help() to get help for something in Python
        - to view all keyword help('keywords')

      - identifier are case sensitive

  9. **identifier naming convension:**
      - for consistent code and readabilty, depends on programmer to follow or not

      - prefer sanke_case over camelCase and PascalCase

      - write constant in UPPER_CASE to remind they should not change

      - Avoid lower case l or uppercase O as single character variable names, as in some fonts, these letters can be mistaken for 1 and 0, respectively, making the code harder to read.

### User Input

  1. Use input() function to take input from Command line interface.
      - execution of program pauses untill user press enter
      - `message = input()`

  2. for providing cue - `input("Enter: ")`

  3. The values returned by the input function are always strings.
      - to use other type, do [casting](#type-conversion).

### Comments

  1. Notes for the programmer.

  2. prefer to explain *why* over *how*.
  
  3. code should be self explainotary, identifier should be named in way that there is no confusion on *what it is or what it do*.

  4. **Comments in Python**

      - docstring
          - A docstring is a Documentation string is a literal string used as a python comment.
          - wrapped in """ or \`\`\`
          - Docstrings are often used to document modules, functions, and class definitions.
          - should be put at Beginning of file

          ```python
          """
          This script can be called with two integer arguments to return their sum
          """
          import sys
          num_1  = int(sys.argv[1])
          num_2  = int(sys.argv[2])
          print(num_1, "+", num_2, "=", num_1 + num_2)
          ```

          - **use to write multi-line comment**
      - block
          - starts with #, comes in line before the statement it annotes

            ```python
            # increament counter
            counter = counter + 1
            ```

      - inline
          - starts with #, placed on the same line as the statement it annotes
          - `age = input("Age: ") # to avoid doing it later`

### Indentation

  1. A block is a group of statements that are meant to be executed together

  2. Blocks allow a set of statements to be executed as though they were a single statement.

  3. **In Python, statement are *grouped* using whitespaces**, that is, blocks are indented within other blocks instead of using curly braces as in some other languages like C/C++, Java.

  4. **Whitespace** : Whitespace is any character in a piece of text that occupies space but doesn't correspond to a visible marking.
  
  5. Example:

      ```python
      if True:
          # execute this block of statements
          print("Block 1")
      else:
          # execute other block of statements
          print("Block 2")
      ```

  6. **Notice:** Parent statement of a block, that is, the statement that comes just before indentation is suffixed with a **colon :**.
  
  7. Number of spaces in indentation does not matter unless it is consistent throughout the code, but the standard is *four spaces*.
     
      - `IndentationError: unindent does not match any outer indentation level`

</details>

---

<details> <summary> Data types, Operators = [Numerical, Strings, Lists, Booleans], [arithmetic, assignment, relational, logical, membership]</summary>

### Data Types in Python

  1. Data types classify data, **define different operations** that can be performed on the data and **how the data is stored** and the **meaning of the data**.

  2. **Types of data**
      1. **_Numerical Data_**  (Immutable)

          1. Integers 
              - Whole Numbers (positive or negative)
          - have unlimited precision unlike C/C++, Java. (Limited only by available memory).

              ```python
              large_integer = 34567898327463893216847532149022563647754228543901666214555336432788998
              print(large_integer)
              ```
              
          2. Floating Point Numbers
              - A number with decimal point(all real numbers).
              - `type(3.333)` = float
              - `float(3)` = 3.0 [int to float]
              - floating point number have limited precision, so if you do
              `0.1 + 0.2` it will show
          `0.300000000004`.
          
          3. Other Number Systems
              - Binary: to write binary  number in python prefix it with 0b.
              - Hexadecimal: to write hexadecimal number in python prefix it with 0x
              - Octal - prefix with 0o
              (In C/C++, Java we just prefix it with 0).
          - **To convert between number system** use bin(), hex(), oct() functions.
          
- Python also supports complex number
          
2. [**Strings**](#Strings) (Immutable)
   
      3. **[Lists](#lists-basics)**
      
      4. **[Booleans](#booleans)**

### Operators

1. **Arithmetic operator**

    1. Arithmetic operators are mathematical functions that take numerical values and perform calculations on them.

    2. ![All arithmetic operator in python](./pythonref.assets/k7Ctzmr2Re6PYoMWpbKt)

    3. You can apply these operators on any number system operands.

    4. Unlike C/C++ and Java, division in Python will always yield a floating point number regardless of data type.

    5. Example

        ```python
        13 / 2 == 6.5 # notice full division
        12 / 3 == 4.0 # not 4(int) but 4.0 (float)
        5 % 2 == 1
        13 // 2 == 6 # notice result is int
        5 ** 3 == 125
        ```

2. **Assignment Operator**

    1. *=* is used an assignment operator to assign a value to a variable.

    2. These are *shorthand* versions of assignment operator -

        ![Shorthand operators table](./pythonref.assets/m7DgCqLZRnm7N51fMYDZ)

    3. Arithmetic operators in Python follow the standard order of operations in mathematics: PEMDAS.
    
3. **[Comparison operators](#comparison-operators)**

4. [Logical Operators](#logical-operators)

5. [Membership operators](#membership-operators)


### Strings

 1. Strings are a sequence of character.

    `s = "String"`

 2. Can be enclosed in either single (' ') or double (" ")  quotes. (In C/C++, Java strings must be in double quotes " ", and single characters in single quotes ' ').

    `s = "string" is same as s = 'string'`

 3. A double quoted string can contain single quote and vice versa.

    `s = "this 'is' a string" and s1 = 'this is "a" string'`

 4. For creating multiline string - enclose your string in ``` or """.

    ```python
    multiline = """A Multiline
    				string"""
    ```

5. **\* on strings**: will repeat the string that many times.

   `"Hi!" * 3 # this is equal to Hi!Hi!Hi!`

6. **\+ operator on string** : will concatenate strings without adding spaces in between.

   `"I " + "Love " + "Python" == "I Love Python"

7. *Python strings are **immutable***: This means that once they are assigned to a variable, their value cannot be changed.

   - No operation string will change it unless you reassign the variable.

     ```python
     string = "Hello"
     print(string) # Hello	| 	Initially
     print(string * 2) # HelloHello	| Operation
     print(string) # Hello	| No Change
     string = "Bye"	# | No Change But Reassigned 
     print(string) # Bye
     
     #string immutability
     string[0] = 'R' # error : 'str' object does not support item assignment
     ```

8. Python **strings are indexed** starting with 0

   - ![Indexing photo](./pythonref.assets/IqcyB8ULQTVq4I1h6WnB)	

   - to get a character from string - use []

     `print(string[0]) # P`

     - If we try to get a character from an index that doesn't exist, Python will raise an **IndexError**.

       ```python
       s = "foobar"
       print(s[100]) # IndexError: string index out of range
       print(s[1]) # o
       "012345"[5] # 5
       ```

 9. **Slicing strings**: to get a substring from a string

    - format: `string[start_index : end_index]`

    - The substring returned will not contain the character at last index but all the character upto the last index.

    - Python allows you to *omit the start or end index*

      ```python
      string = "foobarbaz"
      print(string[0 : 3]) # foo
      print(string[-3 : -1]) # ba
      print(string[2:]) # obarbaz	# start to last char
      print(string[:3]) # foo
      print(-n:m) # n and m are any index will return '' and viceversa
      print(:30) #foobarbaz
      print(30:30) # ""
      ```

 10. **Length** of a String: Number of characters inside it.

     - to calculate length of string use built-in len() function

       `len("String") # gives 6`

     - len("") # empty string gives 0

 11. String Formatting - to build new string using existing values.

     - **String Interpolation** :
     
       - String interpolation is the process of evaluating a string that has placeholders. 
     
       - These placeholders can hold expressions that yield a value, which is then placed inside the string. 
     
       - Special kinds of strings, known as **f-strings** (**formatted strings**), are used during string interpolation.
     
       - These strings are prefixed with an `f` to denote how they're meant to be interpreted
     
         ```python
         value = 3
         string = f"value is {value} and value times 2 is {value * 2}"
         # notice the curly brace used for inserting varibles and expressions
         # {} cannot be empty
         ```
     
       - *If you omit the `f` prefix, the string will be interpreted literally, as-is.*
     
       - **This should be the de facto way to format strings when using Python 3.6+.**
     
     - **The str.format() Method**
     
       - The `format()` method can be found on every string instance. 
     
       - It allows you to insert different values in positions within the string
     
       - you can't put expressions into the placeholders.
     
         ```python
         var = "Var"
         string = "{} is var".format(var)
         print(string)
         str = "{} is {}"
         dog = "Dog"
         animal = "Animal"
         str.format(dog, animal)
         ```
     
 12. String Methods

      1. **str.capitalize()** : returns *copy* str with 1st letter capitalized and rest in lowercase

      2. **str.lower()** : returns *copy* of str with all characters in lowecase.

      3. **str.upper()** : returns copy of the string with all characters in uppercase.

      4. **str.startswith(prefixStr)** : return bool by checking if a string starts with a given prefix.

      5.  **str.endswith(suffixStr)** :returns bool by  checking if a string ends with the given suffix.

      6. **str.strip()** : The `str.strip()` method returns a copy of the string with the leading and trailing characters removed. 

         - The method also takes an argument that is a string, specifying the set of characters to be removed. 
         - This method is also case-sensitive. 
         - If no arguments are passed to it, it removes all of the trailing and leading whitespaces.
           - This can be useful when sanitizing data:

         ```python
         str = "123DATA321"
         str.strip("123")	# DATA
         str.strip("DATA")	# 123DATA321 Why? because no D,A,T on the ends
         str.strip("1")	# 23DATA32
         str = "1DATA2"	
         str.strip("1")	# DATA2
         str.strip('2')	# 1DATA
         str.strip('A2')	# 1DAT
         str = "    AAAA    "	
         str.strip()		# AAAA
         ```

      7. **str.replace()** : The `str.replace()` method takes two substrings as arguments (old and new), then returns a copy of the string with **all of the occurrences** of the old substring replaced with the new one. 

         - Note that the method is case-sensitive

           ```python
           str = "OneTwoThree"
           str.replace("Two", "2") # One2Three
           str.replace("Three", "Tree") # OneTwoTree
           ```

      8. str.count(substr) : to count the number occurance in the string of sub string.

      9. _**You don't have to remember any method, because you can always look them up in the documentation.**_

         - to see documentation in the interpreter do - `help(str)`. make sure that str is not a variable assigned at the time of doing this otherwise the interpreter will interpret 'str' as a variable instead of the in-built class 'str'.

      10. [Read through the Python documentation for more information on string methods.](https://docs.python.org/2.4/lib/string-methods.html)

### Lists (Basics)

 1. Lists are the closest form of arrays in Python.

 2. List are aggregate data type, meaning that they are composed of other data types.

 3. Values in list are indexed from 0.

 4. Lists have a length property (len() function) and a count of objects inside it.

 5. List in python are heterogeneous, so they can hold values of different data types. In contrast to arrays in other languages like C/C++, Java where arrays only hold one data type elements.

 6. Lists are **mutable**, you can change the values inside of them, add elements and remove them.

 7. **List can contain other list inside them**.

 8. Lists are made with comma-separated elements enclosed in square brackets.

    ```python
    digits = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    letters = ['a', 'b', 'c', 'd']
    mixed = [0, 'a', 1, 'b', 2, 'c']
    biglist = ['a', 'b', [0, 1, 2]]
    bigbiglist = ["String", biglist]
    len(bigbiglist) # return number of elements in the list - 2 in this case
    ```

9. **Indexing in list**

   - Indexing starts with 0.
   - Index can also be negative meaning get the element from the end of the list

   ```python
   digits = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
   digits[0] # 0
   digits[5] # 5
   digits[-5] # 5
   digits[4] # 4
   digits[-4] # 6
   ```

10. **Slicing in list**

    - You can slice a list that is get a sub list from the list using - `list[start_index : end_index]`, end_index element is not included in the sub list.
    - **The original list remains unchanged by slicing operation**.

    ```python
    digits = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    few_digits = digits[2 : 5]
    print(few_digits) # [2, 3, 4]
    print(digits) # [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
    print(digits[4: ]) # [4, 5, 6, 7, 8, 9]
    print(digits[ : 4]) # [0, 1, 2, 3]
    ```

11. **Adding two lists**

    - You can add two lists together by using the `+` operator. The elements of all of the lists being concatenated are brought together inside one list.
      - Elements will be repeated.

    ```python
    list1 = [0, 'a', "string"]
    list2 = ["string", 1, 'b']
    list3 = list1 + list2
    print(list3) # [0, 'a', 'string', 'string', 1, 'b']
    list4 = list1 + list2 + list3
    print(list4) # [0, 'a', "string", "string", 1, 'b', 0, 'a', 'string', 'string', 1, 'b']
    ```

12. **Changing Values in a list** 

    - As lists are mutable, there content can be changed.

    - You can change value through its index like `digits[5] = 10`.

    - You can also use list.append() function to insert a value at the end of a list.

      `digits.append(11)`

    - You can also assign slices of a list, this **replaces ** the target slice with whatever you assign, regardless of the initial size of the list.

      `digits[2 : 8] = ["deleted"]` 	# [0, 1, 'deleted', 8, 9]

    - **An important thing to note is that when you assign a list, it points it to an object in the memory. If you assign another variable to the variable that references that list, the new variable also references that same list object in the memory. Any changes made using either reference will always change the same list object in the memory.**

    ```python
    list1 = [0, 1, 2, 3, 4, 5] # list 1 points to an object in memory that is this list [0, 1, 2, 3, 4, 5]
    list2 = list1 # list2 will also points to the same object
    list2[0] = 100 # this is equavalent to list1[0] = 100
    				# as both point to the same list in memory
    print(list1, list2) # both will change
    ```

 13. **More about list is discussed latter in the reference.**

### Booleans

 1. Boolean data types are values that can only be one of two values, `True` or `False`

 2. Boolean data type has `bool` operator.

    ```python
    print(True) # True
    print(False) # False
    print(10 < 1000) # True
    print(10 % 10 == 1) # False
    print(type(True)) # <class 'bool'>
    ```

3. Boolean values are largely associated with [control statements](#control-structures).

4. #### Comparison Operators 

   - Also called **relational operator.**

   - Comparison operators compare the values of objects or the objects, identities themselves. The objects don't need to be of the same type.

   ![List of comparison operator](pythonref.assets/noVRrNeXTWGIIvwqIvcO)

   ```python
   print(10 < 11) # True
   print(len("Open") >= 5) # False
   print(len(["One Element"]) > 2) # False
   print("Foobar" == "Foobar") # True
   a = 1
   b = a
   print(a is b) # True
   c = 2
   print(a is c) # False
   c = 1
   print(a is c) # True
   print(a is not None) # True
   print(a is None) # False
   
   list1 = [1,2,3]
   list2 = list1
   list1 is list2 # True
   list3 = [1, 2, 3]
   list3 is list1 # False as both are at different address in memory
   ```

   - `is` is true when both operands reference the same object in the memory.

   - `None` is Python equivalent of `null` means it points to nothing in memory.

   - ** To get the address in memory of object use `id()` function.

   - #### A Question about `is` operator?

     Why id's for int, string are same and not for list?

     ```python
     # Why this behaviour:
     a = 10
     b = 10
     print(f"id(a)={id(a)} & id(b)={id(b)} : {a is b}")
     # this prints - True with same id
     # On the other hand with lists
     l1 = [1,2,3]
     l2 = [1,2,3]
     print(f"id(l1)={id(l1)} & id(l2)={id(l2)} : {l1 is l2}")
     # this prints - False with different ids
     ```

     #### Answer

     ```py
     Sometimes (and by design it's an implementation detail) Python caches certain values for reuse.
     
     In particular it can only safely cache immutable types like strings and integers. Since list1 and list2 are mutable, it would be problematic for them to refer to the same object internally as mutations of one would then be reflected in the other.
     ```

     - Read [is operator behaviour with bigger ints](https://stackoverflow.com/a/28864111/6008082).

     - **Do not use `is` to compare integers.**

     - [Comparisons to singletons like None should always be done with `is` or `is not`, never the equality operators.](python.org/dev/peps/pep-0008/#programming-recommendations)

     - You can check types using is - `type(1) is int`returns true

       ```python
       a = 256
       b = 256
       a is b # True
       a = 257
       b = 257
       a is b # False
       numbers outside [-5, 256] are not cached.
       ```

 5. #### Logical Operators

    - Logical operator combine Boolean expressions.

      ![List of logical operator](pythonref.assets/M51ImwheQierlqLiifX3)

    - `and` is a **short-circuit operator**, in that it only evaluates the second argument if the first one is `True`. `or` is also a short-circuit operator, in that it will only evaluate the second argument if the first one is `False`.

      ```python
      print(not False) # True
      print(True or False) # True
      print(True and False) # False
      
      fruits = ["banana", "mangoes", "apples"]
      wants_fruits = True
      print(len(fruits) > 0 and wants_fruits) # True
      ```

 6. #### Membership Operators

    - The operators `in` and `not in` test for membership.

    - All sequences (for example, lists and strings), support this operator. 

      - For lists, these operators go through each element to see whether the element being searched for is within the list. 
      - For strings, the operators check whether the substring can be found within the string. 

    - The return values for these operators are `True` or `False`.

      ```python
      numbers = [0,1,2,3,4,5,6]
      print(3 in numbers) numbers = [0,1,2,3,4,5,6]
      print(3 in numbers) # True
      print(30 in numbers) # False
      print(3 not in numbers) # False
      print(30 not in numbers) # True# True
      print(30 in numbers) # False
      print(3 not in numbers) # False
      print(30 not in numbers) # True
      
      warning = "lord voldemort has returned"
      print("lord" in warning) # True
      print("Lord" in warning) # False
      print("lord" not in warning) # False
      ```

</details>

---

<details> <summary> Control Structures and Functions : if else, while, for, functions, lambdas. </summary>

### Control Structures

1. **Program flow** describes the way in which statements in code are executed. 

2. Python uses a simple top-down program flow. (code is executed in sequence from the top of the file to the very bottom.)

3. A control statement is a structure in code that conditionally changes the program flow.

   - A control statement achieves this by conditionally executing different parts of code. 
   - A control statement can also be used to repeatedly and conditionally execute some code.

4. The two main control statements in Python are:

   - **`if`**
   - **`while`**

5. #### The if statement

   - An `if` statement allows you to execute a block of code if a condition is true. Otherwise, it can run an alternative block of code in its `else` clause.

   - The `else` clause of an `if` statement is optional.

     ```python
     if condition:
         # Run this code if the condition is True
     else:
         # Run this code if the condition is False
     ```

   - You can chain if statements using `elif`.

     ```python
     if condition1:
         # Run this code if the condition is True
     elif condition2:
         # Run this code if condition1 is False and condition2 is True
     .
     .	# {Any number of elif can go here}
     .
     else:
         # Run this code if the condition is False
     ```

   - iif can also be nested inside another if or else or elif if required.

6. #### The while statement

   - A `while` statement allows you to execute a block of code repeatedly, as long as a condition remains true.

   - A `while` statement can also have an `else` clause that will be executed exactly once when the condition, that's mentioned is no longer true. 

     ```python
     while condition:
         # Run this code while condition is True.
     else:	# else is optional
         # Run this code once the condition is no longer true.
         # else is optional.
         # else will only run when the while is exited cleanly that is without breaking
     ```

7. #### Loops

   - In Python, loops (just as in any other language) are a way to execute a specific block of code several times. 
   - loops are used to iterate or loop over what we call **iterables**.
     - An iterable is anything that can be looped over.
     - An iterable is a collection of things that have been grouped together to form a large collective.
       - Strings
       - Lists
       - Dictionaries
       - Files
       - Sets
       - Tupples

8. #### For Loops

   - The `for` loop in Python is also referred to as the `for…in` loop. (For loop in python is different from other languages like C/C++ and Java because of its syntax).

   - A `for` loop is used when you have a block of code that you would like to execute repeatedly a given **number of times**.

     - The loop contrasts and differs from a `while` statement in that in a `for` loop, the repeated code block is ran a **predetermined number of times**, while in a `while` statement, the code is ran an **arbitrary number of times** as long as a condition is satisfied.

     ```python
     # member is any single constituent in the iterable
     for member in iterable:
         # Execute the code for each constituent member of the iterable
         pass # In Python, pass is a null statement. It indicated that
     		 # the body will be implemented latter.
  ```
   
- As with a `while` statement, an `else` statement can also be optionally used with a `for` loop. 
   
     - In this case, the code inside the `else` block will be executed exactly once when the loop exits cleanly.
  - Exiting cleanly means that the loop went through all the members of the iterable without breaking.
   
     ```python
     for member in iterable:
         # run this code for each member
     else:
         # run this once after loop ends cleanly,i.e., without breaking
  ```
   
- **The range function**
   
  - Python's `range` function is a built-in function that generates a `list` of numbers.
   
  - This list is mostly used to iterate over using a `for` loop.
   
  - This function is used when you want to perform an action a predetermined number of times
   
    **`range([start], stop, [step])`, parameters inside [] are optional, that is start and step are optional.**
   
  - `start`: This is the starting number of the sequence. (default is 0)
   
  - `stop`: This means generate numbers up to but not including this number.
   
  - `step`: This is the difference between each number in the sequence. (default is 1)
   
       ```python
       print(range(10)) # range(0, 10)
       # to view the numbers cast this to list
       print(list(range(10))) # [0,1,2,3,4,5,6,7,8,9]
       print(list(range(1, 11))) # [1,2,3,4,5,6,7,8,9,10]
       print(list(range(2, 21, 2))) # [2,4,6,8,10,12,14,16,18,20]
       
       for num in range(1, 11):
           print(num ,' squared is ', num * num) # prints square for numbers 1 to 10.
    ```
   
- Nesting loops : Nesting** can be defined as the practice of placing loops inside other loops. 
   
- There is no limit to how far you can nest loops, though you should keep code readability in mind when writing nested loops. You don't want to nest so much that you cannot easily deduce what the code does or the expected results of running the code at a glance.
   
- **Breaking out of for loops**
   
  - When running loops, sometimes, we might want to interrupt or intervene in the execution of the loops before it runs its full course due to an external factor.
   
  - Python provides us with three statements that can be used to achieve this:
   
    - `break` - The `break` statement allows you to **exit a loop** based on an external trigger. This means that you can exit the loop based on a condition external to the loop. This statement is usually used in conjunction with a conditional `if` statement.
   
         ```python
         for number in range(1, 11):
             product = number * 2
             print(number, "* 2 = ", product)
             if number == 4
             	break
         print("Loop completed")
         """
         1 * 2 =  2
         2 * 2 =  4
         3 * 2 =  6
         4 * 2 =  8
         Loop completed
         """
      ```
   
    - `continue` - The `continue` statement allows you to **skip over the part of a loop** where an external condition is triggered, but then goes on to complete the rest of the loop. This means that the current run of the loop will be interrupted, but the program will return to the top of the loop and continue execution from there.
   
      ```python
     for number in range(1, 11):
             if number == 4:
                 continue
             product = number * 2
             print(number, "* 2 = ", product)
         print("Loop completed")
         """
         1 * 2 =  2
         2 * 2 =  4
         3 * 2 =  6
         5 * 2 =  10
         6 * 2 =  12
         7 * 2 =  14
         8 * 2 =  16
         9 * 2 =  18
         10 * 2 =  20
         """
         ```
       
      
   
    - `pass` - The `pass` statement allows you to handle an external trigger condition without affecting the execution of the loop.
   
      - The `pass` statement simply tells the program to proceed as normal.
     - The `pass` statement is also mostly used as a placeholder.


### Functions

1. Used to group lines of that implement a functionality together.

2. helps to use the same code several times in the program. Reduces redundancy.

3. Helps to abstract away complex code in the program.

4. write functions that only perform one specific task. Because -

   - easier to modularize.
   - easier to debug.
   - maintainable.

5. Functions may take optional inputs to work with and may optionally return a value or values.

6. Built-In functions

   - The Python interpreter has a number of built-in functions and types that are always available.
   - built in function can be used anywhere without importaion.
   - Some example of built in functions are:
     - input()	
     - print()
     - map()

7. User defined functions

   - functions written(defined) by the programmer.

   - The main use of functions is to help us organize our programs into logical fragments that work together to solve a specific part of our problem.

     ```python
     def function_name(parameter_one, parameter_two, parameter_n):
         # Write your code for function here
         return # optional, if not provided function return None
     ```

   - **To define a function, we can use the following steps:**

     1. Use the `def` keyword, followed by the function name.
     2. Add parameters (if any) to the function within the parentheses. End the function definition with a full colon.
     3. Write the logic of the function.
     4. Finally, use the `return` keyword to return the output of the function. This is optional, and if it is not included, the function automatically returns `None`.

   - the name of the function should be descriptive.

   - **Calling a function**

     - Calling a function means executing the logic that is defined inside of the function.
     - call statement - `function_name([parameters])`

8. **Global and Local Variables**

   - Local Variables : Defined inside of a function body.
     - only accessible inside the function
       - Error when local variables are accessed globally - `NameError: name 'total' is not defined`
       - you can return the value of local variable to access **it's value** outside the function.
   - Global Variables : Defined outside of a function body.
     - accessible throughout the programs, outside and inside of functions.

9. **Function Return**

   - The `return` statement in Python is used within functions, to actually return something to the caller of the function. 
- Without a `return` statement, every function will return `None`.
   - a `return` statement is required if you need to use the result of calling a function for any further processing in your code. 

10. **Using Main in Python**

  - Most programming languages (like C/C++,  Java)  requires a special function called `main()`, which tells the operating system what code to execute when a program is invoked. *main() acts as a starting point in the program*.

  - In Python, this is not necessary, but it is a good and logical way to structure a program.

  - Before the Python interpreter executes our program, it defines a few special variables. One of them is `__name__`, and it will automatically be set to `__main__` if our program will be executed by itself, in a standalone fashion.

  - However, if our program will be imported by another program, then `__name__` will be set to the name of that other program.

  - We can easily determine whether the program is standalone or is being used by another program as an import. Based on that, we can decide to either execute or exclude some of the code in a program.

    ```python
    def summation(first, second):
        total = first + second
        return total
     
    def main():
        outer_total = summation(10, 20) * 2
        print("Double the total is " + str(outer_total))
     
    if __name__ == "__main__":
        main()
    ```

  - *In Python, there is nothing special about the name main. We could have called this function anything that we wanted. We chose main to be consistent with some of the other languages.*

11. **Function Arguments**

    - Parameters are the information that need to be passed to the function for it to do its work.

    - Also known as arguments, but arguments are thought of more as the actual values or references assigned to the parameter variables.

    - Types of arguments:

      - Required arguments - Required arguments are the types of arguments that have to be present when calling a function.

        ```python
        def division(first, second):
            return first/second
        quotient = division(10, 2)
        ```

      - Keyword arguments - arguments are passed using names of parameter, you can change the order of parameters when passing named arguments.

        ```python
        def division(first, second):
            return first/second
         
        quotient = division(second=2, first=10)
        print(quotient)
        ```

      - Default arguments - Default arguments are those that take a default value if no argument value is passed during the function call. 

        - You can assign this default value with the assignment operator, `=`.

          ```python
          def division(first, second=2):
              return first/second
           
          quotient = division(10)
          print(quotient) # 5.0
          ```

        - Note that even if the argument named `second` has a default value, you can still pass a value to it, and this passed value will override the default value.

          ```python
          def division(first, second=2):
              return first/second
           
          quotient = division(10, 5) # default value will be ignored
          print(quotient) # 2.0
          ```

      - A variable number of arguments - You can pass any number of arguments to function using the special `*`(asterisk) operator.

        ```python
        def addition(*numbers):
            sum = 0
            for num in numbers:
                sum += num
            return sum
        result = addition(1,2,3,4,5)
        print(result) # 15
        result = addition(1,2,3,4,5,5)
        print(result) # 20
        l = [10,9,8,7]
        result = addition(*l)
        print(result) # 34
        ```

12. Anonymous function

    - Also called **Lambda Functions**.
    - Defined using keyword lambda.
    - Lambda Functions do not have a name.
      - They acts as a throwaway, meaning that they are only required where they are defined, and are not to be called in other parts of the codebase.
    - Syntax:

    ```python
    lambda argument_list : expression
    ```

    - You can assign the function to a variable to give it a name.

      ```python
      f = lambda x : x ** 2
      print(f(4)) # 16
      ```

    - Lambda functions can be used to pass as an argument to other function like `map()`, `filter()` and `reduce()`.

      - map() - `map()` applies the `func` function to all of the elements of the iterable sequence. It returns a new list, with the elements changed by `func`.

      ```python
      celsius = [25, 31, 30, 26, 33]
      
      # converting celsius to fahrenheit using map and lambda function
      fahrenheit = list(map(lambda c : (c * (9 / 5)) + 32, celsius))
      print(*fahrenheit) # 77.0 87.80000000000001 86.0 78.80000000000001 91.4
      ```

</details>

---

