/*
    Write a Program to create a SET A and determine the cardinality of SET
    for an input array of elements (repetition allowed) and 
    perform the following operations on the SET:
    a)ismember (a, A): checkwhether an element belongs to set 
        or not and return value as true/false.
    b)powerset(A):list all the elements of power set of A.
*/

#include <iostream>
#include <cmath>
using namespace std;

void inputSet(int arr[], int size);
int rmvDup(int arr[], int size);
bool isMem(int arr[], int size, int ele);
void print(int arr[], int size);
void showPowerSet(int set[], int size);
void bubbleSort(int arr[], int size);

int main()
{
    int size;
    cout << "Enter the number of elements you want to enter: ";
    cin >> size;
    int set[size];

    cout << "Enter the elements:\n";
    inputSet(set, size);

    size = rmvDup(set, size);
    cout << "The cardinality of the set is " << size << endl;
    print(set, size);

    cout << "Enter element to check if its an element: ";
    int ele;
    cin >> ele;
    bool isEleMem = isMem(set, size, ele);
    if (isEleMem)
        cout << ele << " is a member\n";
    else
        cout << ele << " is not a member\n";

    showPowerSet(set, size);

    return 0;
}

void inputSet(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << i + 1 << ". ";
        cin >> arr[i];
    }
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

bool isMem(int arr[], int size, int ele)
{
    for (int i = 0; i < size; i++)
        if (arr[i] == ele)
            return true;
    return false;
}

void print(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
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

void showPowerSet(int set[], int size)
{
    int pow_size = pow(2, size);
    for (int counter = 0; counter < pow_size; counter++)
    {
        for (int j = 0; j < size; j++)
        {
            if (counter & (1 << j))
                cout << set[j];
        }
        cout << endl;
    }
}