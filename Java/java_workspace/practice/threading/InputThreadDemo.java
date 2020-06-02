import java.util.Scanner;

public class InputThreadDemo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        Thread main = Thread.currentThread();
        System.out.println(main);

        InputWaitThread inputThread = new InputWaitThread();
        inputThread.thread.start();

        System.out.println("Enter Input: ");
        int input = sc.nextInt();

        System.out.println("\n\nIn main thread: " + input + "\n");
        for (int i = 0; i < input; i++)
        {
            System.out.println();
        }

        sc.close();
    }
}

class InputWaitThread implements Runnable
{
    Thread thread;
    InputWaitThread()
    {
        thread = new Thread(this, "Input Wait Thread");
        thread.setPriority(2);
        System.out.println(thread);
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 50; i++)
        {
            System.out.print(i + " ");
            if (i % 5 == 0 && i != 0)
                System.out.println();
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}