#include <iostream>
using namespace std;

int main()
{
    int* p, i, x;

    /**
     *  Only p is pointer i and x are integers,
     *  to make them as pointer do int *p, *i, *x
     */

    i = 2, x = 3;
    p = &i;

    cout << i << endl << x << endl << *p << endl;

    return 0;
}