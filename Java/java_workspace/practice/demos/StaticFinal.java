package demos;

class A
{
    static final int x = 0;
    static int y = 1;
    int a = 100;
}

class B extends A
{
    static final int x = A.x + 11;
    static int y = A.y + 1;
    int a = super.a + 101;
}

class StaticFinal
{
    public static void main(String[] args) {
        System.out.println(A.x);
        System.out.println(A.y);
        System.out.println(B.x);
        System.out.println(B.y);

        System.out.println(new A().a);
        System.out.println(new B().a);
        System.out.println(((A) new B()).a);
    }
}