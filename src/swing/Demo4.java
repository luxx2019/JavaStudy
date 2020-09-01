/**
 * 创建一个Icon接口的实现类，并将图标用于标签当中
 * Icon实现类必须实现下面三个方法
 * 1、public int getIconWidth()
 * 2、public int getIconHeight
 * 3、public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3)
 *
 * 必须先将JLabel标签加入到JDialog对话框中，再将JDialog对话框加入到JFrame框体中，否则JLabel显示不出来
 *
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Demo4 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("ABC");
        Container c = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(1500, 800);
        jf.setLayout(null);

        JDialog jd = new JDialog(jf, "我是一个JDialog窗体", false);
        jd.setVisible(true);
        Container jdc = jd.getContentPane();
        jd.setBounds(30, 20, 500,300);

        MyIcon icon = new MyIcon(15, 15);

        JLabel jl = new JLabel("我是一个标签", icon, SwingConstants.CENTER);
        jl.setVisible(true);
        jl.setHorizontalAlignment(SwingConstants.CENTER);

        jdc.add(jl);

        c.add(jd);
    }
}

class MyIcon implements Icon {
    private int width;
    private int height;

    public MyIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getIconWidth() {
        return width;
    }

    public int getIconHeight() {
        return height;
    }

    public void paintIcon(Component arg0, Graphics arg1, int arg2, int arg3) {
        arg1.fillOval(arg2, arg3, width, height);
    }
}
