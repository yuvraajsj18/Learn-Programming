#ifndef HEADERFILE_H
#define HEADERFILE_H

#include <iostream>
#include <string>

const int SOME_CONSTANT = 50;

void print(std::string message);

class SomeClass
{
    private:
        int var;

    public:
        SomeClass(int var);
        void print();
};

#endif