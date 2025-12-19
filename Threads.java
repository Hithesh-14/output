package aits;
//a thread is used to perform parallel execution in java

/*types of threads : both of which can use to implement parallel processesing in java depending on priority and importance of the task
 *1.user thread : JVM will wait for all the active user thread to compleate their execution before it shutdowm itself
 *
 *2. Daemon Thread : doesn't get thr preference, JVM will exit and close the program 
 *even if there is daemon thread running in the background
 */

class Demo1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {   
            System.out.println("User thread is executing");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Some problem occurred");
            }
        }
    }
}

class Demo2 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Daemon thread is executing");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Some problem occurred");
        }
    }
}

public class TypesOfThreads {

    public static void main(String[] args) {
        System.out.println("Main() started executing");

        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();

        d2.setDaemon(true); 
        d1.start();
        d2.start();

        System.out.println("Main() stopped working");
    }
}
