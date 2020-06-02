package objectio;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number of students: ");
        int noStudents = Integer.parseInt(input.nextLine());

        for (int i = 0; i < noStudents; i++)
        {
            Student s = inputStudent();
            
            try(ObjectOutputStream writeStudent = new ObjectOutputStream(new FileOutputStream("./objectio/students.txt", true)))
            {
                writeStudent.writeObject(s);
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }

        System.out.println("All Students Wrote");

        System.out.println("Student List: ");
        try(ObjectInputStream readStudent = new ObjectInputStream(new FileInputStream("./objectio/students.txt")))
        {
            // Student s = null;
            try
            {
                // int counted = 0;
                // while(counted < Student.count)
                // {
                //     Student s = (Student) readStudent.readObject();
                //     s.print();
                // }
                ArrayList <Student> students = new ArrayList <Student>();
                students = (ArrayList <Student>) readStudent.readObject();
                for (int i = 0; i < Student.count; i++)
                    students.get(i).print();
                
            }
            catch (ClassNotFoundException e)
            {
                e.printStackTrace();
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    static Student inputStudent()
    {
        String name;
        int roll;
        System.out.print("Name: ");
        name = input.nextLine();
        System.out.print("Roll: ");
        roll = Integer.parseInt(input.nextLine());
        return new Student(name, roll);
    }
}