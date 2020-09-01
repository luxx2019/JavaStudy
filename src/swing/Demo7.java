/**
 * 尝试使用网格布局管理器
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Demo7 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("使用了网格布局管理器");
        Container container = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(1500, 800);
        jf.setLayout(new GridLayout(7, 3, 5, 5));

        for (int i = 0; i < 19; i++) {
            container.add(new Button("button" + i));
        }
    }
}
