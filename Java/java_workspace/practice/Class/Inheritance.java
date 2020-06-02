class Super
{
    int aSuper;
    int a = 50;
    void printSuper()
    {
        System.out.println("This is super");
    }
}

class Sub extends Super
{
    int aSub;
    int a = 51;
    void printSub()
    {
        System.out.println("This is Sub");
        System.out.println(a);
        System.out.println(super.a);
        System.out.println("This is Sub");
    }
}

class Inheritance
{
    public static void main(String args[])
    {
        Super objSuper = new Super();
        Sub objSub = new Sub();

        objSuper.printSuper();
        objSub.printSub();

        objSuper.aSuper = 10;
        System.out.println(objSuper.aSuper);
        objSub.aSub = 20;
        System.out.println(objSub.aSub);
        objSub.aSuper = 30;
        System.out.println(objSub.aSuper);
        System.out.println(objSuper.aSuper);
        System.out.println(objSuper.aSuper);

        System.out.println(objSuper.a);
        System.out.println(objSub.a);
    }
}