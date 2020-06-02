package demos;

// class A
// {
//     static int x;
//     // {
//     //     x = 0;
//     // }
//     A()
//     {
//         x = 0;
//     }
// }

// class Final {
//     public static void main(String[] args) {
//         System.out.println(A.x++);
//         System.out.println(A.x);
//         new A();
//         System.out.println(A.x++);
//         new A();
//         System.out.println(A.x);
//     }
// }

class A
{
    final int x;
    int y;
    static int z;
    {
        x = 1;
        y = 2;
        z = 3;
    }
    A()
    {
        ;
    }
    int meth()
    {
        // x = 10;
        final int y;
        y = 20;
        return y;
    }
}

class Final
{
    public static void main(String[] args) {
        System.out.println(new A().x  + " " + new A().meth());
        meth(1,2);
    }

    static void meth( int a, final int b)
    {
        a = 10;
        // b = 5;
    }
}