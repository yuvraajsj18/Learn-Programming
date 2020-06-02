package iohandling;

import java.io.*;
import java.util.Scanner;

class Basic
{
    public static void main(String[] args) throws IOException
    {
        System.err.println("Error");
        System.out.println(System.in.getClass());
        InputStream original = System.in;
        InputStream s = new FileInputStream("/mnt/DC84407A844058E2/CS/Workspace/learning/java/college/mam/iohandling/text.txt"); 
        System.setIn(s);
        System.out.println(System.in.getClass());
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
        sc.close();
        sc = new Scanner(System.console().reader());
        line = sc.nextLine();
        System.out.println(line);
        sc.close();
        System.setIn(original);
        sc = new Scanner(System.in);
        line = sc.nextLine();
        System.out.println(line);
        sc.close();
        System.out.println(System.out.getClass());
    }
}