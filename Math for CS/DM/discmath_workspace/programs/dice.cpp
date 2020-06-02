#include <iostream>
#include <cstdlib>
#include <ctime>
#include <iomanip>

using namespace std;

int main()
{   
    srand(time(NULL));

    int frequency[11] = {0};

    for (int i = 0; i < 100000; i++)
    {
        int diceA = (rand() % 6) + 1;
        int diceB = (rand() % 6) + 1;
        int sum = diceA + diceB;
        frequency[sum - 1]++;
    }

    cout << setfill('0');
    for (int i = 0; i < 11; i++)
    {
        cout << setw(3);
        cout << i + 1 << " | " << frequency[i] << endl;
    }

    for (int i = 0; i < 11; i++)
    {
        cout << setw(3);
        cout << i + 1 << " |  ";
        while (frequency[i])
        {
            cout << "-";
            frequency[i] /= 2;
        }
        cout << endl;
    }

    return 0;
}