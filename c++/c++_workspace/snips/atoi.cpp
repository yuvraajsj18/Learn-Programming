// Solution to https://leetcode.com/problems/string-to-integer-atoi/

#include <iostream>
#include <string>
#include <cmath>
#include <cctype>
#include <algorithm>
#include <stack>

int my_atoi(std::string word);

bool starts_with_number(const std::string& str);

int main() {
    std::cout << my_atoi("50") << "\n";
    std::cout << my_atoi("9190") << "\n";
    std::cout << my_atoi("-90") << "\n";  
    std::cout << my_atoi("4193 with words") << "\n";  
    std::cout << my_atoi("words and 987") << "\n";  
    std::cout << my_atoi("-91283472332") << "\n";  
    std::cout << my_atoi("+500") << "\n";  

    return 0;
}

int my_atoi(std::string word)
{
    // constants in use -
    constexpr int NO_CONVERSION = 0;

    // trim from start until non whitespace character reached
    word.erase(
        word.begin(),
        std::find_if(
            word.begin(),
            word.end(),
            [](unsigned char ch) {
                return !std::isspace(ch);
            }
        )
    );


    if (!starts_with_number(word))
        return NO_CONVERSION;
    
    // collect numerical characters into a stack
    bool is_number_negative = false;
    int i = 0;  
    if (word[0] == '-' || word[0] == '+')
    {
        if (word[0] == '-')
            is_number_negative = true;
        i = 1;  // skip + or -
    }
    // start collecting
    std::stack<char> numbers_reversed;
    for (; i < word.length() && word[i] >= '0' && word[i] <= '9'; i++)
        numbers_reversed.push(word[i]);

    // convert from stack to int 
    int number = 0;
    int place = 0;
    while (!numbers_reversed.empty())
    {
        char ch = numbers_reversed.top();
        numbers_reversed.pop();
        number += (ch - '0') * pow(10, place);      // Converting character to proper integer
        place++;
    } 

    if (is_number_negative)
        return number * -1;

    return number;
}

bool starts_with_number(const std::string& str)
{
    if (str.length() == 0)
        return false;

    if (str[0] == '+' || str[0] == '-')
        return (str.length() > 1 && str[1] >= '0' && str[1] <= '9');

    return (str[0] >= '0' && str[0] <= '9');
}