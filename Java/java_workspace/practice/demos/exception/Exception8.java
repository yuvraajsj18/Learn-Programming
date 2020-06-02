package exception;

class Exception8
{
    static void throwOne() throws IllegalAccessException
    {
        throw new IllegalAccessException();
    }

    public static void main(String[] args) throws IllegalAccessException {
        throwOne();
        // try
        // {
        //     throwOne();
        // }
        // catch(IllegalAccessException e)
        // {
        //     System.out.println(e);
        // }
    }
}