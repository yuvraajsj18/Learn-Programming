#include <iostream>
#include "array.h"

using namespace std;

int main()
{
    Array <int, 4> intArr = {1,2,3,4};

    cout << intArr << endl;

    Array <int, 4> copyArr{intArr};
    cout << copyArr << endl;

    int arr[] = {3,4,5,6};
    copyArr = arr;
    cout << copyArr << endl;

    Array <string, 2> strArr = {"Hello", "World!"};
    cout << strArr << endl;

    return 0;
}