/**
 * Editor has methods to work on a note
 *      write
 *      save
 *      delete
 *      view
 *      edit
 * nothing is printed to the screen through this class so it can be used to make different programs
 */

package notepad0;

import java.io.*;

public class Editor {
        static Editor editor = null;
        private Editor()
        {

        }
        public static Editor getEditor()
        {
            if (editor == null)
                editor = new Editor();
            return editor;
        }

        private String bufferText = "";

        public void writer()
        {
            resetBuffer();
            Console console = System.console();
            String line = null;
            while (!(line = console.readLine()).equals(":quit"))
            {
                bufferText += line + '\n';
            }
        }

        public void save(String dir, String fileName) throws EditorException 
        {
            Note note = createNote(dir, fileName);
            try(PrintWriter writer = new PrintWriter(new FileWriter(note)))
            {
                writer.print(bufferText);
                writer.flush();
            }
            catch(IOException e)
            {
                throw new EditorException("Save Error", e);
            }
        }

        public void delete(String dir, String fileName) throws EditorException
        {
            Note note = createNote(dir, fileName);
            note.delete();   
        }

        public void view(String dir, String fileName, boolean editMode) throws EditorException
        {
            Note note = createNote(dir, fileName);
            try(BufferedReader reader = new BufferedReader(new FileReader(note)))
            {
                String line = null;
                System.out.println();
                int countLine = 1;
                while ((line = reader.readLine()) != null)
                {
                    if(editMode)
                        System.out.print(String.format("%03d", countLine++) + " | ");
                    System.out.println(line);
                }
                System.out.println();
            }
            catch(IOException e)
            {
                throw new EditorException("View Error", e);
            }
        }

        public void edit(String dir, String fileName, int lineNum, String newLine)  throws EditorException
        {
            Note note = createNote(dir, fileName);
            resetBuffer();
            try(BufferedReader reader = new BufferedReader(new FileReader(note)))
            {
                String line = null;
                int countLine = 1;
                while ((line = reader.readLine()) != null)
                {
                    if (countLine++ == lineNum)
                        bufferText += newLine + '\n';
                    else
                        bufferText += line + '\n';
                }
                if (lineNum >= countLine)
                    bufferText += newLine + '\n';
            }
            catch(IOException e)
            {
                throw new EditorException("View Error", e);
            }
            // save new bufferText into file
            save(dir, fileName);
        }

        void resetBuffer()
        {
            bufferText = "";
        }
        private static Note createNote(String dir, String fileName) throws EditorException
        {
            File Dir = new File(dir);
            if (!Dir.isDirectory())
                throw new EditorException("Not a directory");
            
            if (!Dir.exists())
                Dir.mkdir();
            Note note = new Note(Dir, fileName);
            return note;
        }
}

class EditorException extends Exception
{
    private static final long serialVersionUID = -285698504597627822L;

    EditorException(String message)
    {
        super(message);
    }
    EditorException()
    {

    }
    EditorException(String message, Throwable cause)
    {
        super(message, cause);
    }
}