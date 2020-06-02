#include <iostream>
using namespace std;

int global;

class A
{
    public: 
    static int classStatic;
};
int A :: classStatic;

int main()
{
    static int staticInt;

    cout << global << " " << staticInt << endl;

    A obj;
    cout << obj.classStatic << endl;

    return 0;
}