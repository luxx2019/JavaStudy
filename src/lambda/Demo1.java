package lambda;

import java.util.concurrent.Callable;

/**
 * Lambda本质是匿名函数
 * Lambda的使用可以方便实现接口
 * Lambda实现接口，要求接口里只有一个需要实现的接口方法，即方法接口@FunctionalInterface
 * 下面将使用三种方法实现接口
 */

/**
 * Lambda表达式语法精简
 * 一个普通的Lambda表达式：(int a, int b) -> {System.out.print("hello"); return a - b}
 * 1、小括号内的参数类型可以省略
 * 2、如果参数只有一个，小括号可以省略
 * 3、如果方法体中语句只有一条，大括号可以省略
 * 4、如果方法体中的唯一一条语句是返回语句，则return也必须省略
 */
public class Demo1 {
    public static void main(String[] args) {
        // 方法1，使用接口实现类
        Comparator com1 = new MyComparator();

        // 方法2，使用匿名函数
        Comparator com2 = new Comparator() {
            @Override
            public int compare(int a, int b) {
                return a - b;
            }
        };

        // 方法3，使用Lambda表达式
        Comparator com3 = (a, b) -> a - b;
    }
}

interface Comparator {
    int compare(int a, int b);
}

class MyComparator implements Comparator {
    public int compare(int a, int b) {
        return a - b;
    }
}