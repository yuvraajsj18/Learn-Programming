#include "headerfile.h"

void print(std::string message)
{
    std::cout << "Message = " << message << "\n";
}

SomeClass::SomeClass(int var)
{
    this->var = var;
}

void SomeClass::print()
{
    std::cout << "var = " << var << "\n";
}
