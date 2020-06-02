package demos;

class Stupid {
    static int count;

    Stupid() {
        count++;
    }

    static void meth()
    {
        System.out.println("I am a static method");
    }
}

class Idiots extends Stupid
{
    static int count;
    static void meth()
    {
        System.out.println("I am another static method");
    }
}
class A extends Stupid {
    
}

class Static {
    public static void main(String[] args) {
        System.out.println(Stupid.count);   // without any object being created 
        new Stupid();
        System.out.println(Stupid.count);
        new Stupid();
        System.out.println(Stupid.count);

        Stupid.meth();
        Idiots.meth();
        System.out.println(Idiots.count);
        new Idiots();
        System.out.println(Stupid.count);
        System.out.println(Idiots.count);
        System.out.println("A :  " + A.count);
    }
}