/**
 * BB就是en类型的，跟"BB"完全不同
 */
package enumeration;

public class Demo1 {
    enum en {
        AA,
        BB,
        CC
    }

    public static void main(String[] args) {
        Demo1.dolt(en.BB);
        Demo1.dolt(en.valueOf("BB"));
        System.out.println(en.values());    //en中所有的值，数组形式返回
        System.out.println(en.AA.compareTo(en.BB));
        System.out.println(en.BB.ordinal());

    }

    public static void dolt(en e) {
        System.out.println(e);
    }
}
