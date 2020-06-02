#include <iostream>
#include "quicksort.h"

int main()
{
    int size;
    std :: cout << "Size: ";
    std :: cin >> size;

    // int arr[size]; //// not an iso standard avoid usage in c++ (in c OK)
    int *arr = new int[size];

    std :: cout << "Enter array: ";
    for (int i = 0; i < size; i++)
        std :: cin >> arr[i];

    qsort(arr, 0, size - 1);

    std :: cout << "Sorted array is: ";
    for (int i = 0; i < size; i++)
        std :: cout << arr[i] << " ";

    std :: cout << std :: endl;

    delete[] arr;

    return 0;
}