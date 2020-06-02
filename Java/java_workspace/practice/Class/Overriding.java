class A
{
    int i, j;
    void show()
    {
        System.out.println("A");
    }
    void msg()
    {
        System.out.println("Msg");
    }
}

class B extends A
{
    int k;

    void show()     // overriding
    {
        super.show();
        System.out.println("B");
    }

    void msg(String msg)    // Overloading
    {
        System.out.println(msg);
    }
}

class Overriding
{
    public static void main(String args[])
    {
        A AobjA = new A();
        AobjA.show();
        AobjA.msg();
        B BobjB = new B();
        BobjB.show();
        BobjB.msg();
        BobjB.msg("Bmsg");

        System.out.println();

        A AobjB = new B();
        AobjB.show();
        AobjB.msg();
        // AobjB.msg("ABmsg");
        // B objA = new A();   // sub class cant refer to super class
    }
}