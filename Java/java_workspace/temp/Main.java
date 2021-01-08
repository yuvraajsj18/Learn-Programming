import P1.Shape;
import P2.Rectangle;
import P3.Circle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter type of the shape(Rectance/Circle): ");
        String shapeType = sc.nextLine();
        
        Shape shape = null;

        if (shapeType.equals("Rectangle")) {
            shape = new Rectangle();
        }
        else if (shapeType.equals("Circle")) {
            shape = new Circle();
        }
        else {
            System.out.println("Invalid Input");
            System.exit(1);
        }

        shape.input(sc);
        shape.calculate_area();
        shape.display_area();

        sc.close();
    }
}
