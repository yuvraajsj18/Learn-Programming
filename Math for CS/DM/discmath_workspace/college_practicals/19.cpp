/*  
    Given  an  adjacency  matrix  of  a  graph,  write  a  program  to check  whether
    a  given  set  of vertices {v1,v2,v3.....,vk} forms an Euler path/ Euler Circuit(for circuit assume vk=v1).
*/

#include <iostream>
using namespace std;


class Graph
{
    private:
        int **adj_mat;      // adjacency matrix representing our graph - A[n][n]
        int size;           // no of vertex makes the size of matrix

        int *degrees;       // point to an array containing degree of all vertices
;
    bool validate();
    void setDegrees();

    public: 
        Graph(int size);

        void input();
        void print();

        ~Graph()
        {
            for (int i = 0; i < size; i++)
                delete[] adj_mat[i];
            delete[] adj_mat; 
            delete[] degrees;
        }

        // returns count of number of vertices with odd degrees
        int isEulerian();
        bool isConnected(int vertices[], int size);
};

int main()
{
    int vertices;
    do
    {
        cout << "Enter Vertices: ";
        cin >> vertices;
    } while (vertices < 0);

    Graph g(vertices);
    cout << "Enter Adjacency Matrix for Graph:\n";
    g.input();

    int isEulerian = g.isEulerian();
    if (isEulerian == 0)
        cout << "Graph has a euler circuit\n";
    else if (isEulerian == 2)
        cout << "Graph has a euler path\n";
    else if (isEulerian = -2)
        cout << "Non zero degree vertices are not connected therefore no euler path or circuit exist\n";
    else 
        cout << "Graph does not has euler circuit or euler path\n";

    return 0;
}


Graph :: Graph(int size)
{
    this -> size = size;

    degrees = new int[size];
    for (int i = 0; i < size; i++)
        degrees[i] = 0;

    adj_mat = new int*[size];
    for (int i = 0; i < size; i++)
    {
        adj_mat[i] = new int[size];
        for (int j = 0; j < size; j++)
            adj_mat[i][j] = 0;     // indicating no edges
    }
}

void Graph :: input()
{
    bool valid = false;
    do
    {
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size; j++)
            {
                cin >> adj_mat[i][j];
            }
        }
        valid = validate();
        if (!valid)
            cout << "Enter proper adjacency matrix" << endl;
    } while (!valid);

    setDegrees();
} 

void Graph :: print()
{
    for (int i = 0; i < size; i++)
    {
        for (int j = 0; j < size; j++)
        {
            cout << adj_mat[i][j] << " ";
        }
        cout << endl;
    }
}

bool Graph :: validate()
{
    for (int i = 0; i < size; i++)
        for (int j = 0; j < size; j++)
        {
            if (adj_mat[i][j] < 0) 
                return false;
            if (adj_mat[i][j] != adj_mat[j][i]) // if matrix is not symmetrical because in undirected graph if a and b has an edge so do b and a
                return false;   
        }

    return true;
}

void Graph :: setDegrees()
{
    for (int i = 0; i < size; i++)
        for (int j = 0; j < size; j++)
            degrees[i] += adj_mat[i][j];
}


// returns count of number of vertices with odd degrees
// if count = 0 then euler circuit
// if count = 2 then euler path
// if count = -2 then graph is not connected for non zero degree vertices
// otherwise return -1 indicating none
int Graph :: isEulerian()
{
    int non_zero_vertices[size];
    int non_zero_count = 0;
    for (int i = 0; i < size; i++)
        if (degrees[i] > 0)
            non_zero_vertices[non_zero_count++] = i;
    
    if (!(isConnected(non_zero_vertices, non_zero_count)))
        return -2;  // indicating not connected

    int countOdd = 0;
    for (int i = 0; i < size; i++)
        if (degrees[i] & 1)     // if odd
            countOdd++;
    
    if (countOdd != 0 && countOdd != 2)
        return -1;
    return countOdd;
}

bool Graph :: isConnected(int vertices[], int size)
{
    bool visited[size]  = {false};
    visited[0] = true;
    for (int i = 0, u = 0; i < size; i++)
    {
        if(adj_mat[u][i] == 1 && !visited[i])
        {
            visited[i] = true;
            u = i;
            i = 0;
        }
    }
    for (int i = 0; i < size; i++)
        if (!visited[i])
            return false;

    return true;
}

/*
0 1 0 0 1 0 0
1 0 0 0 1 0 0
0 0 0 1 1 0 0 
0 0 1 0 1 0 0
1 1 1 1 0 0 0
0 0 0 0 0 0 1
0 0 0 0 0 1 0

0 1 0 0 1
1 0 0 0 1 
0 0 0 1 1  
0 0 1 0 1 
1 1 1 1 0 
*/