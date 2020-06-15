#include <iostream>
using namespace std;

int main()
{
    int* p, i, x;

    i = 2, x = 3;
    p = &i;

    cout << i << endl << x << endl << *p << endl;

    return 0;
}