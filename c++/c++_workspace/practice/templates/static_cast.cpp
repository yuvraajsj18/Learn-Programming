#include <iostream>
using namespace std;

template <typename type>
type my_static_cast(type var)
{
    return var;
}

int main()
{
    float f = 10.5;
    int i = (int) f;    // c style
    cout << "(int) 10.5 = " << i << endl;

    f = 11.23;
    i = static_cast <int> (f);
    cout << "static_cast <int> (11.23) = " << i << endl;

    f = 12.32;
    i = my_static_cast <int> (f);
    cout << "my_static_cast <int> (12.32) = " << i << endl;

    cout << "my_static_cast <char> (65) = " << my_static_cast <char> (65) << endl;

    return 0;
}