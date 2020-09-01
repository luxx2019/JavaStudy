package extends_and_implements;

/**
 * final修饰字段，则字段不可重新指向别的对象
 * final修饰方法，则被修饰的方法不可以被重写
 * final修饰类，则被修饰的类不可被继承
 */
public class Demo3 {
    public static void main(String[] args) {
        GrandFather gf = new Son();
        gf.fun();
    }
}
