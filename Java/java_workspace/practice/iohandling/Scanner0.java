package iohandling;

import java.util.Scanner;

class Scanner0
{
    public static void main(String[] args) {
        String input = "1 2 a 3 45 6";
        Scanner sc = new Scanner(input);
        int x = 0;
        do
        {
            x = sc.nextInt();
            System.out.print(x + " ");
        } while (x != 0);

        // char c = 0;
        // int i = 65;
        // char ch = i;
        // int ic = c;
        
        sc.close();
    }
}