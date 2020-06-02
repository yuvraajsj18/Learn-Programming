package demos;

class A
{
    A()
    {
        System.out.println("A paramless constr");
    }
    A(String msg)
    {
        System.out.println("A with msg " + msg);
    }
}

class B extends A
{
    B()
    {
        // super(); impliciltly added by compiler
        System.out.println("B paramless constructor");
    }
    B(String msgB)
    {
        super(msgB);
        System.out.println("B with msg " + msgB);
    }
}

class Constructors
{
    public static void main(String[] args) {
        new A();
        new B();
        new A("\"A msg\"");
        new B("\"B msg\"");
    }
}