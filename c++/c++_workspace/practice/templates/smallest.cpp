// overloading with template functions

#include <iostream>
using namespace std;

template <typename type>
type smallest(type first, type second, type third);

template <typename type>
type smallest(type first, type second);

int main()
{
    cout << smallest(2, 1, 3) << endl;
    cout << smallest('e', 'a') << endl;
    cout << smallest('s', 'x', 'z') << endl;

    return 0;
}

template <typename type>
type smallest(type first, type second)
{
    if (first < second)
        return first;
    return second;
}

template <typename type>
type smallest(type first, type second, type third)
{
    return smallest(smallest(first, second), third);
}