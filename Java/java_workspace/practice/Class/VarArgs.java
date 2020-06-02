class VarArgs
{
    void meth(int ... v)
    {
        for (int x : v)
        {
            System.out.print(x + " ");
        }
        System.out.println();

        // if (v.length != 0)
            // System.out.println("0th element: " + v[0]); // normal indexing
    }

    void meth(int i)
    {
        System.out.println("i = " + i);
    }

    // void meth(int i, int ... v)  // ambiguos
    // {
    //     System.out.println("i = " + i);
    //     for (int x : v)
    //     {
    //         System.out.print(x + " ");
    //     }
    //     System.out.println();
    // }

    void meth(boolean ... list)
    {
        for (boolean x : list)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void meth()
    {
        System.out.println("meth parameterless");
    }

    void meth(int a, boolean b, int ... v)  // VAr args must be last
    {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        for (int x : v)
        {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    void meth(int a, int ... v)
    {
        System.out.println("a v ... ");
    }

    static public void main(String args[])
    {
        VarArgs obj = new VarArgs();
        obj.meth(1,2,3,4,5);
        obj.meth(1);
        obj.meth(); // if meth() not defined than error for ambiguity as boolean and int var args present
        obj.meth(1,2,3);
        obj.meth(true, false);
        obj.meth(false);
        obj.meth(1,true,1,2,3);
    }
}