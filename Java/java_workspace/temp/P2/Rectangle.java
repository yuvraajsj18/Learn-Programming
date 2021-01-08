package P2;

import P1.Shape;
import java.util.Scanner;

public class Rectangle extends Shape {
    private float length;
    private float breadth;

    public Rectangle() {}

    public Rectangle(float length, float breadth) {
        super();

        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public float calculate_area() {
        this.area = this.breadth * this.length;

        return this.area;
    }
    
    @Override
    public void input(Scanner sc) {
        this.input_length(sc);
        this.input_breadth(sc);
    }

    public void input_length(Scanner sc) {
        System.out.print("Enter length: ");
        this.length = Integer.parseInt(sc.nextLine());
    }

    public void input_breadth(Scanner sc) {
        System.out.print("Enter breadth: ");
        this.breadth = Integer.parseInt(sc.nextLine());
    }
}
