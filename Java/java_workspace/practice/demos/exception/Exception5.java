package exception;

class Exception5
{
    public static void main(String[] args) {
        try
        {
            int a = args.length;
            int b = 50 / a;
            try
            {
                if (a == 1)
                    a = a / (a - a);
                if (a == 2)
                {
                    int c[] = {1};
                    c[88] = 2;
                }
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                    System.out.println(e);
                    System.out.println("My catch Block 1");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("My catch block 2");
        }
    }
}