/*
    Demo of
    class
    constructors
    constructor overloading
*/
package demos;

class Box {
    double width;
    double height;
    double length;

    Box()
    {
        System.out.println("Para Less Cons Called");
        width = height = length = 1;
    }
    
    Box(double width, double height, double length) {
        System.out.println("Para Cons Called");
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box(Box box)
    {
        System.out.println("Copy Cons Called");
        width = box.width;
        height = box.height;
        length = box.length;
    }

    void volume() {
        System.out.println("Volume is " + (width * height * length));
    }
}

class BoxMain {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.volume();
        Box box2 = box1;
        box2.volume();
        Box box3 = new Box(1,2,3);
        box3.volume();
        Box box4 = new Box(box3);
        box4.volume();
    }
}