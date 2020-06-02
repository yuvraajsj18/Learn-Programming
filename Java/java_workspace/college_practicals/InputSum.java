// 7. input numbers from keyboard and total number of number as cmd arg and calculate sum

import java.util.Scanner;

public class InputSum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = Integer.parseInt(args[0]);
        System.out.println("Enter Numbers:");
        int sum = 0;
        for (int i = 0; i < totalNumbers; i++)
        {
            System.out.print(i + 1 + ": ");
            int num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum is " + sum);
        sc.close();
    }
}