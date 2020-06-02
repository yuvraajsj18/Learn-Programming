#include <iostream>
using namespace std;

void solveTower(int num_disk, char src, char dest, char aux, int& count);
int solveTower(int num_disk);
void moveDisk(char src, char dest);

int main()
{
    int num_disk;
    cout << "Enter number of disk: ";
    cin >> num_disk;
    int steps = solveTower(num_disk);
    cout << "Total number of steps:  " << steps << endl; 

    return 0;
}

int solveTower(int num_disk)
{
    int count = 0;
    solveTower(num_disk, '1', '3', '2', count);
    return count;
}

void solveTower(int num_disk, char src, char dest, char aux, int& count)
{
    if (num_disk < 1)
        return;
    else if (num_disk == 1)
    {
        count++;
        moveDisk(src, dest);
    }
    else
    {
        solveTower(num_disk - 1, src, aux, dest, count);
        count++;
        moveDisk(src, dest);
        solveTower(num_disk - 1, aux, dest, src, count);   
    }   
}

void moveDisk(char src, char dest)
{
    cout << "Move top disk from " << src << " to " << dest << endl;
}