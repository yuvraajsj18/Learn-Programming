package iohandling;
import java.io.*;

class Read
{
    public static void main(String[] args) throws IOException {
        // String username = System.console().readLine("Username: ");
        // char pw[] = System.console().readPassword("Password: ");
        // System.out.print(username + " ");
        // System.out.println(pw);

        PrintWriter writer = new PrintWriter(System.out, true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        writer.print("Enter: ");
        writer.flush();
        String line = br.readLine();
        System.out.println(line);
        writer.println(line + " written.");
    }
}