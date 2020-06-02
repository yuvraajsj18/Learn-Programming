// Write a Program to implement binary search using recursion

#include <iostream>
using namespace std;

void bubbleSort(int num[], int size);
bool binarySearch(int [], int, int, int);

int main()
{
    int size;
    cout << "Enter size: ";
    cin >> size;

    int num[size];
    cout << "Enter numbers: ";
    for (int i = 0; i < size; i++)
        cin >> num[i];

    bubbleSort(num, size);

    cout << "Sorted Array: ";
    for (int i = 0; i < size; i++)
        cout << num[i] << " ";
    cout << endl;

    cout << "Enter a number to check if its in the array through binary search: ";
    int ele;
    cin >> ele;

    bool found = binarySearch(num, 0, size, ele);
    if (found)
        cout << "Element is present" << endl;
    else
        cout << "Element is not present" << endl;

    return 0;
}

bool binarySearch(int num[], int start, int end, int ele)
{
    int mid = (start + end) / 2;
    if (num[mid] == ele)    
        return true;
    else if (start > end)
        return false;
    else if (ele > num[mid])
        return binarySearch(num, mid + 1, end, ele);
    else if (ele < num[mid])
        return binarySearch(num, start, mid - 1, ele); 
}


void bubbleSort(int num[], int size)
{
    bool swapped = false;
    do
    {
        swapped = false;
        for (int i = 0; i < size - 1; i++)
        {
            if (num[i] > num[i + 1])
            {
                int temp = num[i];
                num[i] = num[i + 1];
                num[i + 1] = temp;
                swapped = true;
            }
        }
        size--; // little improvement
    } while (swapped);
    
}