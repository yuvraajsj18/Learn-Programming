#ifndef ARRAY_TPP
#define ARRAY_TPP

#include "array.h"

template <typename type, int size>
type& Array <type, size> :: operator[](int index)
{
    return arr[index];
}

template <typename type, int size>
Array<type, size> Array <type, size> :: operator=(type arr[])
{
    for (int i = 0; i < size; i++)
       this -> arr[i] = arr[i];
}

template <typename typeCopy, int sizeCopy>
std :: ostream& operator <<(std :: ostream& out, Array <typeCopy, sizeCopy>& arr)
{
    for (int i = 0; i < sizeCopy; i++)
    {
        out << arr[i];
        if (i != sizeCopy - 1)
            out << ", ";
    }
    return out;
}

#endif