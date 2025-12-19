package aits.day5;
/*Deadlock : 
 * it is a situation where two or more threads are blocked forever,
 * waiting for each other
 * 
 * A java multithreading program may suffer from the dadlock condition because
 * the synchronized keyword causs the executing thread to block while waiting 
 * for the lock
 */

class Family implements Runnable
{
    String resource1 = "TV";
    String resource2 = "playStation";

    public void run()
    {
        String name = Thread.currentThread().getName();

        if(name.equals("CR"))
        {
            crAccquiredResource();
        }
        else
        {
            chinnuAccquiredResource();
        }
    }

    void crAccquiredResource()
    {
        synchronized(resource2)
        {
            try
            {
                System.out.println("CR acquired the PlayStation");
                Thread.sleep(2000);

                synchronized(resource1)
                {
                    System.out.println("CR acquired the TV");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println("CR failed");
            }
        }
    }

    void chinnuAccquiredResource()
    {
        synchronized(resource2)
        {
            try
            {
                System.out.println("Chinnu acquired the PlayStation");
                Thread.sleep(2000);

                synchronized(resource1)
                {
                    System.out.println("Chinnu acquired the TV");
                    Thread.sleep(1000);
                }
            }
            catch(Exception e)
            {
                System.out.println("Chinnu failed");
            }
        }
    }
}

public class ExampleForDeadlock
{
    public static void main(String[] args)
    {
        Family f = new Family();

        Thread t1 = new Thread(f);
        Thread t2 = new Thread(f);

        t1.setName("CR");
        t2.setName("chinnu");

        t1.start();
        t2.start();
    }
}
