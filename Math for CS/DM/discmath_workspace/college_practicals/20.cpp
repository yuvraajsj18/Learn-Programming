/*
    Given a full m-ary tree with i internal vertices, Write a Program to find the number of leaf nodes.
*/

#include <iostream>
using namespace std;

int main()
{
    int m;
    do
    {
        cout << "Enter m for m-ary tree: ";
        cin >> m;
    } while (m < 0);

    int i;
    do
    {
        cout << "Enter number of internal vertices: ";
        cin >> i;
    } while (i < 0);

    int leafs = (i * (m - 1)) + 1;

    cout << "Number of leafs = " << leafs << endl;

    return 0;
}