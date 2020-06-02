// 1. find sum of any number of integers entered as command line arguments

public class CmdLineSum
{
    public static void main(String args[])
    {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
        {
            int number = Integer.parseInt(args[i]);
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}