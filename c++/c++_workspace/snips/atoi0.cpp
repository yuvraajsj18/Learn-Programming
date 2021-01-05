#include <iostream>
#include <string>
#include <cmath>
#include <algorithm>

int my_atoi(std::string word);

int main() {
    std::cout << my_atoi("50") << "\n";
    std::cout << my_atoi("9190") << "\n";
    // std::cout << my_atoi("-90") << "\n";  // TODO

    return 0;
}

int my_atoi(std::string word)
{
    std::string rev_word = word;
    std::reverse(rev_word.begin(), rev_word.end());

    int number = 0;
    for (int i = 0; i < rev_word.length(); i++)
    {
        char ch = rev_word[i];
        
        if (ch >= '0' && ch <= '9')
            number += (ch - '0') * pow(10, i);
    }
    
    return number; 
}
