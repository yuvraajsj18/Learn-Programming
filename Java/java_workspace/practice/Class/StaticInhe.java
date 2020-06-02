package Class;

class Animal
{
    static void doStuff()
    {
        System.out.println("I am an Animal");
    }
}

class Dog extends Animal
{
    static void doStuff()   // redefining - new doStuff Animal.doStuff Not Here
    {
        System.out.println("I am a Dog");
    }
    public static void main(String args[])
    {
        Animal[] a = {new Animal(), new Dog(), new Animal()};

        for (int i = 0; i < a.length; i++)
        {
            a[i].doStuff(); // converted to Animal.doStuff()
            System.out.print("\t");
            Animal.doStuff();
            System.out.print("\t");
            Dog.doStuff();
        }
    }
}