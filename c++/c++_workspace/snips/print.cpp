// A variadic function for print implementation

#include <iostream>
using namespace std;

template <typename First>
void print(First first)
{
    cout << first << endl;
}

template <typename First, typename ... Types>
void print(First first, Types ...args)
{
    cout << first << " ";
    print(args...);
}

int main()
{
    print("One", "Two");
    print("One", "Two", "Three", "Four");

    return 0;
}
