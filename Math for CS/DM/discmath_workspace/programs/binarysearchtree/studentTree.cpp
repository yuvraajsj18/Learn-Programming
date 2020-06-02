/**
 * Classes:
 *          1. StudentNode: A node in the binary search tree
 *              data members:
 *                      key - an integer key that is same as the roll number of student
 *                      student - every node contains a student
 *                      rightChild - the right child of the node
 *                      leftChild - the left child of the node
 *              member function:
 *                      constructor to create a new node
 *          2. StudentTree: represent a binary search tree
 *                          contains access to all the nodes through the root
 *                          and do all the function related to the working of a tree
 *                  data members: 
 *                      root - a studentNode that is the root of the tree
 *                  member functions:
 *                      add - to add a new node in our tree at correct position
 *                      search - to search for the presence of a particular node in the tree
 *                      delete - to remove a node from our tree
 *                      print - to print the complete tree by traversing
 */

#include "studentTree.h"

// functions of StudentNode

// constructor
StudentNode :: StudentNode(Student student, StudentNode* leftChild, StudentNode* rightChild)
{
    this -> key = student.getRoll();
    this -> student = student;
    this -> leftChild = leftChild;
    this -> rightChild = rightChild;
}

// functions of StudentTree

// constructor
StudentTree :: StudentTree()
{
    this -> root = NULL;
}

// proxy function to print
void StudentTree :: print() const
{
    // start printing from top
    print(this -> root);
}
// real function to print
void StudentTree :: print(StudentNode* parent) const
{
    if (!parent)
        return;
    // prints left childs
    print(parent -> leftChild);
    // prints actual data
    (parent -> student).print();
    // prints right childs
    print(parent -> rightChild);
}

// ADD

// Proxy function to add
void StudentTree :: add(Student student)
{
    StudentNode* newStudent = new StudentNode(student);
    add(newStudent, this -> root);
}
// real function to add
void StudentTree :: add(StudentNode* newStudent, StudentNode*& parent)
{
    if (!parent)
        parent = newStudent;
    else if (newStudent -> key < parent -> key)
        add(newStudent, parent -> leftChild);
    else if (newStudent -> key > parent -> key)
        add(newStudent, parent -> rightChild);
    else if (newStudent -> key == parent -> key)
        throw StudentException("Student Already Exists\n");
}
