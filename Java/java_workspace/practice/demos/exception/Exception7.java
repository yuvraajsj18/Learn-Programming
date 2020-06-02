package exception;

class Exception7
{
    static void demoProc()
    {
        try
        {
            throw new NullPointerException("Demo");
        }
        catch(NullPointerException e)
        {
            System.out.println("Caught");
            throw e;
        }
    }
    public static void main(String[] args) {
        try
        {
            demoProc();
        }
        catch(NullPointerException e)
        {
            System.out.println("Recaught: " + e);
        }    
    }
}