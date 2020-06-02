#include <iostream>
using namespace std;

int a = 10;

int main()
{
    int a = 100;

    {
        int a = 50;
        cout << "Local: " << a << endl;
        cout << "Global: "<< ::a << endl;
    }

    {
        cout << "Local: " << a << endl;
        cout << "Global: "<< ::a << endl;
    }

    return 0;
}