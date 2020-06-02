package demos;

class A {
    int x = 10;
}

class B extends A {
    int x = 20;
}

class OverridingVar {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x); // 10
        a = new B();
        System.out.println(a.x);    // 10
        // B b = a;
        B b = new B();
        System.out.println(b.x);    // 20
    }   
}