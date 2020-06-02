/*
    Define an abstract class Shape in package P1. 
    Inherit two more classes: Rectangle in package P2 and Circle in package P3. 
    Write a program to ask the user for the type of shape and 
    then using the concept of dynamic method dispatch, display the area of the appropriate  subclass.  
    Also  write  appropriate  methods  to  read  the  data.  
    The  main() function should not be in any package. 
*/

package practical3.p1;
import java.util.Scanner;

abstract public class Shape
{
    protected double area;
    abstract public double area();
    abstract public void readDim(Scanner sc);
    public void dispArea()
    {
        System.out.println("Area of the shape is " + area);
    }
}