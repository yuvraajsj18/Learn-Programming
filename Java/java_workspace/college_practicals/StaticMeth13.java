/*
    Write a program to show the use of static function and to pass variable length arguments in a function
*/

class Demo
{
    public static int sum(int ... v)
    {
        int sum = 0;
        for (int x : v)
        {
            sum += x;
        }
        return sum;
    }
}

class StaticMeth13
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        int sum = Demo.sum(arr);
        System.out.println("Sum = " + sum);
    }
}