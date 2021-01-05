public class Iteration {
    public static void main(String[] args) {
        int MAX_ITERATIONS = 5;

        int i = 0;
        while (i < MAX_ITERATIONS) {
            System.out.println("While loop: " + i);
            i++;
        }

        int j = 0;
        do {
            System.out.println("Do while loop: " + j);
            j++;
        } while (j < MAX_ITERATIONS);

        for (int k = 0; k < MAX_ITERATIONS; k++) {
            System.out.println("For loop: " + k);
        }

        int nums[] = {1, 2, 3, 4, 5, 6};
        for (int x: nums) {
            System.out.println("For each: " + x);
        }
    }
}