package demos;

class Scope {
    int x = 10;
    static int y = 10;

    public static void main(String[] args) {
        Scope obj = new Scope();
        System.out.println("instance x : " + obj.x);
        System.out.println("static y : " + y);
        System.out.println("static Scope.y : " +  Scope.y);

        int x = 50;
        int y = 51; // hides static one
        System.out.println("Local x : " + x);
        System.out.println("local y : " + y);

        // {
        //     int x = 100;    // duplicate var error
        //     System.out.println("local local x : " + x);
        // }
    }

}