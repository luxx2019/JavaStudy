package extends_and_implements;

/**
 * Demo1继承了Son类，并且重写了name字段，此时Demo1中应该有4个name字段
 * 当父类声明的变量引用了子类的对象后，用（.）运算符访问子类对象的字段会出现特殊的现象
 * 编译器不会匹配子类中重写的同名字段，而是会首先匹配声明类型层级中的字段，如果匹配不到，会继续到祖父类中寻找。
 * 下面的代码将会输出"龙"，如果Father类中没有重新定义name字段，将会输出"卡普"，永远不可能输出"路飞"或者"李政章"
 */
public class Demo1 extends Son {
    public String name = "李政章";

    public static void main(String[] args) {
        Father f = new Demo1();
        System.out.println(f.name);
    }
}
