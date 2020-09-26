#include <iostream>
using namespace std;

int main()
{
    auto f = [](int a) -> int { return a * a;};

    auto a = f(2);

    cout << a << endl;

    return 0;
}