// 6. check input number is prime or not

import java.util.Scanner;

public class CheckPrime
{
    public static void main(String args[])
    {
        System.out.print("Enter a number to check if its a prime: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= number / 2; i++)
        {
            if (number % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            System.out.println(number + " is a prime");
        else
            System.out.println(number + " is not a prime");
            sc.close();
    }
}