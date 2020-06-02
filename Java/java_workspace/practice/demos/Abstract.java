package demos;

// A java program to demonstrate  
// use of abstract keyword. 
  
// abstract with class 
abstract class A  
{ 
    // abstract with method 
    // it has no body 
    A()
    {
        System.out.println("A's contr");
    }
    abstract void m1(); 
      
    // concrete methods are still allowed in abstract classes 
    void m2() 
    { 
        System.out.println("This is a concrete method."); 
    } 
} 
  
// concrete class B 
class B extends A  
{ 
    B()
    {
        System.out.println("B's constr");
    }
    // class B must override m1() method 
    // otherwise, compile-time exception will be thrown 
    void m1() { 
        System.out.println("B's implementation of m1."); 
    } 

    void bMeth()
    {
        System.out.println("B's own method");
    }
      
      
} 
  
// Driver class 
public class Abstract
{ 
    public static void main(String args[])  
    { 
        B b = new B(); 
        b.m1(); 
        b.m2(); 
        b.bMeth();
        A a = new B();
        a.m1();
        a.m2();
        // a.bMeth();
    } 
} 