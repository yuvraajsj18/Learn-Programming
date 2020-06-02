package objectio;

import java.io.Serializable;

public class Student implements Serializable
{
    private static final long serialVersionUID = 2718224595862739540L;
    private String name;
    private int roll;
    public static int count;

    Student(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
        count++;
    }

    public void print()
    {
        System.out.println(roll + " " + name);
    }
}