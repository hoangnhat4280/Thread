package TH;

public class Count implements Runnable {
    private Thread mythread;

    public Count() {
        mythread = new Thread(this, "My runnable thread");
        System.out.println("My thread created" + mythread);
        mythread.start();
    }
    public Thread getMythread() {
        return mythread;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Printing the count" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("My thread interrupted");
        }
        System.out.println("My thread run is over");
    }
}
