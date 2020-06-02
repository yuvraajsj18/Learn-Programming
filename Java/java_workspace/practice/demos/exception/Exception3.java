package exception;

class Exception3
{
    public static void main(String[] args) {
        try
        {
            int d = 0;
            int a = 50 / d;
            System.out.println(a);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
        // catch (ArithmeticException e)        // UNreachable
        // {
        //     e.printStackTrace();
        //     System.out.println(e);
        // }
    }
}