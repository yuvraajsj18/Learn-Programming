public class Classes {
    public static void main(String[] args) {
        Student harry = new Student("Harry", 11);
        harry.print();
    }
}

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void print() {
        System.out.println("Student: " + name + "\nAge: " + age + "\n");
    }
}
