#ifndef STUDENT_H
#define STUDENT_H

#include <iostream>
#include <exception>
#include <string>

class Student
{
    private:
        int roll;          // roll number of the student
        std :: string name;       // name of the student

    public:
        Student(int roll = -1, std :: string name = "");

        void input();   // takes input for the student
        void print() const;   // prints student details to the console

        int getRoll();
};

class StudentException : public std :: exception
{
    private: 
        std :: string message;

    public:
        StudentException(std :: string message);
        const char* what() const noexcept;
};

#endif