class Demo
{
    int x;
    void meth(final int a)
    {
        // a++;
        System.out.println("a = " + a);
    }
    void change()
    {
        x++;
    }
}

class Final
{
    public static void main(String args[])
    {
        final Demo obj = new Demo();
        obj.meth(1);
        obj.change();
        System.out.println(obj.x);
        // obj = null;
    }
}