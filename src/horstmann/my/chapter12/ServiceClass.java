package horstmann.my.chapter12;

public class ServiceClass {
    public void performTask1() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Perform task 1");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void performTask2() {
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Perform task 2");
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
