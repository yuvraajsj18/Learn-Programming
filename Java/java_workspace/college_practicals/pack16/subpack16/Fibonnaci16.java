/*  
    Write a program to create a multilevel package and also create a reusable class to generate fibonacci series, where the function to generate fibonacci series is given in a different file belonging to same package
*/

package pack16.subpack16;

//import pack16.subpack16.Fseries;
import java.util.Scanner;

class Fibonnaci16
{
    public static void main(String[] args) {
        Fseries series = new Fseries();
        int terms;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        terms = sc.nextInt();
        for (int i = 0; i < terms; i++)
        {
            System.out.print(series.fibTerm(i) + " "); 
        }
        System.out.println();
    }
}