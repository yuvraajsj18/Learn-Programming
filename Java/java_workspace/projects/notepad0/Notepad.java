/**
 * Notepad class contains the interface to the user.
 * all menus and items printed to the screen are in this class
 */

package notepad0;

import java.util.Scanner;

public class Notepad {

    private static Scanner input = new Scanner(System.in);
    static Editor editor = Editor.getEditor();
    public static void main(String[] args) 
    {   
        while (true)
            menu();
    }

    static void menu()
    {
        clearScrean();
        System.out.println("Notepad");
        System.out.println("Select an option to continue:");
        System.out.println("1. Write a new file");
        System.out.println("2. View a file");
        System.out.println("3. Delete a file");
        System.out.println("4. Edit a file");
        System.out.println("5. Exit");

        System.out.print("Enter: ");
        int choice = Integer.parseInt(input.nextLine());

        switch (choice)
        {
            case 1:
                writeMenu();
            break;
            case 2:
                viewMenu();
            break;
            case 3:
                deleteMenu();
            break;
            case 4:
                editMenu();
            break;
            case 5:
                    System.exit(5);
            break;
            default:
                System.out.println("Invalid Input, try again...");
                EnterToContinue();
        }
    }

    static void writeMenu()
    {
        clearScrean();
        System.out.println("Write a new file");
        System.out.println("Start adding your text from the next line");
        System.out.println("(type :quit in a line when you want to quit the writer)");
        drawLine();

        editor.writer();
        
        drawLine();
        System.out.print("Want to save the file(y/n): ");
        String choice = input.nextLine();
        if (choice.equals("y") || choice.equals("Y"))
            saveMenu();
    }

    static void saveMenu()
    {
        String dir = getDir();
        String fileName = getFileName();

        try
        {
            editor.save(dir, fileName);
            System.out.println("File Saved Successfully");
        }
        catch(EditorException e)
        {
            System.out.println(e.getMessage());
        }
        EnterToContinue();
    }

    static void editMenu()
    {
        clearScrean();
        System.out.println("Edit a file");
        System.out.println("(You can either edit a already written line or add new ones)");
        String dir = getDir();
        String fileName = getFileName();

        System.out.println("File Opened in Edit Mode");

        drawLine();
        try
        {
            editor.view(dir, fileName, true);   // Edit more true line number will be shown
        }
        catch (EditorException e)
        {
            System.out.println(e.getMessage());
        }
        drawLine();

        String choice;
        do
        {
            System.out.print("Enter Line Number to Edit that Line (0 to stop editing): ");
            int lineNum = Integer.parseInt(input.nextLine());
            if (lineNum == 0)
                return;
            System.out.println("Enter new line: ");
            String newLine = input.nextLine();

            try
            {
                editor.edit(dir, fileName, lineNum, newLine);
                System.out.println("Edited Successfully");
            }
            catch (EditorException e)
            {
                System.out.println(e.getMessage());
            }

            System.out.print("Want to edit more lines: ");
            choice = input.nextLine();
        } while (choice.equals("y") || choice.equals("Y"));

        System.out.println("New File:");

        drawLine();
        try
        {
            editor.view(dir, fileName, true);   // Edit more true line number will be shown
        }
        catch (EditorException e)
        {
            System.out.println(e.getMessage());
        }
        drawLine();
    
        EnterToContinue();
    }

    static void viewMenu()
    {
        clearScrean();
        System.out.println("View a File");
        String dir = getDir();
        String fileName = getFileName();
        drawLine();
        try
        {
            editor.view(dir, fileName, false);       // not opened in edit menu with line numbers
        }
        catch (EditorException e)
        {
            System.out.println(e.getMessage());
        }

        drawLine();
        System.out.println("1. Edit this file.");
        System.out.println("2. Delete this file");
        System.out.println("3. Back to Main Menu");
        int choice;
        do
        {
            System.out.print("Enter: ");
            choice = Integer.parseInt(input.nextLine());
            switch(choice)
            {
                case 1:
                    editMenu();
                break;
                case 2:
                    try
                    {
                        editor.delete(dir, fileName);
                        System.out.println("File Successfully Deleted");
                    }
                    catch (EditorException e)
                    {
                        System.out.println(e.getMessage());
                    }    
                    EnterToContinue();
                break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid Input, try again...");
            }
        } while (choice > 3);
    }

    static void deleteMenu()
    {
        clearScrean();
        System.out.println("Delete a File");
        String dir = getDir();
        String fileName = getFileName();

        try
        {
            editor.delete(dir, fileName);
            System.out.println("File Successfully Deleted");
        }
        catch (EditorException e)
        {
            System.out.println(e.getMessage());
        }    
        EnterToContinue();
    }

    static void clearScrean()
    {
        System.out.print("\033[H\033[2J");
    }

    static void drawLine()
    {
        System.out.println();
        for (int i = 0; i < 170; i++)
            System.out.print("-");
        System.out.println();
    }

    static void EnterToContinue()
    {
        System.out.print("Press Enter to continue: ");
        System.console().readLine();
    }

    static String getDir()
    {
        String dir;
        do
        {
            System.out.print("Enter Directory: ");
            dir = input.nextLine();
        } while (dir.length() == 0);
        return dir;
    }

    static String getFileName()
    {
        String fileName;
        do
        {
            System.out.print("Enter File Name: ");
            fileName = input.nextLine();
        } while (fileName.length() == 0);
        return fileName;
    }
}