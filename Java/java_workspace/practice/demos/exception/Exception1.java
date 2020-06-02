package exception;

class Exception1
{
    public static void main(String[] args) {
        callMethod();
    }
    private static void callMethod()
    {
        calculate();
    }
    private static int calculate()
    {
        return 5 / 0;
    }
}