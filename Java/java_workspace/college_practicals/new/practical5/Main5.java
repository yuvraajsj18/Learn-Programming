/*
    Write  a  program  to  implement  stack.  Use  exception  handling  to  manage  underflow and overflow conditions.
*/

package practical5;
import java.util.Scanner;

class Stack
{
    static final int MAX_SIZE = 10;
    int array[] = new int[MAX_SIZE] ;
    int top;

    void push(int element) throws Overflow
    {
        if (top == MAX_SIZE)
            throw new Overflow(MAX_SIZE);
        array[top++] = element;
    }
    int pop() throws Underflow
    {
        if (top == 0)
            throw new Underflow();
        if (top == 10)
            top--;
        int temp = array[top];
        top--;
        return temp;
    }
}

public class Main5
{
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack();
        do
        {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Quit");
            System.out.println("Enter: ");
            choice = sc.nextInt();
            int ele;
            switch(choice)
            {
                case 1: 
                    try
                    {
                        System.out.print("Enter element: ");
                        ele = sc.nextInt();
                        stack.push(ele);
                        System.out.println("Element pushed");
                    }
                    catch(Overflow e)
                    {
                        System.out.println(e);

                    }
                break;
                case 2:
                    try
                    {
                        ele = stack.pop();
                        System.out.println(ele + " popped");
                    }
                    catch(Underflow e)
                    {
                        System.out.println(e);
                    }
                case 3:
                    break;
                default: 
                    System.out.println("Invalid Input");
                break;
            }
        } while (choice != 3);
    }
}


class StackException extends Exception
{
    StackException(String message)
    {
        super(message);
    }
    StackException()
    {
        super();
    }
}

class Overflow extends StackException
{
    Overflow(int maxSize)
    {
        super(Integer.toString(maxSize));
    }
    public String toString()
    {
        return ("Overflow : MAX_SIZE is " + getMessage());
    }
}

class Underflow extends StackException
{
    public String toString()
    {
        return ("Underflow : Top is at " + 0);
    }
}