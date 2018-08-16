package week8.day4;

public class Threading {

    public static void main(String[] args) {

        Chair chair = new Chair();
        TestThread guy1 = new TestThread(chair);
        TestThread guy2 = new TestThread(chair);
        TestThread guy3 = new TestThread(chair);
        TestThread guy4 = new TestThread(chair);
        guy1.start();
        guy2.start();
        guy3.start();
        guy4.start();

    }
}

class Chair {
    private int availableChair = 3;

    synchronized public void takeChair() {
        if (availableChair > 0) {
            System.out.println("Taking chair by " + Thread.currentThread().getName());
            availableChair--;
            System.out.println("Available chair - " + availableChair);
        } else {
            System.out.println("No chairs available");
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
