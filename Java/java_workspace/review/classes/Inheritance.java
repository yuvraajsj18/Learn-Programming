public class Inheritance {
    public static void main(String[] args) {
        B b = new B(1, 2, 3);

        b.methB();
        b.methA();
    }
}

class A {
    int i, j;

    A(int i, int j) {
        this.i = i;
        this.j = j;
    }

    void methA() {
        System.out.println("In methA");
    }
}

class B extends A {
    int k;

    B(int i, int j, int k) {
        super(i, j);
        this.k = k;
    }

    void methB() {
        System.out.println("In methB");
    }
}