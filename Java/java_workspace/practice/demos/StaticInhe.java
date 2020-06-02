package demos;

class A
{
    static int a;
    static void staticA()
    {
        System.out.println("Static A from A " + a++);
    }
    void methA()
    {
        System.out.println("meth A from A");
    }
}

class B extends A {
    static int a = 3;   // will be reinitialised
    static void staticA()   // redifining
    {
        System.err.println("Static A from B " + a++);
    }
    void methA()    // overriding
    {
        System.out.println("meth A from B");
    }
}

class C extends A {
    // inheriting A
}

class StaticInhe
{
    public static void main(String[] args) {
        A a = new A();
        a.methA();
        A.staticA();
        System.out.println();

        B.staticA();
        B b = new B();
        b.methA();
        B.staticA();
        System.out.println();

        C c = new C();
        c.methA();
        C.staticA();
        C.a = 10;
        C.staticA();
        A.staticA();
        System.out.println();

        a = b;
        a.methA();
        a.staticA();    // always A will be called not overridden
        System.out.println();

        B.staticA();
        System.out.println();

        C.staticA();
    }
}