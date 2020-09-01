package extends_and_implements;

/**
 * 构造类，以便后面测试使用
 */
public class GrandFather {
    public String name = "卡普";
    public int age = 60;

    public void selfIntroduction() {
        System.out.println("我是" + name);
    }
    public void fun() {
        System.out.println("我是卡普");
    }
}

class Father extends GrandFather {
    public String name = "龙";
    public int age = 40;

    public void selfIntroduction() {
        System.out.println("我是" + name);
    }

    public final void fun() {
        System.out.println("我是龙");
    }
}

class Son extends Father {
    public String name = "路飞";
    public int age = 20;

    public void selfIntroduction() {
        System.out.println("我是" + name);
    }
}