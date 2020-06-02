import java.util.Scanner;

class Swap
{
    int x, y;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Swap obj = new Swap();

        System.out.print("Enter x: ");
        obj.x = sc.nextInt();
        System.out.print("Enter y: ");
        obj.y = sc.nextInt();

        obj.swap();
        System.out.println("After Swap:");
        System.out.println("x : " + obj.x);
        System.out.println("y : " + obj.y);
    }

    void swap()
    {
        int temp = x;
        x = y;
        y = temp;
    }
}