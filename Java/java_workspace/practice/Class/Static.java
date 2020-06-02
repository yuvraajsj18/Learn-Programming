class Dog
{
    static int dogCount;// = 2;

    Dog()
    {
        System.out.println("Added a Dog");
        dogCount++;
    }

    // void meth()
    // {
    //     System.out.println("Meth()");
    // }
}

class Static extends Dog
{
    static int c = 1;
    static {
        c = 3;
        c++;
    }
    public static void main(String args[])
    {
        System.out.println("c = " + c);
        System.out.println("Start Main");
        Dog D1 = new Dog();
        System.out.println(Dog.dogCount);
        Dog D2 = new Dog();
        meth1();
        System.out.println(Dog.dogCount);
        System.out.println(Dog.dogCount);

        new Dog();
        System.out.println(Dog.dogCount); 
        
        meth();
        // D1.meth();
    }
    static void meth1()
    {
        // static int c = 0;    can not be static
        System.out.println("Calling main()");
        String s[] = {"S"};
        if (c++ < 3)    // to avoid infinite loop
            main(s);
    }
    static void meth()
    {
        System.out.println("static meth()");
    }
    // void meth()
    // {
    //     System.out.println("Meth()");
    // }
}