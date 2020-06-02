// swap two integers

class Swap
{
    public static void main(String args[])
    {
        Integer a = 50;
        Integer b = 51;

        System.out.println("Before Swap:");
        System.out.println("a = " + a + " b = " + b);

        swapNums(a, b);
        System.out.println("Before Swap:");
        System.out.println("a = " + a + " b = " + b);
    }

    static void swapNums(Integer a, Integer b)
    {
        int temp = a;
        a = b;
        b = temp;
    }
}