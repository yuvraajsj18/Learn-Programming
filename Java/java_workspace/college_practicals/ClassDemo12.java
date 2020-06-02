/*
    Write a program to show the differences between public and private access specifier. The program should also show that primitive data types are passed by value and objects are passed by refrence and to learn use of final keyword.
*/

class Demo
{
    private int privateNum;
    final private int finalPrivInt = 50;
    final public int finalPubInt;
    {
        finalPubInt = 51;
    }
    private void privateMeth()
    {
        System.out.println("This is a private method");
    }
    private void anotherPrivMeth()
    {
        System.out.println("This is a another private method called from a method");
        System.out.println("private Num From Method: " + privateNum); 
    }
    public int publicNum;
    final public void publicMeth()  // final method
    {
        anotherPrivMeth();
        System.out.println("This is a public Method");

        System.out.println("Final Private Int = " + finalPrivInt);
        // System.out.println("Final Private Int ++ = " + finalPrivInt++); // Error
    }

    public void Change(int num) // pass by value
    {
        num *= 2;
        System.out.println("number in method: " + num);
    }
    public void Change(Demo obj)    // pass by reference
    {
        obj.publicNum *= 2;
        System.out.println("object in method: " + publicNum);
    }
}

final class Demo1 extends Demo
{
    public void demo1Meth()
    {
        System.out.println("Demo 1 Method");
    }
    // public void publicMeth()
    // {
    //     System.out.println("Overriding publicMeth in Demo1");
    //     // Error : final method can not be overriden    
    // }
}

// class Demo2 extends Demo1   // Error : inheriting final class
// {
//     public void demo2Meth()
//     {
//         System.out.println("Demo 2 Method");
//     }
// }

class ClassDemo12
{
    public static void main(String args[])
    {
        Demo obj = new Demo();

        obj.publicNum = 50;     // Valid
        System.out.println("obj.publicNum = " + obj.publicNum);

        // obj.privateNum = 51;    // Error
        // System.out.println("obj.privateNum = " + obj.privateNum);

        obj.publicMeth();   // Valid
        // obj.privateMeth();  // Error
        
        int number = 50;
        System.out.println("primitive data type before calling change method: " + number);
        obj.Change(number);
        System.out.println("primitive data type after calling change method: " + number);
        System.out.println("No change in primitive data type thus pass by value");


        System.out.println("Object before calling change method: " + obj.publicNum);
        obj.Change(obj);
        System.out.println("Object after calling change method: " + obj.publicNum);
        System.out.println("change in object thus pass by reference");

        Demo1 obj1 = new Demo1();
        obj1.demo1Meth();
        obj1.publicMeth();  // Demo class publicMeth Called

        // obj.finalPubInt = 51;    // cannot be initialised

        System.out.println("obj.finalPubInt = " + obj.finalPubInt);
        // System.out.println("obj.finalPubInt++ = " + obj.finalPubInt++);  
    }
}