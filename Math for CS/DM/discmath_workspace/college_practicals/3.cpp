// Create a class RELATION, use Matrix notation to represent a relation. 
// Include functions to check if a relation is reflexive, 
// Symmetric, Anti-symmetric and Transitive. 
// Write a Program to use this class.

#include <iostream>
using namespace std;

class Relation
{
    int size;   // size of the set on which relation is defined
    int **relation;

    bool validate();

    public:
        Relation(int size);
        void input();
        void print();

        bool isReflexive();
        bool isSymmetric();
        bool isAntiSymmetric();
        bool isTransitive();
};

int main()
{
    int size;
    cout << "Enter size of the set on which relation is defined: ";
    cin >> size;
    Relation r(size);
    cout << "Enter Matrix representation of relation:\n";
    r.input();
    cout << "Entered Matrix is: " << endl;
    r.print();
    cout << endl;

    cout << "Relation has following properties:\n";
    if (r.isReflexive())
        cout << "Reflexive" << endl;
    if (r.isSymmetric())
        cout << "Symmetric" << endl;
    if (r.isAntiSymmetric())
        cout << "Anti Symmetric" << endl;
    if (r.isTransitive())
        cout << "Transitive" << endl;

    return 0;
}

Relation :: Relation(int size)
{
    this -> size = size;

    // creating a matrix with just sufficient dimentions
    relation = new int*[size];
    for (int i = 0; i < size; i++)
    {
       relation[i] = new int[size];
       for (int j = 0; j < size; j++)
            relation[i][j] = 0;     // indicating no relation initially
    }
}


void Relation :: input()
{
    // user will enter 1 if rln btw i and j otherwise 0
    bool valid;
    do
    {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                cin >> relation[i][j];
        valid = validate();
        if (!valid)
            cout << "Invalid Entries, enter again" << endl;
    } while (!valid);
}

void Relation :: print()
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
            cout << relation[i][j] << " ";
        cout << endl;
    }
}

bool Relation :: isReflexive()
{
    for (int i = 0; i < size; i++)
    {
        if (relation[i][i] != 1)
            return false;       // some entry is not 1 on diagonal 
    }
    return true;    // all entries on diagonal are 1
}

bool Relation :: isSymmetric()
{
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (relation[i][j] != relation[j][i])
                return false;
        }
    }
    return true;
}

bool Relation :: isAntiSymmetric()
{
    for (int i = 0; i < size; i++)
    {
        for (int j = i + 1; j < size; j++)
        {
            if (relation[i][j] == 1 && relation[j][i] == 1)
                return false;
        }
    }
    return true;
}

bool Relation :: isTransitive()
{
    for (int a = 0; a < size; a++)
        for (int b = 0; b < size; b++)
            if (relation[a][b] && a != b) // == 1 there is a rln btw i and j
            {
                for (int j = 0; j < size; j++)
                    if (relation[b][j] && !relation[a][j] && b != j)
                        return false;
            } 
    return true;
}

bool Relation :: validate()
{
    for (int i = 0; i < size; i++)
        for (int j = 0; j < size; j++)
            if (!(relation[i][j] == 0 || relation[i][j] == 1))
                return false;    // invalid 
    return true;    // valid
}