#include "quicksort.h"

void qsort(int arr[], int lo, int hi)
{
    if (lo >= hi)
        return;
    
    int partisian_border = partisian(arr, lo, hi);
    qsort(arr, lo, partisian_border);   // sort the left part of pivot
    qsort(arr, partisian_border + 1, hi);   // sort the right part of pivot
}

int partisian(int arr[], int lo, int hi)
{
    // int mid = (lo + hi) / 2;    // can cause overflow if hi and lo are big enough
    int mid = lo + ((hi - lo) / 2);
    int pivot = arr[mid];
    int i = lo;
    int j = hi;

    while(true)
    {
        while(arr[i] < pivot)    // find bigger or equal element in left of pivot
            i++;            // if no such element than pivot itself
        while(arr[j] > pivot) // find smaller or equal element in right of pivot
            j--;            // if no such element than pivot will do
        if (i >= j) // check if i is not bigger than j if it is than pivot is in right place
            return j;   // j will point to new location of pivot
        std :: swap(arr[i], arr[j]);
        i++;  
        j--;
    }
}