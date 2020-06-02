#include <iostream>
using namespace std;

int main()
{
    int e = 0;

    cout << "e = " << e << endl;

    if (1 < 2 || e++ == 0)
        cout << "in if" << endl;

    cout << "e = " << e << endl;

    if (1 < 2 | ++e == 1)
        cout << "in if" << endl;

    cout << "e = " << e << endl;

    return 0;
}