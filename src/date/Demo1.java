package date;

import java.util.Date;

public class Demo1 {
    public static void main(String[] args) {
        Date d1 = new Date();
        Date d2 = new Date(2012 - 1900, 3 - 1, 27);

        System.out.println(d1);
        System.out.println(d2);
    }
}
