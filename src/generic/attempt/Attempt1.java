package generic.attempt;

import java.util.ArrayList;

/**
 * 使用匿名子类
 */
public class Attempt1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>() {
            public String get(int n) {
                return super.get(n).replaceAll("A", "a");
            }
        };

        list.add("Apple");
        list.add("Application");
        list.add("Orange");
        list.add("apple");

        System.out.println(list.get(1));
    }
}
