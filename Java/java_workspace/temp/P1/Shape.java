package P1;

import java.util.Scanner;

public abstract class Shape {
    protected float area;

    public abstract float calculate_area();

    public abstract void input(Scanner sc);

    public void display_area() {
        System.out.println("Area = " + this.area);
    }
}