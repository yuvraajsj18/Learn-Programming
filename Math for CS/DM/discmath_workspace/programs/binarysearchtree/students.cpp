/**
 * Classes:
 *          Student: Represent a student as his roll number and name
 *              Data members:
 *                      Roll Number
 *                      Name
 *              member functions:
 *                      param constructor with default args
 *                      input
 *                      print
 *                      getRoll - to get roll number
 */

#include "student.h"
#include "studentTree.h"

#include <iostream>
#include <string>

int main()
{
    StudentTree tree;
    int n;
    std :: cin >> n;
    for (int i = 0; i < n; i++)
    {
        Student s;
        s.input();
        try
        {
            tree.add(s);
        }
        catch(const std::exception& e)
        {
            std::cerr << e.what() << '\n';
        } 
    }

    std :: cout << "All Students:\n";
    tree.print();

    return 0;
}

// Student Functions -

// param constructor with default args
Student :: Student(int roll, std :: string name)
{
    this -> roll = roll;
    this -> name = name;
} 

// takes input for the student
void Student :: input()
{
    std :: cout << "Enter details of the student:\n";
    std :: cout << "Roll: ";
    std :: cin >> roll;
    std :: cout << "Name: ";
    std :: cin.ignore(INT32_MAX, '\n');    // ignores any \n char present in the stream before reading string
    getline(std :: cin, name);
}

void Student :: print() const
{
    std :: cout << "Roll is " << roll << " & name is " << name << std :: endl;
}

int Student :: getRoll()
{
    return roll;
}

// StudentException class functions

StudentException :: StudentException(std :: string message) : message(message) { }

const char* StudentException :: what() const noexcept
{
    return message.c_str();
}

