package Class;

class Demo
{
    private int aPriv = 40; // default = 0
    private void methPriv()
    {
        System.out.println("This is a private method " + aPriv);
    }
    public int aPub;
    public void methPub()
    {
        System.out.println("This is a public method");
        System.out.println("I am calling a private method");
        methPriv();
    }
}

class AccessModifier0
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        // obj.aPriv = 10;
        // obj.methPriv();
        obj.aPub = 50;
        System.out.println("obj.aPub = " + obj.aPub);
        obj.methPub();
    }
}