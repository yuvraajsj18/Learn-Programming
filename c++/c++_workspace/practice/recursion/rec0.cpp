#include <iostream>

void printRecursively(char ch, int times);

int main()
{
    printRecursively('#', 10);
    std :: cout << std :: endl;
    // printRecursively('#', 10);
    // std :: cout << std :: endl;
    // printRecursively('#', 10);
    // std :: cout << std :: endl;
    // printRecursively('|', 10);
    // std :: cout << std :: endl;
    // printRecursively('|', 10);
    // std :: cout << std :: endl;
    // printRecursively('|', 10);
    // std :: cout << std :: endl;

    return 0;
}

void printRecursively(char ch, int times)
{
    if (times == 0)
    {
        return;
    }
    printRecursively(ch, --times);
    std :: cout << ch;
    // printRecursively(ch, --times);

}