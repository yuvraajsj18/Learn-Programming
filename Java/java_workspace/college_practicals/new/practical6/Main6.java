/*
    Write a program that copies content of one file to another. Pass the names of the files through command-line arguments.
*/

package practical6;

import java.io.*;

public class Main6
{
    public static void main(String[] args) {
        if (args.length != 2)
        {
            System.out.println("Main6 copyFrom copyTo");
            System.exit(101);
        }

        File copyFrom = new File(args[0]);
        File copyTo = new File(args[1]);

        FileInputStream fin = null;
        FileOutputStream fout = null;

        try
        {
            fin = new FileInputStream(copyFrom);
            fout = new FileOutputStream(copyTo);
            
            int ch;
            while ((ch = fin.read()) != -1)
                fout.write(ch);

            System.out.println("File copied Successfully");
        }
        catch(IOException e)
        {
            System.out.println("IO Error : " + e.getMessage());
        }
        finally
        {
            try
            {
                fin.close();
            }
            catch(IOException e)
            {
                System.out.println("Error Closing File");
            }
            try
            {
                fout.close();
            }
            catch(IOException e)
            {
                System.out.println("Error Closing File");
            }
        }
    }
}