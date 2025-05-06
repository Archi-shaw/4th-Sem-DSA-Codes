class SharedResource {
    synchronized void printNumbers(String threadName) {
        System.out.println(threadName + " is printing numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
        System.out.println("\n" + threadName + " finished execution.");
    }
}

class SyncThread extends Thread {
    SharedResource sr;
    String threadName;

    public SyncThread(SharedResource sr, String name) {
        this.sr = sr;
        this.threadName = name;
    }

    public void run() {
        sr.printNumbers(threadName);
    }
}

public class ThreadSynchronization {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        SyncThread t1 = new SyncThread(obj, "Thread-1");
        SyncThread t2 = new SyncThread(obj, "Thread-2");

        t1.start();
        t2.start();
    }
}
