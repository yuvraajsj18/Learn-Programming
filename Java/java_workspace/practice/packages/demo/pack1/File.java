package packages.demo.pack1;

public class File
{
    public static void main(String[] args) {
        System.out.println("In main of File");
        A.main(null);
    }
}

class A 
{
    public static void main(String[] args) {
        System.out.println("In main of A");
        // File.main(null); // ok
    }
}