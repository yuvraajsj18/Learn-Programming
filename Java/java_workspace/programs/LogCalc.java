// function to calculate log of a given base to a given number
// double log (int base, int number);

import java.util.Scanner;

public class LogCalc
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextInt();
        System.out.print("Enter number: ");
        double number = sc.nextInt();
        // LogCalc obj = new LogCalc();
        double log = log(base, number);
        System.out.println("Log base " + base + " to " + number + " is " + log);
        sc.close();
    }

    static double log(double base, Double number)
    {
        double log = 0;
        while (number > 1)
        {
            number /= base;
            log++;
        }
        return log;
    }
}