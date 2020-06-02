package exception;

class Exception9
{
    static void demoProc()
    {
        try
        {
            throw new NullPointerException("Demo");
        }
        finally
        {
            System.out.println("I am in Finally Block");
        }
    }
    public static void main(String[] args) {
        try
        {
            demoProc();
        }
        catch(NullPointerException e)
        {
            System.out.println("caught: " + e);
        }    
    }
}