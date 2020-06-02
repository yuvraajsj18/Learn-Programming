class Final
{
    final int a;// = 10;
    // {
    //     a = 9;
    // }
    Final()
    {
        a = 8;
    }
    // void init()
    // {
    //     a = 8;
    // }
    int b;
}

class FinalChild extends Final
{
    void show()
    {
        System.out.println(a);
        // a++;
        System.out.println(a);
    }
}

class FinalInit
{
    public static void main(final String args[]) {
        final Final obj = new Final();
        // obj.a = 10;
        System.out.println(obj);
        System.out.println(obj.hashCode());
        System.out.println("a = " + obj.a);
        System.out.println("b = " + obj.b);

        FinalChild ob1 = new FinalChild();
        ob1.show();
    }
}