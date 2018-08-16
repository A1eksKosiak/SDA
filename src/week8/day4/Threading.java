package week8.day4;

public class Threading {

    public static void main(String[] args) {

        Chair chair = new Chair();
        TestThread guy1 = new TestThread(chair);
        TestThread guy2 = new TestThread(chair);
        //None-daemon threads will not wait daemon thread for finishing the process (program)
        guy1.start();
        guy2.start();
    }
}

class Chair {
    private int availableChair = 1;

    //synchronized opens access to only 1 thread at a time
    synchronized void takeChair() {
        if (availableChair > 0) {
            System.out.println("Taking this chair by " + Thread.currentThread().getName());
            availableChair--;
            System.out.println("Current available chairs - " + availableChair);
        } else {
            System.out.println("Chair is not available :(");
        }
    }
}

class TestThread extends Thread {

    private Chair chair;

    public TestThread(Chair chair) {
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.getMessage();
//        }
        this.chair = chair;

    }

    @Override
    public void run() {
        chair.takeChair();
    }
}