/**
 * 将滚动面板和复选框结合使用
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class CheckBoxTest extends JFrame {
    public static void main(String[] args) {
        new CheckBoxTest();
    }
    public CheckBoxTest() {
        Container c = getContentPane();
        setVisible(true);
        c.setLayout(new BorderLayout());
    }
}
