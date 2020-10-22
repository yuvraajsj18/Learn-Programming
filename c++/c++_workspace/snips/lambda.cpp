#include <iostream>
#include <algorithm>
#include <vector>

int main()
{
    // auto square = [](int n) {
    //   return n * n;  
    // };

    // std::cout << "Square of 2 = " << square(2) << "\n";     // Square of 2 = 4

    // int outer = 50;

    // auto fn = [=]() mutable {
    //     outer = 100;    // OK, because of mutable
    //     std::cout << "Outer = " << outer << "\n";   // Outer = 100
    // };

    // fn();
    // std::cout << "Outer = " << outer << "\n";   // Outer = 50

    std::vector<int> nums{1, 2, 3, 4, 5, 6};

    for (auto x : nums) // 1 2 3 4 5 6 
        std::cout << x << " ";
    std::cout << "\n";

    // Square every number
    std::for_each(begin(nums), end(nums), [](int& n) {n = n * n;}); 

    for (auto x : nums) // 1 4 9 16 25 36 
        std::cout << x << " ";
    std::cout << "\n";

    return 0;
}