"""
Use dict to store marks of the students in 4 subjects. Write a function to find the name of 
the student securing highest pecentage.
"""

def main():
    students = []

    num_students = int(input("Enter number of students: "))

    for i in range(num_students):
        print("Student", i + 1)
        student = {}
        name = input("Enter name: ")
        student['name'] = name
        marks = {}
        for i in range(4):
            mark = int(input(f"Enter marks in subject {i + 1}: "))
            marks[f'subject-{i+1}'] = mark
        student['marks'] = marks
        students.append(student)

    highest_score_student = get_highest_score_student(students)

    print(highest_score_student['name'], 'scored the highest')

def calculate_percentage(student:dict, total=400) -> float:
    percentage = (sum(student['marks'].values()) / total) * 100
    return percentage

def get_highest_score_student(students):
    return max(students, key=calculate_percentage)


if __name__ == "__main__":
    main()

"""
Enter number of students: 3
Student 1
Enter name: Harry
Enter marks in subject 1: 70
Enter marks in subject 2: 60
Enter marks in subject 3: 70
Enter marks in subject 4: 60
Student 2
Enter name: Ron
Enter marks in subject 1: 50
Enter marks in subject 2: 60
Enter marks in subject 3: 50
Enter marks in subject 4: 60
Student 3
Enter name: Hermione
Enter marks in subject 1: 100
Enter marks in subject 2: 90
Enter marks in subject 3: 100
Enter marks in subject 4: 100
Hermione scored the highest
"""

