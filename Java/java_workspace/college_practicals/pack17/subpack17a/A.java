/*
    write a program that illustrate different levels of protection
    in classes/subclasses belonging to the same package or 
    different package.
*/

package pack17.subpack17a;

public class A
{
    public void pubM()
    {
        System.out.println("\tPublic Method Can be Accessed");
    }
    protected void proM()
    {
        System.out.println("\tProtected Method Can be Accessed");
    }
    void defM()
    {
        System.out.println("\tDefault Method Can be Accessed");
    }
    private void priM()
    {
        System.out.println("\tPrivate Method Can be Accessed");
    }

    public void check()
    {
        System.out.println("Accessing from Same Class");
        pubM();
        proM();
        defM();
        priM();
        System.out.println();

        SubA objSubA = new SubA();
        objSubA.check();
        NonA objNonA = new NonA();
        objNonA.check();
    }
}

class SubA extends A
{
    public void check()
    {
        System.out.println("Accessing from Sub Class Same Package");
        pubM();
        proM();
        defM();
        // priM();  // non visible
        System.out.println();
    }
}

class NonA
{
    void check()
    {
        System.out.println("Accessing from Non Sub Class Same Package");
        A objA = new A();
        objA.pubM();
        objA.proM();
        objA.defM();
        // objA.priM();  // non visible
        System.out.println();
    }
}