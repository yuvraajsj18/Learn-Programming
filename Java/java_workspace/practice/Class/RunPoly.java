class A
{
    void dispA()
    {
        System.out.println("A");
    }
}

class B extends A
{
    void dispB()
    {
        System.out.println("B");
    }
}

class C extends B
{
    void dispC()
    {
        System.out.println("C");
    }
}

class RunPoly
{
    public static void main(String args[])
    {
        B b = new B();
        C c = new C();
        callMethod(b);
        callMethod(c);
    } 
    public static void callMethod(A a)
    {
        a.dispA();
    }
}