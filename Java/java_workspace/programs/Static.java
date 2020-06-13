class Static
{
    private static String static_var = "static_var";
    private String var = "non static var";

    void non_static_method()
    {
        System.out.println(static_var);
        System.out.println(var);
    }

    static void static_method()
    {
        System.out.println(static_var);
        // System.out.println(var);  error
        Static obj = new Static();
        System.out.println(obj.var);
    }

    public static void main(String[] args) {
        Static obj = new Static();
        System.out.println("Non static method");
        obj.non_static_method();

        System.out.println();
        System.out.println("Static Method");
        Static.static_method();
    }
}