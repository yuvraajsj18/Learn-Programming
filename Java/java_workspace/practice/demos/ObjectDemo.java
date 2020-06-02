package demos;

class A
{
    int a;
    int b;
    A(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(Object obj)
    {
        // If the object is compared with itself then return true   
        if (obj == this) { 
            return true; 
        } 
        // check if obj is of A or not
        if (!(obj instanceof A))
            return false;
        A objA = (A) obj;

        // real comparision
        if (this.a == objA.a && this.b == objA.b)
            return true;
        else
            return false;
    }
}

class B
{
    int a;
    int b;
    B(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
}

class ObjectDemo
{
    public static void main(String[] args) {
        A a1 = new A(1, 2);
        A a2 = new A(1, 2);
        A a3 = new A(1, 3);

        System.out.println(a1.equals(a2));
        System.out.println(a1.equals(a3));

        B b1 = new B(1, 2);
        System.out.println(a1.equals(b1));

        System.out.println(a1.getClass());

        Object obj = new String("Test"); 
        Class c = obj.getClass(); 
        System.out.println("Class of Object obj is : "
                           + c.getName()); 

        Object a4 = new A(3,4);
        System.out.println(a4.getClass());

        System.out.println(a1.hashCode());
        System.out.println(a1);
        System.out.println(a1.toString());
    }
}