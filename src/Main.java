public class Main {

    public static void main(String[] args) {
        System.out.println("Main START");
        Worker worker = new Worker();
        Runnable rIncrease = () -> {
            System.out.println("rIncrease ENTER RUN");
            for (int i = 0; i < 5; i++) {
                System.out.println("rIncrease ENTER FOR");
                try {
                    worker.increase();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("rIncrease EXIT FOR");
            }
            System.out.println("rIncrease EXIT RUN");
        };
        new Thread(rIncrease, "rIncrease").start();

        Runnable rDecrease = () -> {
            System.out.println("rDecrease ENTER RUN");
            for (int i = 0; i < 5; i++) {
                System.out.println("rDecrease ENTER FOR");
                try {
                    worker.decrease();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("rDecrease EXIT FOR");
            }
            System.out.println("rDecrease EXIT RUN");
        };
        new Thread(rDecrease, "rDecrease").start();
        System.out.println("Main END");
    }
};

class Worker {
    private int count = 0;

    public synchronized void increase() throws InterruptedException {
        System.out.println("Increase ENTER");
        while (count > 0) {
            System.out.println("Increase WAIT");
            wait();
        }

        System.out.println("Increase COUNT");
        count++;
        System.out.println("Count: " + count);
        notifyAll();
        System.out.println("Increase EXIT");
    }

    public synchronized void decrease() throws InterruptedException {
        System.out.println("Decrease ENTER");
        while (count <= 0) {
            System.out.println("Decrease WAIT");
            wait();
        }
        System.out.println("Decrease COUNT");
        count--;
        System.out.println("Count: " + count);
        notifyAll();
        System.out.println("Decrease EXIT");
    }
}