package demos;

class A
{
    void show()
    {
        System.out.println("A");
    }
}
class B extends A
{
    void show()
    {
        System.out.println("B");
    }
}

class C extends A
{
    void show()
    {
        System.out.println("C");
    }
}

class RuntimePoly
{
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        callMethod(a);
        callMethod(b);
        callMethod(c);
    }

    public static void callMethod(A a)
    {
        a.show();
    }
}