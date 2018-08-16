package week8.day4;

public class Threading {

    public static void main(String[] args) throws InterruptedException {

        Chair chair = new Chair();

        Thread thread1 = new Thread(() -> {
            chair.minus();
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chair.minus();
        });
        thread1.start();
        Thread thread2 = new Thread(() -> {
            chair.minus();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            chair.minus();
        });
        thread2.start();

//        while (thread1.isAlive() || thread2.isAlive()) {
//            System.out.println("Result is " + chair.getAvailableChair());
//        }

        //join all threads to wait for next code execution
        thread1.join();
        thread2.join();
        System.out.println("Result is " + chair.getAvailableChair());
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

    public int getAvailableChair() {
        return availableChair;
    }

    synchronized public void takeChair() {
        if (availableChair > 0) {
            System.out.println("Taking chair by " + Thread.currentThread().getName());
            availableChair--;
            System.out.println("Available chair - " + availableChair);
        } else {
            System.out.println("No chairs available for " + Thread.currentThread().getName());
        }
    }

    public void minus() {
        availableChair--;
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
