/**
 * 尝试使用流布局管理器
 * 继承使用JFrame窗体
 *
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Demo5 extends JFrame {
    public static void main(String[] args) {
        new Demo5();
    }

    public Demo5() {
        setTitle("本窗体使用流布局管理器");
        setSize(300, 200);
        setVisible(true);
        Container container = getContentPane();
        setLayout(new FlowLayout(1, 10, 10));

        for (int i = 0; i < 10; i++) {
            container.add(new Button("Button" + i));
        }
    }
}
