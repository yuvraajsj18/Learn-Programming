package demos;

class A {
    int i, j;
    void methA() {
        System.out.println("In A");
    }
}

class B extends A {
    int k;
    void methB() {
        System.out.println("In B");
    }
}

class AccessInhe {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        b.methB();
        b.methA();
        a = b;  // super refs sub

        a.methA();
        // a.k = 10;
        // a.methB();   // methB not in A
    }
}