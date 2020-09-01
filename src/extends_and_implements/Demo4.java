package extends_and_implements;

/**
 * 如果继承的两个接口中出现了同名字段，在不使用同名字段的时候，不会报错
 * 在使用了同名字段的情况下，会产生编译错误，这时候需要在类中重写同名字段
 * 如果类中重写同名字段为静态字段，不会产生错误
 * 如果类中重写同名字段为成员字段，对象调用这个字段时不会产生错误，类调用这个字段仍然会出错
 */
public class Demo4 implements Inf1, Inf2 {
    public static String name = "王二麻子";

    public static void main(String[] args) {
        Demo4 d = new Demo4();
        System.out.println(Demo4.name);
    }

    @Override
    public void fun() {

    }

    @Override
    public void selfIntroduction() {
        System.out.println(name);
    }
}
