// A non template class can have a template function inside it

#include <iostream>
using namespace std;

class Foo
{
    private:
        int x;

    public:
        Foo();

        template <typename type>
        void foo(type t);
};

int main()
{
    Foo obj;
    obj.foo(5);
    obj.foo(10);

    return 0;
}

Foo :: Foo()
{
    cout << "Foo created" << endl;
}

template <typename type>
void Foo :: foo(type t)
{
    cout << t << endl;
    x = 100;
    cout << x << endl;
}