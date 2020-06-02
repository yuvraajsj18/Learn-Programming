// Write a Program to generate the Fibonacci Series using recursion.
// 0 1 1 2 3 5 8 13 21 ...

#include <iostream>
using namespace std;

long generate_fib_no(int term);

int main()
{
    int no_terms;
    cout << "Enter number of terms you want fibonacci series upto: ";
    cin >> no_terms;

    for (int term = 0; term < no_terms; term++)
        cout << generate_fib_no(term) << " " << flush;

    cout << endl;

    return 0;
}

long generate_fib_no(int term)
{
    if (term == 0 || term == 1)
        return term;
    else return (generate_fib_no(term - 1) + generate_fib_no(term - 2)); 
}