package demos;

abstract interface I1
{
    int CONST = 100;
    void methI1();
    public default void methI2()
    {
        System.out.println("methI2 in I1");
    }
}

class A implements I1
{
    public void methI1()
    {
        System.out.println("I am I1's method implemented in A");
    }
    public void methI2()
    {
        I1.super.methI2();
        System.out.println("methI2 in A");
    }
}

class B implements I1
{
    int CONST = I1.CONST + 100;
    public void methI1()
    {
        System.out.println("I am I1's method implemented in B");
    }
}

class Interface
{
    public static void main(String[] args) {
        // using i/f meth from class's objects
        A a = new A();
        a.methI1();
        B b = new B();
        b.methI1();

        // RTP
        I1 i1 = new A();
        i1.methI1();
        I1 i2 = new B();
        i2.methI1();

        // shared constants
        System.out.println(A.CONST);
        System.out.println(b.CONST);
        System.out.println(I1.CONST);

        System.out.println();

        // defaults methods
        a.methI2();
        b.methI2();

    }
}
