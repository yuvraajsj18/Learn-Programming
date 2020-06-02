package exception;


class Exception12
{
    public static void main(String[] args) {
        try
        {
            NullPointerException e = new NullPointerException("Null Excp");
            e.initCause(new ArithmeticException("Arithmetic Excp"));
            // e.initCause(new IOException());  // IllegalStateException
            throw e;
        }
        catch (NullPointerException e)
        {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}