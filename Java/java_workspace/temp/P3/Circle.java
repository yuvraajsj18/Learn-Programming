package P3;

import P1.Shape;
import java.util.Scanner;

public class Circle extends Shape {
    private float radius;
    
    public Circle() {}

    public Circle(float radius) {
        super();

        this.radius = radius;
    }

    @Override
    public void input(Scanner sc) {
        this.input_radius(sc);
    }

    @Override
    public float calculate_area() {
        this.area = 3.14f * this.radius * this.radius;

        return this.area;
    }

    public void input_radius(Scanner sc) {
        System.out.print("Enter radius: ");
        this.radius = Integer.parseInt(sc.nextLine());
    }
}
