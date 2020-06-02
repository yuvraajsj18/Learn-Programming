#ifndef PRINT_H
#define PRINT_H

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

#include "print.tpp"
#endif