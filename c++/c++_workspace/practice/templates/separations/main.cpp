#include <iostream>
#include "print.h"
using namespace std;

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