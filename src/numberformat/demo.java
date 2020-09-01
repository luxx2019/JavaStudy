/**
 * DecimalFormat f = new DecimalFormat();
 * f.setGroupingSize(2);    // 设置数字分组大小
 * f.setGroupingUsed(false);    // 设置是否允许分组
 *
 * 可以在实例化对象时传递数字格式，也可以通过applyPattern传递数字格式
 */
package numberformat;

import java.text.DecimalFormat;

public class demo {
    public static void main(String[] args) {
        String p1 = "###,##.####";
        String p2 = "000,00.0000";
        String p3 = "000,00.0000\u00A4";
        double i = 12345.6789;
        DecimalFormat f = new DecimalFormat(p3);
        //f.applyPattern(p1);

        System.out.println(f.format(i));
    }
}
