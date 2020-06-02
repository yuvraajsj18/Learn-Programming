package b;

import a.A;

class B extends A {
    void methB() {
    System.out.println(x);
    meth();
    // A a = new A();
    // a.meth();
    // System.out.println(a.x);
    B b = new B();
    b.meth();
    System.out.println(b.x);

    A a = new A();
    a.aMeth();

    // A Ab = new B();
    // Ab.meth();
    // System.out.println(Ab.x);

    // B Ba = (B) new A();
    // Ba.meth();
    // System.out.println(Ba.x);
    }
    public static void main(String[] args) {
        new B().methB();
    }
}

class C
{
    public static void main(String[] args) {
        // new B().meth();
        new B().methB();
        new B().aMeth();
    }
}

class D extends B
{
    void methD()
    {
        meth();
    }
    public static void main(String[] args) {
        new D().methD();
    }
}