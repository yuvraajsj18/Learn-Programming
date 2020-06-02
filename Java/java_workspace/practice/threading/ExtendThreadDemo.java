public class ExtendThreadDemo {
    public static void main(String[] args) 
    {
        MyThread myThread = new MyThread("My Thread");

        myThread.start();
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Main Thread : " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }    
    }
}

class MyThread extends Thread
{
    MyThread(String name)
    {
        super(name);
        System.out.println("MyThread Created");
    }

    @Override
    public void run()
    {
        for (int i = 0; i < 10; i++)
        {
            System.out.println("My Thread : " + i);
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ie)
            {
                System.out.println(ie);
            }
        }    
    }
}