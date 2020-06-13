public class Ref
{
    public static void main(String[] args) 
    {
        String s = "one";
        System.out.println(s);
        String s1 = s;
        System.out.println(s1);
        s = "Two";
        System.out.println(s);
        System.out.println(s1);
    }
}