/*
    Define an abstract class Shape in package P1. 
    Inherit two more classes: Rectangle in package P2 and Circle in package P3. 
    Write a program to ask the user for the type of shape and 
    then using the concept of dynamic method dispatch, display the area of the appropriate  subclass.  
    Also  write  appropriate  methods  to  read  the  data.  
    The  main() function should not be in any package. 
*/

package practical3.p2;
import practical3.p1.Shape;
import java.util.Scanner;

public class Rectangle extends Shape
{
    double length, breadth;

    @Override
    public void readDim(Scanner sc)
    {
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Breadth: ");
        breadth = sc.nextDouble();
        area();
    }

    @Override
    public double area()
    {
        area = length * breadth;
        return area;    // not needed but can be useful
    }

    @Override
    public void dispArea()
    {
        System.out.println("Area of the Rectangle is " + String.format("%.6f", area));
    }
    
}
