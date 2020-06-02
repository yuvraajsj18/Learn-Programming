/*
    Given a graph G, Write a Program to find the number of paths of length n between the source 
    and destination entered by the user. 
*/ 

#include <iostream>
using namespace std;

int** matrix_multiply(int **mat1, int **mat2, int size);

class Graph
{
    int **adj_mat;      // adjacency matrix representing our graph - A[n][n]
    int size;           // no of vertex makes the size of matrix

    bool validate();

    public: 
        Graph(int size);

        void input();
        void print();
        
        int find_no_of_path(int length, int src, int dest);

        ~Graph()
        {
            for (int i = 0; i < size; i++)
                delete[] adj_mat[i];
            delete[] adj_mat; 
        }
};

int main()
{
    cout << "Enter number of vertices: ";
    int vertices;
    cin >> vertices;
    Graph g(vertices);
    cout << "Enter Adjacency Matrix:\n";
    g.input();
    cout << "Entered Matrix is:\n";
    g.print();

    int src;
    do
    {
        cout << "Source: ";
        cin >> src;
    }while (src >= vertices);

    int dest;
    do
    {
        cout << "Destination: ";
        cin >> dest;
    } while (dest >= vertices);

    cout << "Enter Length of Path: ";
    int length;
    cin >> length;
    
    int no_of_paths = g.find_no_of_path(length, src, dest);
    cout << "No of paths between source = " << src << " and destination = " << dest << " is " << no_of_paths << endl;

    return 0;
}

int Graph :: find_no_of_path(int length, int src, int dest)
{
    int **adj_mat_length = new int*[size];
    for (int i = 0; i < size; i++)
    {
        adj_mat_length[i] = new int[size];
        for (int j = 0; j < size; j++)
            adj_mat_length[i][j] = adj_mat[i][j];
    }
    for (int i = 0; i < length / 2; i++)
        adj_mat_length =  matrix_multiply(adj_mat_length, adj_mat_length, size);

    int result = adj_mat_length[src][dest];

    for(int i = 0; i < size; i++)
        delete[] adj_mat_length[i];

    delete[] adj_mat_length;

    return result;
}

Graph :: Graph(int size)
{
    this -> size = size;
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
            cout << "Enter proper adjacency matrix without negative numbers" << endl;
    } while (!valid);
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
            if (adj_mat[i][j] < 0) 
                return false;
    return true;
}

// fn to multiply two sq matrix
int** matrix_multiply(int** mat1, int** mat2, int size)
{
    int **result;
    result = new int*[size];

    for (int i = 0; i < size; i++)
    {
        result[i] = new int[size]; 
        for (int k = 0; k < size; k++)
        {
            result[i][k] = 0;
            for (int j = 0; j < size; j++)
            {
                result[i][k] += mat1[i][j] * mat2[j][k];
            }
        }
    }
    return result;
}