#include <iostream>
#include <vector>

int main()
{
    std::vector<int> numbers{1, 2, 3, 4, 5};

    for (int i = 0; i < numbers.size(); i++)
        std::cout << numbers[i] << " ";
    std::cout << "\n";  // OUTPUT: 1 2 3 4 5

    for (int x : numbers)
        std::cout << x << " ";
    std::cout << "\n";

    std::vector<char> alphabets;
    alphabets.push_back('a');
    alphabets.push_back('b');
    alphabets.push_back('c');

    std::cout << alphabets[1] << "\n";  // OUTPUT: b

    for (auto ch : alphabets)
        std::cout << ch << " ";
    std::cout << "\n";

    for (auto i : {1, 2, 3})
        std::cout << i << " ";

    int arr[] = {4, 5, 6};
    for (auto j : arr)
        std::cout << j << " ";

    return 0;
}
