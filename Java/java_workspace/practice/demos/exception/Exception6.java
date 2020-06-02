package exception;

import java.io.FileReader;
import java.io.IOException;

class Exception6
{
    public static void main(String[] args) {
        try
        {
        FileReader f = new FileReader("document.txt");
        }
        catch(IOException e)
        { 
            System.out.println(e);
        }
    }
}