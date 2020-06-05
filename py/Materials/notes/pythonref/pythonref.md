# Python

## Beginning with Python

<details> <summary> Basics - Syntax, Variables, Input, Comments, Indentation </summary>

### Introduction

  1. Installation

  2. Interpreter

  3. Shell

  4. Writing script
      - a python file is called a module
      - a module that can be run is called a script

  5. Creating a script
  
  6. Running a script
      - `python scriptname.py`

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



