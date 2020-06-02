// a template class

#include <iostream>
using namespace std;

template <typename type>    // ******* //
class Print
{
    private:
        type toPrint;

    public:
        Print(type toPrint);

        void print();

        void set(type toPrint);

        void doNothing();
};

int main()
{
    Print <int> p1(3);
    p1.print();

    Print <float> p2(3.3);
    p2.print();

    Print <double> p3(4);
    p3.print();

    Print <string> p4("Hello, World!");
    p4.print();

    return 0;
}

template <typename t>
Print <t> :: Print(t toPrint)
{
    this -> toPrint = toPrint;
}

template <typename type>
void Print <type> :: print()
{
    cout << toPrint << endl;
}

template <typename type>
void Print <type> :: set(type toPrint)
{
    this -> toPrint = toPrint;
}

template <typename type>
void Print <type> :: doNothing()
{
    cout << "Does nothing" << endl;
}