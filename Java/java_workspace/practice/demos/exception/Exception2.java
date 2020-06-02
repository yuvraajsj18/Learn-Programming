package exception;

class Exception2
{
    public static void main(String[] args) {
        try
        {
            int d = 0;
            int a = 50 / d;
            System.out.println(a);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}