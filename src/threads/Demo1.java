package threads;

/**
 * 调用Thread类或者Thread类的子类再或者是实例中的sleep，都只能让当前的线程睡眠
 */
public class Demo1 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            try {
                for (int i = 0; i < 50; i++) {
                    System.out.println("大家好，我是叽叽" + i + "号");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable r2 = () -> {
            try {
                for (int i = 0; i < 50; i++) {
                    System.out.println("大家好，我是喳喳" + i + "号");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(r1);
        Thread thread2 = new Thread(r1);
        Thread thread3 = new Thread(r2);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
