#include <iostream> 
using namespace std; 
  
void permute(int a[], int size, int n);
void printArr(int a[],int n);

int main() 
{ 
    int size;
    cout << "Enter size: ";
    cin >> size;

    int arr[size];
    cout << "Enter numbers:\n";
    for (int i = 0; i < size; i++)
        cin >> arr[i];
    
    permute(arr, size, size); 
    return 0; 
}

void printArr(int a[],int n) 
{ 
    for (int i=0; i<n; i++) 
        cout << a[i] << " "; 
    printf("\n"); 
} 
  
void permute(int a[], int size, int n) 
{ 
    // if size becomes 1 then prints the obtained 
    // permutation 
    if (size == 1) 
    { 
        printArr(a, n); 
        return; 
    } 
  
    for (int i=0; i<size; i++) 
    { 
        permute(a,size-1,n); 
  
        // if size is odd, swap first and last 
        // element 
        if (size%2==1) 
            swap(a[0], a[size-1]); 
  
        // If size is even, swap ith and last 
        // element 
        else
            swap(a[i], a[size-1]); 
    } 
} 
  