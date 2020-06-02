// show 1d array use

import java.util.Scanner;

class OneDArr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        for (int i = 0; i <  arr.length; i++)
        {
            System.out.print((i + 1) + ". ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int x : arr)
            sum += x;

        float avg = sum / arr.length;

        System.out.println("Average of given numbers is " + avg);

        sc.close();
    }
}