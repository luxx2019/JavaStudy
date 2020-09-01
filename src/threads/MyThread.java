package threads;

/**
 * 让一个类继承Thread类，让子类定义对象，然后调用子类实例的start函数
 * 这种方法不推荐使用
 * 调用已经开始的线程的start方法会产生错误
 */
public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        MyThread t3 = new MyThread();
        t1.start();
        t2.start();
        t3.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "、我是一个线程，我刚刚被建立了哦！");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
