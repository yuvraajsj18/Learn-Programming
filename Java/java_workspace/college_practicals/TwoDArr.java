// 4. use 2 dimentional array - 
import java.util.Scanner;

public class TwoDArr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int twoD[][] = new int[4][];
        System.out.println(twoD.length);
        for (int i = 0; i < twoD.length; i++)
        {
            System.out.print("Col 1: ");
            int col = sc.nextInt();
            twoD[i] = new int [col];
        }
        System.out.println("Input Array:");
        // for (int x[] : twoD)
        // {
        //     for (int y : x)
        //     {
        //         y = sc.nextInt();        // won't change the array content - Error
        //     }
        // }
        for (int i = 0; i < twoD.length; i++)
        {
            for (int j = 0; j < twoD[i].length; j++)
            {
                twoD[i][j] = sc.nextInt();
            }
        }
        System.out.println("Inputted Double Array:");
        for (int x[] : twoD)
        {
            for (int y : x)
            {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}