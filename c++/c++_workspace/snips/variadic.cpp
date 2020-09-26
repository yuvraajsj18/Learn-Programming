#include <iostream>
using namespace std;

template <typename type>
int sum(type n)
{
    return n;
}

template <typename first, typename ... types>
int sum(first n, types ... args)
{
    return n + sum(args...);
}

int main()
{
    int sum3 = sum(1,2,3);
    cout << sum3 << endl;
    int sum5 = sum(1,2,3,4,5);
    cout << sum5 << endl;

    return 0;
}
