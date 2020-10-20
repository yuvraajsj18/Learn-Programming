#include <iostream>

template <typename type>
type max(type first, type second)
{
    return first > second ? first : second;
}

int main()
{
    std::cout << max<int>(2, 3) << "\n";
    std::cout << max(3.4, 4.2) << "\n";
    std::cout << max('C', 'S') << "\n";

    return 0;
}
