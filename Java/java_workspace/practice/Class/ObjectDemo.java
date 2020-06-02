class A
{
    int a, b;

    A()
    {
        a = 3;
        b = 4;
    }
}

class ObjectDemo
{
    public static void main(String args[])
    {
        A obj1 = new A();
        A obj2 = new A();
        A obj3 = obj2;

        System.out.println(obj1.equals(obj2));
        System.out.println(obj2.equals(obj3));
    }
}