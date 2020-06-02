
public class MyOuter {
    MyOuter()
    {
        System.out.println("outer ref: " + this);
    }
    private String outer = "outer";
    int outervar;
    MyInner in = new MyInner();
    class MyInner
    {
        MyInner()
        {
            System.out.println("inner ref: " + this);
            System.out.println("outer ref: " + MyOuter.this);
            outervar = 100;
        }
        String inner = "inner";
        String outer = "inner's outer";
        void print()
        {
            System.out.println(outer);
            System.out.println(inner);
            System.out.println(MyOuter.this.outer);
        }
    }
}

class NestedDemo
{
    public static void main(String[] args) {
        MyOuter.MyInner obj = new MyOuter().new MyInner();
        obj.print();
        // System.out.println(obj.outer);
        System.out.println(obj.inner);
        System.out.println();
        
        System.out.println("Making outer");
        MyOuter O = new MyOuter();
        System.out.println("outervar = " + O.outervar);
        System.out.println("mAking inner");
        MyOuter.MyInner I1 = O.new MyInner();
        System.out.println();

        MyOuter.MyInner I2 = O.new MyInner();
        System.out.println();

        I1.print();
        I2.print();

        System.out.println();
        O.in.print();
    }
}