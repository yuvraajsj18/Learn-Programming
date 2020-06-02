package iohandling;

import java.io.*;

class FileRead
{
    public static void main(String[] args) {
        String s;
        // BufferedReader br = null;
        // FileReader fr = null;
        try(FileReader fr = new FileReader("/mnt/DC84407A844058E2/CS/Workspace/learning/java/college/mam/iohandling/myfile.txt"); BufferedReader br = new BufferedReader(fr))
        {
            // fr = new FileReader("/mnt/DC84407A844058E2/CS/Workspace/learning/java/college/mam/iohandling/myfile.txt");
            // br = new BufferedReader(fr);
            while ((s = br.readLine()) != null)
            {
                System.out.println(s);
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        // finally
        // {
        //     try
        //     {  
        //         br.close();
        //     }
        //     catch(IOException e)
        //     {
        //         System.out.println(e);
        //     }
        // }
        FileWriter fout = null;
        try
        {
            File f = new File("/mnt/DC84407A844058E2/CS/Workspace/learning/java/college/mam/iohandling/a.txt");
            fout = new FileWriter(f);
            for (char ch = 'A'; ch <= 'Z'; ch++)
                fout.write(ch);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                if (fout != null)
                    fout.close();
            }
            catch(FileNotFoundException e)
            {

            }
            catch(IOException e)
            {

            }
        }
    }
}