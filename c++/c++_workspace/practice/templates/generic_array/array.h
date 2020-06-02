#ifndef ARRAY_H
#define ARRAY_H
#include <iostream>

template <typename type, int size>
struct Array
{   
        type arr[size];

        type& operator[](int index);
        Array<type, size> operator=(type arr[]);

        template <typename typeCopy, int sizeCopy>
        friend std :: ostream& operator <<(std :: ostream& out, Array <typeCopy, sizeCopy>& arr);
};

#include "array.tpp"
#endif