package exception;

import java.io.IOException;

class Exception13
{
    public static void main(String[] args) {
        try
        {
            throw new ArithmeticException("AE");
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}