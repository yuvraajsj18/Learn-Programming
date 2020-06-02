package exception;

import java.io.FileNotFoundException;

class Exception4
{
    public static void main(String[] args) {
        try
        {
            int d = 0;
            int a = 50 / d;
            System.out.println(a);
            throw new FileNotFoundException();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
            System.out.println(e);   
        }
        catch (ArithmeticException e)      
        {
            e.printStackTrace();
            System.out.println(e);
        }
    }
}