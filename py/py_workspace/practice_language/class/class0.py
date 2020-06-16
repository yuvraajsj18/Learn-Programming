# creating classes in python

import re;  # importing regex

class Student:
    
    def __init__(self, name, age, year):
        self.name = name
        self.age = age
        self.year = year

    def print_details(self):
        print(f'Name : {self.name}, Age : {self.age}, year : {self.year}')
    
    def set_year(self, new_year):
        self.year = new_year



if __name__ == '__main__':
    print("Enter Students: ")
    enter_more = True
    students = []
    while(enter_more):
        # get details
        name = input("Enter Name: ")
        age = int(input("Enter age: "))
        year = int(input("Enter year: "))

        # make student and update in list
        student = Student(name, age, year)
        students.append(student)

        # ask for more student
        pattern = ".*y(es)?.*"
        enter_more = re.match(pattern, input("Want to enter more students(yes/no): ").lower())

    print("\nHere is the list of all students")

    for student in students:
        student.print_details()