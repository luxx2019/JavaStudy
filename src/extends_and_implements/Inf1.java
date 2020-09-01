package extends_and_implements;

public interface Inf1 {
    String name = "张三";
    default void selfIntroduction() {
        System.out.println("hello");
    }
    void fun();
}

interface Inf2 extends Inf1 {
    String name = "李四";
    //void selfIntroduction();
    default void selfIntroduction() {
        System.out.println("你好");
    }
}