// Write  a  Program to  represent  Graphs  using  the  Adjacency  Matrices  and  check  if  it  is  a complete graph.

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

        bool checkComplete()
        {
            for (int i = 0; i < size; i++)
            {
                for (int j = 0; j < size; j++)
                {
                    if (adjMat[i][j] <= 0 && i != j) 
                        return false;
                }
            }
            return true;
        }
};

int main()
{
    Graph g1;
    g1.inputSize();
    g1.input();
    g1.output();
    if(g1.checkComplete())
        cout << "Complete\n";
    else
        cout << "Not Complete\n";

    return 0;
}