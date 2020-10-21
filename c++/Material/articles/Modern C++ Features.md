# Modern C++ Features

C++ is not just C with classes, it is very powerful language that comes with many features that are provided by languages like Python and JavaScript.

In this article, I have shown a few features that you may know from Python or JavaScript that you can use in C++ too!!



## Table of Content

- [Templates](#templates)
- [Auto](#auto)
- [Variable Argument Function](#variable-argument-functions)
- [Standard Template Library](#standard-template-library)
- [Range Based For Loop](#range-based-for-loop)
- [Lambda Functions](#lambda-functions)



## Templates

Suppose you want to write a function with same operations on different data types. 

This is straight forward in Python as same variable can *point* to different objects of different types. So you can reuse the same code for all types.

Now, in C++ one solution is to overload the function with different types but that will require you to write a lot of code that basically do the same thing. Here comes the use of **templates**. 

Instead of writing functions with different types yourself, you can have compiler generate them for you by using templates. The compiler knows which functions to generate based on the *parameter* provided.

Lets See an example:

- A template function for getting the maximum of two values, the value can be of any data type.

  ```cpp
  #include <iostream>
  
  template <typename type>	// Creating a template
  type max(type first, type second)
  {
      return first > second ? first : second;
  }
  
  int main()
  {
      std::cout << max<int>(2, 3) << "\n";			// 3
      std::cout << max(3.4f, 4.2f) << "\n";	// 4.2
      std::cout << max('C', 'S') << "\n";		// S
  
      return 0;
  }
  ```

  - The first call will tell compiler to create a function with `type` replaced by `int`
  - Similarly, second and third call will create a function with `type` replaced by `float` and `char`.
  - In the first call we have explicitly told compiler that type is `int` with `<type>` notation. 

> You can similarly create templates for classes.
>
> To learn more about templates in C++, checkout this [article](https://docs.microsoft.com/en-us/cpp/cpp/templates-cpp?view=vs-2019#default-template-arguments)



## Auto

You can deduce the type of a variable at compile time using the `auto` keyword.

This is useful when a variable has a complicated type.

Here is an example of `auto`

```cpp
#include <iostream>
#include <string>

int main()
{
    auto an_int = 50;
    auto a_float = 10.5f;
    auto a_double = 100.12;
    auto a_char = 'S';
    auto a_string = "String";

    std::cout << an_int << "\n";		// 50
    std::cout << a_float << "\n";		// 10.5
    std::cout << a_double << "\n";		// 100.12
    std::cout << a_char << "\n";		// S
    std::cout << a_string << "\n";		// String

    return 0;
}
```

> To learn more about auto in C++, read this [article](https://docs.microsoft.com/en-us/cpp/cpp/auto-cpp?view=vs-2019)



## Variable Argument Functions

If you know Python then you must have used `*` for creating function with variable number of arguments.

You can do the same in C++ using Ellipsis and variadic templates.

Let us understand this with an example -

```cpp
#include <iostream>

template <typename type>
int sum(type n)
{
    return n;
}

template <typename first, typename... types>	// Packing Arguments
int sum(first n, types ...args)		// Expanding Arguments
{
    return n + sum(args...);	
}

int main()
{
    int sum3 = sum(1,2,3);
    std::cout << sum3 << "\n";		// 6
    int sum5 = sum(1,2,3,4,5);
    std::cout << sum5 << "\n";		// 15

    return 0;
}
```

Here, `...` after `typename` is packing all the arguments passed when calling into `types` and then we are unpacking them again with `...` before `args`. 

Then we have used recursion to call a function with arguments one less than the original.

**Similarly you can create a print function that takes any number of arguments** - 

```cpp
#include <iostream>

template <typename First>
void print(First first)
{
    std::cout << first << "\n";
}

template <typename First, typename ... Types>
void print(First first, Types ... args)
{
    std::cout << first << " ";
    print(args...);
}

int main()
{
    print("One", "Two");
    print("One", "Two", "Three", "Four");

    return 0;
}
```

> Learn more about ellipsis and variadic templates in this [article](https://docs.microsoft.com/en-us/cpp/cpp/ellipses-and-variadic-templates?view=vs-2019)



## Standard Template Library



































