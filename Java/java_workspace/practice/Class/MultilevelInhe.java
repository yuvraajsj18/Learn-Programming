class A
{
    A()
    {
        System.out.println("In A");
    }
}

class B extends A
{
    B()
    {
        System.out.println("In B");
    }
}

class C extends B
{
    C()
    {
        System.out.println("In C");
    }
}

class MultilevelInhe
{
    public static void main(String args[])
    {
        A objA = new A();
        System.out.println();
        B objB = new B();
        System.out.println();
        C objC = new C();
        System.out.println();
    }
}