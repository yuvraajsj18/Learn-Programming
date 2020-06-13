#include <iostream>

int main()
{

    // refrences in c++

    int a = 10;
    std :: cout << "a = " << a << std :: endl;

    int& r_a = a;
    std :: cout << "r_a = " << r_a << std :: endl;

    a = 50;
    std :: cout << "a = " << a << std :: endl;
    std :: cout << "r_a = " << r_a << std :: endl;

    r_a = 100;
    std :: cout << "a = " << a << std :: endl;
    std :: cout << "r_a = " << r_a << std :: endl;

    std :: cout << std :: endl;

    int b = -10;
    r_a = b;

    std :: cout << "a = " << a << std :: endl;
    std :: cout << "r_a = " << r_a << std :: endl;

    std :: cout << "b = " << b << std :: endl;
    
    b = 1000;

    std :: cout << "a = " << a << std :: endl;
    std :: cout << "r_a = " << r_a << std :: endl;

    std :: cout << "b = " << b << std :: endl;

    std :: cout << std :: endl << std :: endl;

    // pointers in c++

    int n = 10;
    int *p;// = new int;
    p = &n;

    std :: cout << "n = " << n << std :: endl;
    std :: cout << "&n = " << &n << std :: endl;
    std :: cout << "*&n = " << *&n << std :: endl;
    // std :: cout << "&*n = " << &*n << std :: endl;
    std :: cout << "*p = " << *p << std :: endl;
    std :: cout << "p = " << p << std :: endl;
    std :: cout << "*&p = " << *&p << std :: endl;
    std :: cout << "&*p = " << &*p << std :: endl;

    std :: cout << std :: endl;

    *p = 50;
    std :: cout << "n = " << n << std :: endl;
    std :: cout << "*p = " << *p << std :: endl;

    n = 100;
    std :: cout << "n = " << n << std :: endl;
    std :: cout << "*p = " << *p << std :: endl;

    std :: cout << std :: endl;

    int *q = p;
    std :: cout << "q = " << q << std :: endl;
    std :: cout << "*q = " << *q << std :: endl;

    *q = 200;
    std :: cout << "*q = " << *q << std :: endl;
    std :: cout << "n = " << n << std :: endl;
    std :: cout << "*p = " << *p << std :: endl;

    n = 1000;
    std :: cout << "*q = " << *q << std :: endl;
    std :: cout << "n = " << n << std :: endl;
    std :: cout << "*p = " << *p << std :: endl;

    std :: cout << std :: endl;

    int m = -10;
    q = &m;
    std :: cout << "m = " << m << std :: endl;
    std :: cout << "*q = " << *q << std :: endl;
    std :: cout << "n = " << n << std :: endl;
    std :: cout << "*p = " << *p << std :: endl; 


    return 0;
}