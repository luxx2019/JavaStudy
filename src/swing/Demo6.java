/**
 * 尝试使用边界布局管理器
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Demo6 extends JFrame {
    public static void main(String[] args) {
        new Demo6();
    }

    public Demo6() {
        setTitle("本窗体使用边界布局管理器");
        setSize(350, 200);
        setVisible(true);
        Container container = getContentPane();
        setLayout(new BorderLayout());

        container.add(BorderLayout.EAST, new Button("east " + "button"));
        container.add(BorderLayout.WEST, new Button("west " + "button"));
        container.add(BorderLayout.SOUTH, new Button("south " + "button"));
        //container.add(BorderLayout.NORTH, new Button("north " + "button"));
        container.add(BorderLayout.CENTER, new Button("center " + "button"));
        //container.add(BorderLayout.NORTH, new Button("north2 " + "button"));
    }
}
