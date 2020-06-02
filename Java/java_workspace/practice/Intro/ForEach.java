class ForEach 
{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5};
        int sum = 0;
        for(int x : arr)
            sum+= x;
        System.out.println("Sum = " + sum);

        for (int x : arr)
        {
            x *= 2;
            System.out.println("x = " + x);
        }
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}