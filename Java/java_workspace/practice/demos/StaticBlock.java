package demos;

// class A
// {
//     static int x;
//     int c;
//     static {
//         System.out.println("x in static block = " + x); // will be 0 when class loaded
//         System.out.println("static block 1 executing");
//         x = 10;
//         // c = 5; // non static can not be set from static
//         System.out.println("x set to 10");
//     }

//     static {
//         System.out.println("static block 2 executing");
//         x = 20;
//         System.out.println("x set to 20");
//     }
    
//     A()
//     {
//         System.out.println("Constructor executing");
//         x = 30; // static can be set from non static
//         c = 5;
//         System.out.println("x set to 30");
//     }
// }

class A
{
    static int x;
    int c;
    static {
        System.out.println("x in static block = " + x); // will be 0 when class loaded
        System.out.println("static block 1 executing");
        x = 10;
        // c = 5; // non static can not be set from static
        System.out.println("x set to 10");
    }

    static {
        System.out.println("static block 2 executing");
        x = 20;
        System.out.println("x set to 20");
    }
    
    A()
    {
        System.out.println("Constructor executing");
        x = 30; // static can be set from non static
        c = 5;
        System.out.println("x set to 30");
    }

    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println("A.x = " + A.x);
        System.out.println("c = " + new A().c);
        System.out.println("A.x = " + A.x); 
    }
}

class StaticBlock
{
    public static void main(String[] args) {
        System.out.println("Main Start");
        System.out.println("A.x = " + A.x);
        System.out.println("c = " + new A().c);
        System.out.println("A.x = " + A.x);
    }
}