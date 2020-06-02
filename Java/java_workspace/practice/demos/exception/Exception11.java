package exception;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String msg, Throwable cause)
    {
        super(msg, cause);
    }
}

class Exception11
{
    public static void main(String[] args) {
        try
        {
            int a = 50 / 0;
            System.out.println(a);
        }
        catch(ArithmeticException e)
        {
            try
            {
                throw new InvalidAgeException("Invalid age", e);
            }
            catch(InvalidAgeException myE)
            {
                System.out.println(myE + "  :  " + myE.getCause());
            }
        }
    }
}