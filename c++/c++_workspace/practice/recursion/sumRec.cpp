#include <iostream>

int sumItr(int n);
int sumRec(int n);
int sumFormula(int n);

int main()
{
    int n;
    std :: cout << "Enter n: ";
    std :: cin >> n;

    std :: cout << "Sum of first n integers in three different ways is:\n";
    std :: cout << "Iteratively: " << sumItr(n) << std :: endl;
    std :: cout << "Recursively: " << sumRec(n) << std :: endl;
    std :: cout << "By Formula: " << sumFormula(n) << std :: endl;
    return 0;
}

// returns sum of first n integers interively
int sumItr(int n)
{   
    int sum = 0;
    for (int i = 1; i <= n; i++)
        sum += i;

    return sum;
}

// returns sum of first n integers recursively
int sumRec(int n)
{
    if (n == 1)
        return 1;
    return n + sumRec(n - 1); 
}

// returns sum of first n integers formulatecally
int sumFormula(int n)
{
    return (n * (n + 1)) / 2;
}