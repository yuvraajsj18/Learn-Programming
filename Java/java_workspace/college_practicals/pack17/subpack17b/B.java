package pack17.subpack17b;

import pack17.subpack17a.A;

class B
{
    public static void main(String[] args) {
        A objA = new A();
        objA.check();

        NonA objNonA = new NonA();
        objNonA.check();

        SubA objSubA = new SubA();
        objSubA.check();
    }
}

class NonA  // no naming conflict as in different package then of A
{
    void check()
    {
        System.out.println("Accessing from Non Sub Class Different Package");
        A objA = new A();
        objA.pubM();
        // objA.proM(); // non visible
        // objA.defM();     // non visible
        // objA.priM();  // non visible
        System.out.println();
    }
}

class SubA extends A
{
    public void check()
    {
        System.out.println("Accessing from Sub Class Different Package");
        pubM();
        proM();
        // defM();  // non visible
        // priM();  // non visible
        System.out.println();
    }
}