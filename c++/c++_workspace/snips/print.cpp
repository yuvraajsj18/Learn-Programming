// A variadic function for print implementation

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
