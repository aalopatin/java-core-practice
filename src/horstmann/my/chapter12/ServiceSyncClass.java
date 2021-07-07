package horstmann.my.chapter12;

public class ServiceSyncClass {
    public synchronized void performSyncTask1() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Perform sync task 1");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void performSyncTask2() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Perform sync task 2");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
