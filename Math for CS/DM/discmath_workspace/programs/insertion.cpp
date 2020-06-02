#include <iostream>
using namespace std;

void insertionSort(int arr[], int size)
{
    for (int i = 1; i < size; i++)
    {
        int j = i - 1;  // start of sorted array from right
        int toSort = arr[i];

        while (j >= 0 && toSort < arr[j])
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = toSort; 
    }
}

int main()
{
    int arr[] = {3, 5, 2, 6, 4};

    insertionSort(arr, 5);

    for (int i = 0; i < 5; i++)
    {
        cout << arr[i] << " ";
    }

    cout << endl;

    return 0;
}