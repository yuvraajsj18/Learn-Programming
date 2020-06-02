package demos;

class Passing {
    int a = 100;

    public static void main(String[] args) {
        int a = 50;
        System.out.println(a);
        modify(a);
        System.out.println(a);
        Passing obj = new Passing();
        modify(obj);
        System.out.println(obj.a);
    }
    static void modify(int a) {
        a++;
    }
    static void modify(Passing obj) {
        obj.a++;
    }
}