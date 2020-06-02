// Write a Program to accept a directed graph G and compute the in-degree and out-degree of each vertex.

#include <iostream>
using namespace std;

class Graph
{
    int adjMat[100][100];
    int size;

    public:

        Graph(int adjMat[][100] = NULL, int size = 0)
        {
            this -> size = size;
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    this -> adjMat[i][j] = adjMat[i][j];
                }
            }
        }

        void inputSize()
        {
            cout << "Enter Size: ";
            cin >> size;
        }

        void input()
        {
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    do
                    {
                        cin >> adjMat[i][j];
                    } while (adjMat[i][j] < 0);
                }
            }
        }

        void output()
        {
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    cout << adjMat[i][j] << " ";
                }
                cout << endl;
            }
        }

        void OutDegree()
        {
            for (int i = 0; i < size; i++)
            {
                int sum = 0;
                for (int j = 0; j < size; j++)
                {
                    sum += adjMat[i][j];
                }
                cout << i + 1 << "th element's " << "Out Degree is " << sum << ".\n";
            }
        }
        void InDegree()
        {
            for (int j = 0; j < size; j++)
            {
                int sum = 0;
                for (int i = 0; i < size; i++)
                {
                    sum += adjMat[j][i];
                }
                cout << j + 1 << "th element's " << "Out Degree is " << sum << ".\n";
            }
        }
};

int main()
{
    Graph g;
    g.inputSize();
    g.input();

    cout << "Inputted Graph is " << endl;
    g.output();

    cout << "Out Degree of each vertex:\n";
    g.OutDegree();
    cout << "In Degree of each vertex:\n";
    g.InDegree();

    return 0;
}