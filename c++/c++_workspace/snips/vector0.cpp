#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    vector<int> list;
    list.push_back(1);
    list.push_back(2);
    list.push_back(3);

    for (int i : list)
    {
        cout << i << endl;
    }

    for_each(list.begin(), list.end(), [](int &n) -> void { n = n * n;});

    cout << endl;
    for (int i : list)
    {
        cout << i << endl;
    }
    cout << endl;

    cout << list.capacity() << endl;

    list.push_back(4);
    list.push_back(5);
    cout << list.capacity() << endl;

    cout << endl;
    for (int i : list)
    {
        cout << i << endl;
    }
    cout << endl;

    list.pop_back();
    list.pop_back();
    cout << list.capacity() << endl;

    cout << endl;
    for (int i : list)
    {
        cout << i << endl;
    }
    cout << endl;

    cout << "Vector Vector" << endl;

    vector<vector<int>> vectInt;
    vectInt.push_back(list);

    cout << vectInt[0][1] << endl;

    for (int i : vectInt[0])
    {
        cout << i << " ";
    }
    cout << endl;

    vector<int> list2;
    list2.push_back(100);
    list2.push_back(200);
    list2.push_back(300);
    vectInt.push_back(list2);

    for (auto v : vectInt)
    {
        for (int i : v)
        {
            cout << i << ", ";
        }
        cout << endl;
    }

    return 0;
}
