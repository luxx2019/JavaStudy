/**
 * 要先给窗体设置关闭流式布局，才可以给按钮设置大小
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Demo1 /*extends JFrame */{
    public static void main(String[] args) {
        JFrame jf = new JFrame("ABC");
        Container c = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(1000, 750);
        jf.setLayout(null);
        jf.setBackground(Color.yellow);
        JButton jb = new JButton("按钮");
        jb.setBounds(350,270,100,65);
        //jb.setSize(400, 300);
        c.add(jb);
    }

    public Demo1() {

    }
}
