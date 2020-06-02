package demos;

interface Outer
{
    void outer();
    interface Inner
    {
        void inner();
    }
}

class NestedInterface implements Outer, Outer.Inner
{
    public void outer()
    {
        System.out.println("Outer in Main");
    }
    public void inner()
    {
        System.out.println("Inner in Main");
    }
    public static void main(String[] args) {
        NestedInterface obj = new NestedInterface();
        obj.outer();
        obj.inner();
        Outer obj1 = new NestedInterface();
        // obj1.inner();
        obj1.outer();
    }
}

class OuterC
{
    void outer()
    {
        System.out.println("outer");
    }
    interface Inner
    {
        void inner();
    }
}

class Demo extends OuterC
{
    public static void main(String[] args) {
        System.out.println("in demo");
    }
}

class Demo1 implements Demo.Inner
{
    public void inner()
    {
        System.out.println("inner in demo1");
    }
    public static void main(String[] args) {
        new Demo1().inner();
    }
}