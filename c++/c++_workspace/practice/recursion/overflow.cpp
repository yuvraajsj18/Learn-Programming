#include <iostream>
#include <thread>
#include <chrono>

int main()
{
    int i = 1;

    while(true)
    {
        std :: cout << i << std :: endl;
        i += 100000;
        if (i < 0)
        {
            std :: cout << i << std :: endl;
            break;
        }
    }

    std :: this_thread :: sleep_for(std :: chrono :: seconds(3));

    i = 1;

    while(true)
    {
        std :: cout << i << std :: endl;
        i *= 2;
        if (i == 0)
        {
            std :: cout << i << std :: endl;
            break;
        }
    }

    return 0;
}