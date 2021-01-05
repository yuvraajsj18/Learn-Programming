import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = Integer.parseInt(sc.nextLine());

        if (num < 50) {
            System.out.println("Number is smaller than 50");
        }
        else if (num > 50) {
            System.out.println("Number is greater than 50");
        }
        else {
            System.out.println("Number is 50");
        }

        System.out.print("Enter a name: ");
        String name = sc.nextLine();

        switch (name) {
            case "Harry":
                System.out.println("Hiya! Harry");
            break;

            case "Hermione":
                System.out.println("Hello, Hermione!");
            break;

            case "Ron":
                System.out.println("Hey! Ron");
            break;

            default:
                System.out.println("I don't know you, but whatever, Hello!");
        }

        sc.close();
    }
}