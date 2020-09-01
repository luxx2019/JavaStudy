package threads;

public class ThreadTest {
    public static final int DELAY = 1000;
    public static final int STEPS = 100;
    public static final double MAX_AMOUNT = 1000;

    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                for (int i = 0; i < STEPS; i++) {
                    double amount = MAX_AMOUNT * Math.random();
                    int m = (int) (Math.random() * 9 + 1);
                    int n = (int) (Math.random() * 9 + 1);
                    System.out.println(i + "、" + "从账户" + m + "转账到" + n);
                    Thread.sleep((int) (DELAY * Math.random()));
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        Thread t3 = new Thread(r);
        t1.start();
        t2.start();
        t3.start();
    }
}
