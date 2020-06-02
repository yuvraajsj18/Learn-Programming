// remove duplicates from an array

#include <iostream>
using namespace std;

int rmvDup(int arr[], int size);
void bubbleSort(int arr[], int size);

int main()
{
    int arr[10];

    cout << "Enter Array: ";
    for (int i = 0; i < 10; i++)
    {
        cin >> arr[i];
    }

    int newSize = rmvDup(arr, 10);

    for (int i = 0; i < newSize; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}

int rmvDup(int arr[], int size)
{
    if (size == 0)
        return 0;
    else if (size == 1)
        return 1;

    bubbleSort(arr, size);   
    int j = 0;
    for (int i = 0; i < size - 1; i++)
        if (arr[i] != arr[i + 1])
            arr[j++] = arr[i];
    arr[j++] = arr[size - 1];

    size = j;
    return size;
}

void bubbleSort(int arr[], int size)
{
    int swap;
    do
    {
        swap = 0;
        for (int i = 0; i < size - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swap++;
            }
        }
    } while (swap != 0);
}