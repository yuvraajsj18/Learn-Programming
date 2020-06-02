class Demo
{   
    int x;
    Demo()
    {
        x = 50;
        System.out.println("Parameterless constructor " + x);
    }
    Demo(int i)
    {
        x = i;
        System.out.println("Parameter constructor " + x);
    }
    Demo(Demo obj)
    {
        this.x = obj.x;
        System.out.println("Copy constructor " + x);
    }

    void test()
    {
        System.out.println("Void Method");
    }
    // int test()   // duplicate method - parameter list must be different in overloading
    // {
    //     System.out.println("Int Method");
    //     return 0;
    // }

    void test(int i)
    {
        System.out.println("Int Parameter : " + i);
    }

    int test(double d)
    {
        System.out.println("double Parameter : " + d);
        return 0;
    }

    void test(float f)
    {
        System.out.println("float Parameter : " + f);
    }
}

class Overloading
{
    public static void main(String args[])
    {
        Demo obj = new Demo();
        obj.test();
        obj.test(3);
        obj.test(3.4);
        obj.test(5.2f);
        obj.test(1.1);
        obj.test(23.3f);

        Demo newObj = new Demo(3);
        newObj = new Demo(obj);
    }
}