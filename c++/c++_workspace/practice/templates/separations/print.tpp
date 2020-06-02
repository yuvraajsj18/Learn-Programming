#ifndef PRINT_TPP
#define PRINT_TPP

#include "print.h"

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

#endif