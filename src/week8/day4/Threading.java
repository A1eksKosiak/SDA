package week8.day4;

public class Threading {

    public static void main(String[] args) {

        new Thread(new TestThreadSecond()).start();
        for (int i = 0; i < 10; i++) {
            System.out.println("From Main: " + i);
        }
    }
}

class TestThreadSecond implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("From Runnable: " + i);
        }
    }
}

class Chair {
    private int availableChair = 2;

    synchronized public void takeChair() {
        if (availableChair > 0) {
            System.out.println("Taking chair by " + Thread.currentThread().getName());
            availableChair--;
            System.out.println("Available chair - " + availableChair);
        } else {
            System.out.println("No chairs available for " + Thread.currentThread().getName());
        }
    }
}

class TestThread extends Thread {
    private Chair chair;

    public TestThread(Chair chair) {
        this.chair = chair;
    }

    @Override
    public void run() {
        chair.takeChair();
    }
}
