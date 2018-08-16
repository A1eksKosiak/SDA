package week8.day4;

public class Threading {

    public static void main(String[] args) {

        TestThread testThread = new TestThread();
        //None-deamon threads will not wait deamon thread for finishing the process (program)
        testThread.setDaemon(true);
        testThread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main thread: " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }

    }
}

class TestThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Test thread: " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.getMessage();
            }
        }
    }
}