public class MyThreadDemo
{
    public static void main(String[] args) 
    {
        System.out.println("Main Thread Started");

        MyThread myThread = new MyThread();
        myThread.thread.start();
        
        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println("Main Thread : " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie);
        }

        myThread.print();

        myThread.reInitThread();

        myThread.thread.start();

        System.out.println("Main Thread Died");
    }
}

class MyThread implements Runnable
{
    Thread thread;
    
    MyThread()
    {
        thread = new Thread(this, "My Thread");
        System.out.println(thread.getName() + " created");
    }

    @Override
    public void run()
    {
        // thread starts running
        System.out.println("My Thread Started");

        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println("My Thread : " + i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie);
        }

        System.out.println("My Thread Died");
        // thread ends
    }

    void print()
    {
        System.out.println("Nothing to print");
    }

    void reInitThread()
    {
        thread = new Thread(this, "New Thread");
    }
}