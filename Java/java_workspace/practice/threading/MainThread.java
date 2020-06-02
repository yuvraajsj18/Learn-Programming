public class MainThread
{
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("Current Thread : " + mainThread);

        mainThread.setName("Main Thread");

        System.out.println("Current Thread : " + mainThread);

        try
        {
            for (int i = 5; i >= 0; i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ie)
        {
            System.out.println(ie);
        }
    }
}