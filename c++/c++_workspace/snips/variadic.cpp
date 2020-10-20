#include <iostream>

template <typename type>
int sum(type n)
{
    return n;
}

template <typename first, typename... types>
int sum(first n, types ...args)
{
    return n + sum(args...);
}

int main()
{
    int sum3 = sum(1,2,3);
    std::cout << sum3 << "\n";
    int sum5 = sum(1,2,3,4,5);
    std::cout << sum5 << "\n";

    return 0;
}
