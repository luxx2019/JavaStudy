/**
 * 将整数值转化成字符串值
 * toString()在下面几个函数中比较特殊，应该是重载函数
 * 既是类的静态函数，也是对象的成员函数
 */
package IntegerMethods;

public class AboutToString {
    public static void main(String[] args) {
        Integer num = new Integer(450);
        int i = 45;
        System.out.println(num.toString());
        System.out.println(Integer.toString(i));
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));
    }
}
