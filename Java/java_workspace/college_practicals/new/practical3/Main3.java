/*
    Define an abstract class Shape in package P1. 
    Inherit two more classes: Rectangle in package P2 and Circle in package P3. 
    Write a program to ask the user for the type of shape and 
    then using the concept of dynamic method dispatch, display the area of the appropriate  subclass.  
    Also  write  appropriate  methods  to  read  the  data.  
    The  main() function should not be in any package. 
*/

import practical3.p2.Rectangle;
import practical3.p3.Circle;
import practical3.p1.Shape;
import java.util.Scanner;

public class Main3
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Shape - Circle or Rectangle: ");
        String shape = sc.nextLine();
        switch(shape.toLowerCase())
        {
            case "circle": 
                getShape(new Circle(), sc);
            break;
            case "rectangle":
                getShape(new Rectangle(), sc);
            break;
            default:
                System.out.println("Invalid Input");
            break;
        }
    }

    static void getShape(Shape shape, Scanner sc)
    {
        shape.readDim(sc);
        shape.dispArea();
    }
}