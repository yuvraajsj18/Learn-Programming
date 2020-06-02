#include <iostream>
using namespace std;

template <typename type, const int size>  // size must be constant, const keyword is redundant
void printArr(type (&arr)[size]);

int main()
{
    // int n;
    // cin >> n;
    // int arr1[n]; //variable size will not work

    int arr1[6];
    cout << "Enter 6 ints: ";
    for (int i = 0; i < 6; i++)
        cin >> arr1[i];
    
    char arr2[4];
    cout << "Enter 4 chars: ";
    for (int i = 0; i < 4; i++)
        cin >> arr2[i];
    
    printArr(arr1);
    printArr(arr2);

    return 0;
}

template <typename type, int size>
void printArr(type (&arr)[size])
{
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}