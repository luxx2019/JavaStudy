/**
 * 以xx类型返回Integer的值
 */
package IntegerMethods;

public class AboutXxxValue {
    public static void main(String[] args) {
        Integer num = new Integer(1234567891);
        byte b = num.byteValue();
        short s = num.shortValue();
        int i = num.intValue();
        System.out.println(b);
    }
}
