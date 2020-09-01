package lambda;

import java.util.concurrent.Callable;

/**
 * Lambda表达式可以引用别的方法，要求
 * 1、参数个数与类型相同
 * 2、返回值相同
 * 下面将展示使用方法
 */
public class Demo2 {
    public static void main(String[] args) {
        // 引用静态函数
        Comparator com1 = ClassA :: compare1;

        // 引用成员函数
        ClassA a = new ClassA();
        Comparator com2 = a :: compare2;

        // 或者也可以。。。然而并没有什么区别
        Comparator com3 = (m, n) -> ClassA.compare1(m, n);
        Comparator com4 = (m, n) -> a.compare2(m, n);
    }
}

class ClassA {
    // Lambda表达式引用函数时，并不要求函数名相同
    public static int compare1(int a, int b) {
        if (a == b) return 0;
        return a > b ? 1 : -1;
    }

    public int compare2(int a, int b) {
        if (a == b) return 0;
        return a > b ? 1 : -1;
    }
}