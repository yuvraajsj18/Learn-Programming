#include <iostream>
#include <cstring>
// using namespace std;

template <typename type>
type isBigger(type first, type second);

template < >
const char* isBigger(const char* first, const char* second);

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

    std :: cout << isBigger(int1, int2) << " is bigger\n";
    std :: cout << isBigger(ch1, ch2) << " is bigger\n";
    std :: cout << isBigger(f1, f2) << " is bigger\n";
    
    // std :: cout << isBigger(int1, f2) << " is bigger\n";    
    std :: cout << isBigger <double> (int1, f2) << " is bigger\n"; // type convertion

    std :: cout << isBigger("B", "AA") << " is bigger\n";

    const char *s1 = "C";
    const char *s2 = "DD";

    std :: cout << isBigger(s1, s2) << " is Bigger" << std :: endl;

    return 0;
}

template <typename type>
type isBigger(type first, type second)
{
    if (first > second)
        return first;
    return second;
}

// template specialisation
template < >
const char* isBigger(const char* first, const char* second)
{
    if (strcmp(first, second) > 0)
        return first;
    return second;
}