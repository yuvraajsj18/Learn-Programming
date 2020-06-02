// 2.find factorial of a given number
import java.util.Scanner;

public class Factorial
{
    public static void main(String args[])
    {
        int number;
        System.out.print("Enter a number to find factorial: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++)
        {
            factorial *= i;
        }

        sc.close();
        System.out.println("Factorial of " + number + " is " + factorial);
    }   
}