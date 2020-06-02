/**
    Write a Program to implement Bubble Sort. 
    Find the number of comparisons during each pass and 
    display the intermediate result.
    Use the observed values to plot a graph to analyse the complexity of algorithm.
 */

#include <iostream>
using namespace std;

void getArray(int[], int);
void printArray(int[], int);

int bubbleSortDemo(int arr[],int size);

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

    cout << "Sorting given array with bubble sort\n";

    int total_comp = bubbleSortDemo(num_arr, size);

    cout << "Total number of comparisions: " << total_comp << endl;
    cout << "Bubble Sorted Array: ";
    printArray(num_arr, size);

    return 0;
}

int bubbleSortDemo(int arr[], int size)
{
    bool swapped = false;
    int no_comp, total_comp = 0;
    int temp_size = size;
    int pass = 1;
    do
    {
        swapped = false;
        no_comp = 0;
        cout << "Pass :" << pass++ <<  endl;
        for (int i = 0; i < temp_size - 1; i++)
        {
            no_comp++;
            if (arr[i] > arr[i + 1])
            {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                swapped = true;
            }
        }
        total_comp += no_comp;
        cout << "\tNumber of comparisions: " << no_comp << endl;
        cout << "\tArray Right Now: ";
        printArray(arr, size);
        temp_size--; // little improvement
    } while (swapped);

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