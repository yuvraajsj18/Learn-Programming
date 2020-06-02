/*
    Create a class SET and take two sets as input from user 
    to perform following SET Operations:
    a)Subset: Check whether one set is a subset of other or not.
    b)Union and Intersection of two Sets.
    c)Complement: Assume Universal Set as per the input elements from the user.
    d)Set Difference and Symmetric Difference between two SETS
    e)Cartesian Product of Sets.
*/

#include <iostream>
using namespace std;

void bubbleSort(int arr[], int size);
int binarySearch(int arr[], int size, int ele);
class Set
{
    int set[100];
    int size;

    public:
    Set (int set[] = NULL, int size = 0);

    void input();
    void print();
    void rmvDup();
    bool checkSubset(Set otherSet);
    Set unionWith(Set otherSet);
    Set intersctnWith(Set otherSet);
    Set complement(Set universal);
    Set difference(Set otherSet);
    Set symDiff(Set otherSet);
    void cartProd(Set otherSet);    // only print
};

int main()
{
    Set s1, s2;
    cout << "Enter Set 1(s1):\n";
    s1.input();
    s1.print();
    cout << endl;

    cout << "Enter Set 2(s2):\n";
    s2.input();
    s2.print();
    cout << endl;

    cout << "is s2 subset of s1: ";
    bool checkSubset = s1.checkSubset(s2);
    cout << boolalpha << checkSubset << endl;

    cout << "Union of s1 and s2: ";
    Set unionSet = s1.unionWith(s2);
    unionSet.print();
    cout << endl;

    cout << "Intersection of s1 and s2: ";
    Set interSctn = s1.intersctnWith(s2);
    interSctn.print();
    cout << endl;

    cout << "Complement of s1 with respect to universe:\n";
    cout << "Enter element in universal set (the element of Set 1 and 2 are already included):\n";
    Set universal;
    universal.input();
    universal = universal.unionWith(unionSet); 
    cout << "Complement: ";
    Set complement = s1.complement(universal);
    complement.print();
    cout << endl;

    cout << "Difference (s1 - s2): ";
    Set diff = s1.difference(s2);
    diff.print();
    cout << endl;

    cout << "Sym Diff of s1 and s2: ";
    Set symDiff = s1.symDiff(s2);
    symDiff.print();
    cout << endl;

    cout << "Cart Prod of s1 and s2:\n";
    s1.cartProd(s2);
    cout << endl;

    return 0;
}

Set :: Set (int set[], int size)
{
    for (int i = 0; i < size; i++)
    {
        this -> set[i] = set[i];
    }
    this -> size = size;

    rmvDup();
}

void Set :: input()
{
    cout << "Input size: ";
    cin >> size;
    for (int i = 0; i < size; i++)
    {
        cout << i + 1 << ". ";
        cin >> set[i];
    }
    rmvDup();
}

void Set :: print()
{
    if (size == 0)
    {
        cout << "{ }";
    }
    else
    {   
        cout << "{";
        for (int i = 0; i < size; i++)
        {
            cout << set[i];
            if (i != size - 1)
                cout << ", ";
        }
        cout << "}";
    }
}

void Set :: rmvDup()
{
    if (size == 0 || size == 1)
        return;

    bubbleSort(set, size);
    int j = 0;
    for (int i = 0; i < size - 1; i++)
    {
        if (set[i] != set[i + 1])
            set[j++] = set[i];
    }
    set[j++] = set[size - 1];
    size = j;
}

bool Set :: checkSubset(Set otherSet)
{
    if (otherSet.size > this -> size)
        return false;
    
    for (int i = 0; i < otherSet.size; i++)
    {
        if (binarySearch(this -> set, this -> size, otherSet.set[i]) == -1) // not found
        {
            return false;
        }   
    }
    return true;
}

Set Set :: unionWith(Set otherSet)
{
    Set unionSet;
    for (int i = 0; i < this -> size; i++)
    {
        unionSet.set[unionSet.size++] = this -> set[i]; 
    }
    for (int i = 0; i < otherSet.size; i++)
    {
        unionSet.set[unionSet.size++] = otherSet.set[i]; 
    }
    unionSet.rmvDup();
    return unionSet;
}

Set Set :: intersctnWith(Set otherSet)
{
    Set intersctnSet;
    for (int i = 0; i < this -> size; i++)
    {
        if (binarySearch(otherSet.set, otherSet.size, this -> set[i]) != -1)
        {
            intersctnSet.set[intersctnSet.size++] = this -> set[i];
        }
    }
    return intersctnSet;
}

Set Set :: complement(Set universal)    // U - this
{
    Set complementSet = universal.difference(*this);
    return complementSet;
}

Set Set :: difference(Set otherSet) // this - otherSet
{
    Set differenceSet;
    for (int i = 0; i < this -> size; i++)
    {
        if (binarySearch(otherSet.set, otherSet.size, this -> set[i]) == -1)  // not found
        {
            differenceSet.set[differenceSet.size++] = this -> set[i]; 
        }
    }
    return differenceSet;
}

Set Set :: symDiff(Set otherSet)
{
    Set unionSet = this -> unionWith(otherSet);
    Set interSctnSet = this -> intersctnWith(otherSet);
    Set symDiffSet = unionSet.difference(interSctnSet);
    return symDiffSet;
}

void Set :: cartProd(Set otherSet)  // only printing the cart product for now
{
    cout << "{";
    for (int i = 0; i < this -> size; i++)
    {   
        for (int j = 0; j < otherSet.size; j++)
        {
            cout << "(" << this -> set[i] << ", " << otherSet.set[j] << ")";
            if (j != otherSet.size - 1)
                cout << ", ";
        }
    }
    cout << "}";
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

int binarySearch(int arr[], int size, int ele)  // return -1 if not found else returns index of element
{
    int start = 0;
    int end = size - 1;
    while (start <= end)
    {
        int mid = (start + end) / 2;
        if (arr[mid] == ele)
        {
            return mid;
        }
        else if (arr[mid] < ele)
        {
            start = mid + 1;
        }
        else
        {
            end = mid - 1;
        }
    }
    return -1;
}