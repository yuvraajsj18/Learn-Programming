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
        A obj = new A();
        obj.methA();
        methA();
    }
}

class InheritanceDemo {
    public static void main(String[] args) {
        B objB = new B();
        objB.methA();
        objB.methB();

        A objA = new A();
        objA.methA();
    }
}