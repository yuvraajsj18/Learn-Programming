// 3. use a single dimenstional array - linear search program
import java.util.Scanner;

public class OneDArr
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(i + 1 + ". ");
            arr[i] = sc.nextInt();
        }

        int ele;
        System.out.print("Enter element to search: ");
        ele = sc.nextInt();
        boolean found = false;
        for (int x : arr)
        {
            if (ele == x)
            {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println(ele + " is in the arr");
        else
            System.out.println(ele + " is not in the arr");
        
        sc.close();
    }
}