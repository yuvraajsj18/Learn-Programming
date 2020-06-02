#include <iostream>
using std :: cout;
using std :: cin;
using std :: endl;

long findGCD(long n1, long n2);
void showGCD(long n1, long n2);

int main()
{
    long n1;
    cout << "Enter n1: ";
    cin >> n1;

    long n2;
    cout << "Enter n2: ";
    cin >> n2; 

    long gcd = findGCD(n1, n2);

    showGCD(n1, n2);

    cout << "GCD = " << gcd << endl;
    
    return 0;
}

long findGCD(long n1, long n2)
{
    if (n2 == 0)
        return n1;
    return findGCD(n2, n1 % n2);
}

void showGCD(long n1, long n2)
{
    if (n2 == 0)
    {
        cout << "gcd(" << n1 << ", " << n2 << ")\n";
        return;
    }
    cout << "gcd(" << n1 << ", " << n2 << ")\n";
    showGCD(n2, n1 % n2);
}