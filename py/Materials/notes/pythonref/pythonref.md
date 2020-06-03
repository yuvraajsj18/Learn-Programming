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

### Data Types in Python

  1. Data types classify data, **define different operations** that can be performed on the data and **how the data is stored** and the **meaning of the data**.

  2. **Types of data**
      1. **_Numerical Data_**

          1. Integers
              - Whole Numbers (positive or negative)
          - have unlimited precision unlike C/C++, Java. (Limited only by available memory).

              ```python
              large_integer = 34567898327463893216847532149022563647754228543901666214555336432788998
              print(large_integer)
              ```
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
          ```

          - Python also supports complex number

      2. [**Strings**](#Strings)

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
      ```

	8. Python **strings are indexed** starting with 0

    - ![Indexing photo](./pythonref.assets/IqcyB8ULQTVq4I1h6WnB)

