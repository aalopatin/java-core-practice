package horstmann.my.chapter12;

public class Main {
    public static void main(String[] args) {
        ServiceSyncClass serviceSyncClass = new ServiceSyncClass();
        ServiceClass serviceClass = new ServiceClass();
        Runnable r1Sync = () -> {
            System.out.println("First sync task started");
            serviceSyncClass.performSyncTask1();
            System.out.println("First sync task ended");
        };
        Runnable r2Sync = () -> {
            System.out.println("Second sync task started");
            serviceSyncClass.performSyncTask2();
            System.out.println("Second sync task ended");
        };
        new Thread(r1Sync, "First sync task").start();
        new Thread(r2Sync, "Second sync task").start();

        Runnable r1 = () -> {
            System.out.println("First task started");
            serviceClass.performTask1();
            System.out.println("First task ended");
        };
        Runnable r2 = () -> {
            System.out.println("Second task started");
            serviceClass.performTask2();
            System.out.println("Second task ended");
        };
        new Thread(r1, "First task").start();
        new Thread(r2, "Second task").start();

    }
}
