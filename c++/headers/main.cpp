#include "headerfile.h"
#include <iostream>

int main()
{
    print("Hello, World");  // OUTPUT: Message = Hello, World

    SomeClass object(50);

    object.print();     // OUTPUT: var = 50

    std::cout << SOME_CONSTANT << "\n"; // 50

    return 0;
}   
