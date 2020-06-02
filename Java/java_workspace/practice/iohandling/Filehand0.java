package iohandling;

import java.io.*;

class Filehand0
{
    public static void main(String[] args) {
        if (args.length != 1)
        {
            System.out.println("Filehand0 filename");
            System.exit(100);
        }

        FileInputStream fin = null;
        try
        {
            fin = new FileInputStream(args[0]);
            int ch;
            while ((ch = fin.read()) != -1)
            {
                System.out.print((char)ch);
            }
            System.out.println();
        }
        catch(FileNotFoundException e)
        {   
            System.out.println("File Not Found " + e);
        }
        catch(IOException e)
        {
            System.out.println("I/O Error " + e);
        }
        finally
        {
            try
            {
                if (fin != null)
                fin.close();
            }
            catch(IOException e)
            {
                System.out.println("Error closing file");
            }
        }
    }
}