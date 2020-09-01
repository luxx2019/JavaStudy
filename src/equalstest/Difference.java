package equalstest;

/**
 * s1 == s2    // true
 * s1 == s3    // false
 * s1 == s4    // false
 * s1.equals(s2)    // true
 * s1.equals(s3)    // true
 * s1.equals(s4)    // true
 * String 有两种用法，一种是作为基本数据类型，一种是作为对象
 * 当作为基本数据类型时，定义方法如 s1, s2, 此时，虚拟机会到 String 缓冲池中寻找字符串 "abc"
 * 如果找到了则将 "abc" 的引用赋值给 s1, s2
 * 如果没找到则会新建一个字符串 "abc"，然后将引用赋值给 s1, s2
 * 所以，作为基本类型时，所有相同的字符串变量指向的都是同一块地址，用 == 进行判断，结果为 true
 * 当用 new 定义一个 String 变量时，是将 String 当作对象来使用
 * 系统会在堆中开辟一块空间，然会引用到缓冲池的常量，再将堆中地址返回给栈中的变量
 * String 中的 equals() 函数是重写过的，判断封装的数据是否相同，相同则为 true
 */
public class Difference {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String(s1);
        System.out.println(s2);
    }
}
