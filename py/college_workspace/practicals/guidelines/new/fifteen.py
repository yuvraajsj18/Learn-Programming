"""
Define a class Student to store their name and marks in three subjects.
Use a class variable to store the maximum average marks of the class.
Use ctor and dtor to init and destory the objects.
"""

from math import inf

class Student:
    max_avg_marks:int = -inf

    def __init__(self, name:str, marks:list):
        self.name = name
        self.marks = marks

        if sum(marks) / len(marks) > Student.max_avg_marks:
            Student.max_avg_marks = sum(marks) / len(marks)

        print("Created a student: ", self)

    def __del__(self):
        print("Destroying student:", self)

    def __str__(self):
        return f"Student - name: {self.name}, marks: {self.marks}"

def main():
        students = []

        for i in range(3):
            print("Enter details for student", i + 1)
            name = input("name: ")
            marks = list(map(int, input("marks(3 subjects sep by space): ").split()))
            students.append(Student(name, marks))
            print()

        print(f"Maximum average marks is {Student.max_avg_marks:0.4f}")

        print("Calling destructor for students")
        print()

        del students    

if __name__ == "__main__":
    main()

"""OUTPUT:
Enter details for student 1
name: Harry
marks(3 subjects sep by space): 60 70 80 
Created a student:  Student - name: Harry, marks: [60, 70, 80]

Enter details for student 2
name: Hermione
marks(3 subjects sep by space): 90 90 100
Created a student:  Student - name: Hermione, marks: [90, 90, 100]

Enter details for student 3
name: Ron
marks(3 subjects sep by space): 50 60 70
Created a student:  Student - name: Ron, marks: [50, 60, 70]

Maximum average marks is 93.3333
Calling destructor for students

Destroying student: Student - name: Ron, marks: [50, 60, 70]
Destroying student: Student - name: Hermione, marks: [90, 90, 100]
Destroying student: Student - name: Harry, marks: [60, 70, 80]
"""
