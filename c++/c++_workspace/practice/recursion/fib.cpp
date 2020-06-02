#include <iostream>
using std :: cout;
using std :: cin;
using std :: endl;

long fib(long n);

int main()
{
    int n;
    std :: cout << "Enter n: ";
    std :: cin >> n;

    for (int i = 0; i < n; i++)
        cout << fib(i) << " ";
    cout << endl;

    return 0;
}

long fib(long n)
{
    if (n == 1 || n == 0)
        return 1;
    return fib(n - 1) + fib(n - 2);
}