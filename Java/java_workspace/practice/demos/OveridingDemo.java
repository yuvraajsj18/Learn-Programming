package demos;

class A {
    int i, j;
    void show() {
        System.out.println("A");
    }
}

class B extends A {
    int k;
    void show() {   // overriding
        super.show();
        System.out.println("B");
        System.out.println();
    }
    void show(String msg)
    {
        System.out.println(msg);
    }
    void meth()
    {
        super.show();
        show();
    }
}

class OveridingDemo {
    public static void main(String[] args) {
        B b = new B();

        b.show();      // B
        // b.super.show();
        b.show("message");

        b.meth();

        A a = new A();
        a.show();       // A
        // a.show("message");

        a = b;
        a.show();   // B
        // a.show("message a");
    }
}