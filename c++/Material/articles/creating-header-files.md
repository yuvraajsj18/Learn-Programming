# How to Create Header Files in C++ CORRECTLY

If you are a C++ programmer, then you must have used predefined header files like `<iostream>`, `<string>`, `<cmath>` etc.

In this article I have shown how to create your own header files in the right way.

This article is divided into two sections - 

1. [Creating Ordinary Header Files](#creating-ordinary-header-files)
2. [Creating Template Header Files](#creating-template-header-files)



## Creating Ordinary Header Files

Suppose you have created the following header file with the following line in it- 

```cpp
const int SOME_CONSTANT = 50;	// first.h
// ...More
```

Now you have a second header file which have included the above file -

```cpp
#include "first.h"	// second.h
// ...More
```

And you have one more C++ file which includes both these files - 

```cpp
#include "first.h"	// third.cpp
#include "second.h"	
// ...More
```

Now, when you compile your `third.cpp` file, you will get an error like this -

> **error: redefinition of ‘const int SOME_CONSTANT’
>     1 | const int SOME_CONSTANT = 50;**

Because the `first.h` file is included twice, therefore its content also gets copied twice in the `third.cpp` file.

To prevent this we should use **Header Guards**.

### Using Header Guards

Header Guards are conditional compilations directives which mean they are evaluated at compilation time and the compiler will perform operations on the basis of its result.

Header Guards look like this -

```cpp
#ifndef HEADERFILE_H
#define HEADERFILE_h

// Declarations goes here

#endif
```

`ifndef` means if not defined, if the HEADERFILE_H is not defined it will define it, otherwise if it is already defined it will skip compiling everything between `ifndef` and `endif`.

*Now, we will update our previous example with header guards*

- `first.h`

  ```cpp
  #ifndef FIRST_H
  #define FIRST_H
  
  const int SOME_CONSTANT = 50;
  // ...More
  
  #endif
  ```

- `second.h`

  ```cpp
  #ifndef SECOND_H
  #define SECOND_H
  
  #include "first.h"
  // ...More
  
  #endif
  ```

- `third.cpp`

  ```cpp
  #include "first.h"
  #include "second.h"
  #include <iostream>
  
  int main()
  {
      // Using first.h and second.h
  }
  ```

Now, our `third.cpp` file will compile without error.

### One Complete Example

Lets look at one more example -

In this example we will create the following three files -

- `headerfiles.h` - Provides constants, functions and class declarations for use.
- `definitions.cpp` - Contains definitions for the headerfiles.h functions and classes.
- `main.cpp` - Consumes the functions and classes declared in headerfiles.

##### headerfile.h

```cpp
#ifndef HEADERFILE_H
#define HEADERFILE_H

#include <iostream>
#include <string>

const int SOME_CONSTANT = 50;

void print(std::string message);

class SomeClass
{
    private:
        int var;

    public:
        SomeClass(int var);
        void print();
};

#endif
```

##### definitions.cpp

```cpp
#include "headerfile.h"

void print(std::string message)
{
    std::cout << "Message = " << message << "\n";
}

SomeClass::SomeClass(int var)
{
    this->var = var;
}

void SomeClass::print()
{
    std::cout << "var = " << var << "\n";
}
```

##### main.cpp

```cpp
#include "headerfile.h"
#include <iostream>

int main()
{
    print("Hello, World");  // OUTPUT: Message = Hello, World

    SomeClass object(50);

    object.print();     // OUTPUT: var = 50

    std::cout << SOME_CONSTANT << "\n"; // OUTPUT: 50

    return 0;
}   
```

This is the right way to create header files, you separate the **declarations** and **definitions** in two files and only include the header file when necessary.

You will link the definitions file when compiling like this -

> **g++ -o main main.cpp definitions.cpp**



## Creating Template Header Files

Now in case of templates, you can't simply create two different files for declarations and definitions like previous example because, when compilers compiles the program it needs to replace the generic types with the required template arguments.

For example -

```cpp
# foo.h
template <typename type>
type sum(type a, type b)
{
    type result = a + b;
    return result;
}

# main.cpp
sum(50, 100);	// This will create a function sum with type replaced with int everywhere
```

If we haven't provided the definition in the header file, the compiler won't be able to do perform the replacement(or instantiation).

Now, to separate our definition and declaration in case of templates we can use the following way -

##### max.h 

Header file to store function and class declaration

```cpp
#ifndef MAX_H
#define MAX_H

template <typename type>
type max(type a, type b);

#include "max.tpp"	// IMPORTANT: We are including our definitions in the header file at the end
#endif
```

##### max.tpp

Definition file, note that its extension is `.tpp` and not `.cpp` as per the convention for template definitions files.

```cpp
#include "max.h"

template <typename type>
type max(type a, type b)
{
    return a > b ? a : b;
}
```

##### main.cpp

```cpp
#include "max.h"
#include <iostream>

int main()
{
    std::cout << max(50, 100) << "\n";   // 100

    return 0;
}
```



#### Thanks for reading

---

#### References:

- https://www.learncpp.com/cpp-tutorial/header-guards/
- https://stackoverflow.com/questions/495021/why-can-templates-only-be-implemented-in-the-header-file

#### You may also like:

- [What Happens When You Run a Computer Program?](https://blog.yuvv.xyz/what-happens-when-you-run-a-computer-program)
- [Comprehensions in Python: Explained](https://blog.yuvv.xyz/comprehensions-in-python-explained)
- [Linux Commands Reference With Examples](https://blog.yuvv.xyz/linux-commands-reference-with-examples)



















