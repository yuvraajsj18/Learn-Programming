/*
    Use the functions defined in Ques 3 to check whether the given relation is:
    a)Equivalent (reflexive, symmetric and transitive), or
    b)Partial Order relation (reflexive, antisymmetric and transitive), or
    c)None
*/

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

int main(void)
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

    bool isEquivalent = r.isSymmetric() && r.isReflexive() && r.isTransitive();
    bool isPartialOrder = r.isAntiSymmetric() && r.isReflexive() && r.isTransitive();

    if (isEquivalent)
        cout << "Its an equivalence relation\n";
    if (isPartialOrder)
        cout << "Its an Partial Order Relation\n";
    if (!isEquivalent && !isPartialOrder)
        cout << "Not an equivalent or partial order relation" << endl;

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