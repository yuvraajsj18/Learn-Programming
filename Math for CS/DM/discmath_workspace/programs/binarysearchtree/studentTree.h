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

#ifndef STUDENT_TREE_H
#define STUDENT_TREE_H

#include "student.h"
#include <iostream>
#include <string>

// A node in the binary search tree
class StudentNode
{
    private:
        int key;
        Student student;
        StudentNode* leftChild;
        StudentNode* rightChild;
        friend class StudentTree;   // tree needs the access to private mems as they are highly coupled

    public:
        // creates a new node
        StudentNode(Student student, StudentNode* leftChild = NULL, StudentNode* rightChild = NULL);
};

// represent a binary search tree
class StudentTree
{
    private:
        StudentNode* root;

        // add a student node in the tree
        // throws student exception
        void add(StudentNode* student, StudentNode*& parent);

        

        // prints the complete tree
        void print(StudentNode* parent) const;

    public: 
        StudentTree();

        // proxy function to add a node
        void add(Student student);
        
        // proxy function to print
        void print() const;
        
};

#endif