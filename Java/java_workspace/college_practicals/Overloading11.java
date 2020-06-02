// show that in function overloading if no matching argument is found then
// java will do automatic type conversion from lower to higher data type

class Overloading
{
    void test()
    {
        System.out.println("No parameter test");
    }

    void test(int a, int b)
    {
        System.out.println("2 parameter test(ints) - " + a + " & " + b);
    }

    void test(double a)
    {
        System.out.println("1 parameter test(doubles) - " + a);
    }
}

class Overloading11
{
    public static void main(String args[])
    {
        Overloading obj = new Overloading();
        obj.test();
        obj.test(1,2);
        obj.test(10.12);

        System.out.println("int promoted to double as no single int function");
        obj.test(10);
    }
}