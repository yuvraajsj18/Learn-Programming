/*
    Write a Program to implement Insertion Sort. 
    Find the number of comparisons during each pass and 
    display the intermediate result. 
    Use the observedvalues to plot a graphto analyse the complexity of algorithm.
*/

#include <iostream>
using namespace std;

void getArray(int[], int);
void printArray(int[], int);

int insertionSortDemo(int arr[],int size);

int main()
{
    int size;
    cout << "Enter size: ";
    cin >> size;

    int num_arr[size];
    cout << "Enter your unsorted number array:\n";
    getArray(num_arr, size);

    cout << "You entered: ";
    printArray(num_arr, size);

    cout << "Sorting given array with insertion sort\n";

    int total_comp = insertionSortDemo(num_arr, size);

    cout << "Total number of comparisions: " << total_comp << endl;
    cout << "Insertion Sorted Array: ";
    printArray(num_arr, size);
    
    return 0;
}

int insertionSortDemo(int arr[], int size)
{
    int pass = 0;
    int no_comp, total_comp = 0;
    for (int i = 1; i < size; i++)
    {
        no_comp = 0; 
        cout << "pass " << ++pass << endl;
        int j = i - 1;
        int to_sort = arr[i];
   
        while (j >= 0 && arr[j] > to_sort)
        {
            no_comp++; 
            arr[j + 1] = arr[j];
            j--; 
        }
        arr[j + 1] = to_sort;

        total_comp += no_comp;
        cout << "\tNumber of comparisions: " << no_comp << endl;
        cout << "\tArray Right Now: ";
        printArray(arr, size);
    }
    return total_comp;
}

void getArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
    {
        cout << i + 1 << "> ";
        cin >> arr[i];
    }
}

void printArray(int arr[], int size)
{
    for (int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;
}