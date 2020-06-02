#include <iostream>
// using namespace std;

template <typename type>
void swap(type& var1, type& var2);

int main()
{
    int int1, int2;
    std :: cout << "Enter Two Intergers: ";
    std :: cin >> int1 >> int2;

    char ch1, ch2;
    std :: cout << "Enter two Characters: ";
    std :: cin >> ch1 >> ch2;

    double f1, f2;
    std :: cout << "Enter Two Floats: ";
    std :: cin >> f1 >> f2;

    swap(int1, int2);
    // std :: swap(f1, f2);
    swap(f1, f2);
    swap(ch1, ch2);

    std :: cout << "After swap Values:\n";
    std :: cout << int1 << " " << int2 << std :: endl;
    std :: cout << ch1 << " " << ch2 << std :: endl;
    std :: cout << f1 << " " << f2 << std :: endl;
    return 0;
}

template <typename type>
void swap(type& var1, type& var2)
{
    type temp = var1;
    var1 = var2;
    var2 = temp;
}