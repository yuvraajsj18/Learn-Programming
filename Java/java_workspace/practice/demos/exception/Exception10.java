package exception;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}

class Exception10
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try
        {
            int age = sc.nextInt();
            validate(age);
        }
        catch(InvalidAgeException e)
        {
            System.out.println(e);
        }
    }
    static void validate(int age) throws InvalidAgeException
    {
        if (age < 18)
            throw new InvalidAgeException("Invalid age");
        else
            System.out.println("Valid age");
    }
}