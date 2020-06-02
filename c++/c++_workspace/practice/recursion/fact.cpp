#include <iostream>

long factorial(int n, int& count);

int main()
{
    int n;
    std :: cout << "Enter n: ";
    std :: cin >> n;

    int count = 1;
    long fact = factorial(n, count);

    std :: cout << n << "! = " << fact << std :: endl;
    std :: cout << count << std :: endl;

    return 0;
}

long factorial(int n, int& count)
{
    if (n <= 1)
        return 1;
    count++;
    return n * factorial(n - 1, count);
}