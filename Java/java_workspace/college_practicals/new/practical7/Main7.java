// Write  a  program  to  read  a  file  and  display  only  those  lines  that have  the  first  two characters as '//' (Use try with resources).

package practical7;

import java.io.*;

class Main7
{
    public static void main(String[] args) {
        if (args.length != 1)
        {
            System.out.println("Main7 fileName");
            System.exit(101);
        }

        try(FileReader fileReader = new FileReader(args[0]);
            BufferedReader bufferReader = new BufferedReader(fileReader))
        {
            String line;
            while((line = bufferReader.readLine()) != null)
            {
                if (line.charAt(0) == line.charAt(1) && line.charAt(1) == '/')
                    System.out.println(line);
            }
        }
        catch(IOException e)
        {
            System.out.println("IO Error: " + e.getMessage());
        }
    }
}