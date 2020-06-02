package demos;

abstract interface A
{
    default int getNum()
    {
        return 20;
    } 
    static void stMeth()
    {
        System.out.println("stMeth A");
    }
}

interface B extends A
{
    default int getNum()        // overrides
    {
        return 30;
    }
    static void stMeth()
    {
        System.out.println("stMeth B");
    }
}

class Interface1 implements A, B
{
    public static void main(String[] args) {
        Interface1 obj = new Interface1();
        System.out.println(obj.getNum());

        A.stMeth();
        B.stMeth();
        A.stMeth();
    }
}

