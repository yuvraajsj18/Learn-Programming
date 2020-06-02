#include <iostream>
#include <thread>
#include <chrono>

using namespace std;

void permute(string str);
void permute(string str, string p);
long factorial(int n);

int main()
{
    string str;
    cout << "Enter String: ";
    cin.clear();
    getline(cin, str);

    cout << "There will be " << factorial(str.length()) << " permutations\n";
    cout << "Starting in three seconds: " << flush;

    for (int i = 0; i < 3; i++)
    {
        this_thread :: sleep_for(chrono :: seconds(1));
        cout << i + 1 << " " << flush;
    }

    cout << endl;

    permute(str);

    return 0;
}

void permute(string str)
{
    permute(str, "");
}

void permute(string str, string p)
{
    int strlen = str.length();
    if (strlen == 0)
    {
        cout << p << endl;
        return;
    }
    else
    {
        for (int i = 0; i < strlen; i++)
        {
            swap(str[0], str[i]);
            permute(str.substr(1, strlen - 1), p + str.substr(0, 1));
        }   
    }
}

long factorial(int n)
{
    if (n <= 1)
        return 1;
    return n * factorial(n - 1);
}
