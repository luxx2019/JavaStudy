package extends_and_implements;

/**
 * Demo1中的规则不仅适用于类的继承，同时也适用于接口的继承
 * 下面的System.out.println(f1.name)语句将会输出"张三"，而不是"李四"
 *
 * 类继承中，无论声明类型是什么，调用方法的时候，都会优先调用子类中重写的方法，接口的规则比较复杂，如下：
 * 1、类优先原则，只要类中重写了接口中的方法，无论声明的类型为什么，最终都会调用实现类中重写的方法
 * 2、类优先原则补充，当从父类中继承了同名同参数的函数后，也认为是实现类重写了接口中的方法
 * 3、当同时实现多个接口，多个接口中有同名同参数的default方法，编译器将会报错，这种情况下，必须在实现类中重写这个方法，根据规则2，继承来的方法也可以
 * 4、当出现接口继承，接口中有同名同参的函数时，无论声明类型是什么，调用对象成员方法的时候，都会优先调用子接口中重写过的方法。
 */
public class Demo2 implements Inf1,Inf2 {
    public static void main(String[] args) {
        Inf1 f1 = new Demo2();
        Inf2 f2 = new Demo2();
        System.out.println(f1.name);
        System.out.println(f2.name);
        f1.selfIntroduction();
        f2.selfIntroduction();
    }

    @Override
    public void fun() {}
}
