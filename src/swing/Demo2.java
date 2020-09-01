/**
 * JFrame框架，一旦创建，在其中就已经包含一个内容面板。
 * 一般我们在往JFrame中添加组件时，都加在了内容面板中，这个面板可以通过JFrame的成员方法getContentPane()取出来。
 * 如果设置JFrame的背景颜色，仍然会被内容面板盖住，不如设置内容面板的背景颜色
 * 如果框架中还加有其他面板，内容面板的颜色也会被其他面板盖住，要注意一下面板的布局情况
 * 下面提供两种方法改变背景颜色
 * 1、直接将面板设置为不可见，缺点是面板中的组件也会变的不可见，不实用
 *  jf.getContentPane().setVisible(false);
 * 2、直接设置contentPane容器的颜色
 *  jf.getContentPane().setBackground(Color.BLACK);
 *
 * 创建JDialog对象时，modal设置为true，代表不可以越过JDialog先处理JFrame，设置为false则可以
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class Demo2 /*extends JFrame */{
    public static void main(String[] args) {
        JFrame jf = new JFrame("ABC");
        Container c = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(1500, 800);
        jf.setLayout(null);
        //jf.getContentPane().setVisible(false);
        //jf.setBackground(Color.yellow);
        jf.getContentPane().setBackground(Color.green);

        JButton jb = new JButton("按钮");
        jb.setBounds(350, 270, 100, 65);
        jb.setBackground(Color.blue);
        c.add(jb);

        JDialog jd = new JDialog(jf, "我是一个JDialog窗体", false);
        jd.setVisible(true);
        Container jdc = jd.getContentPane();
        jd.setBounds(30, 20, 500,300);

        JLabel jl = new JLabel("我是一个标签");
        jl.setVisible(true);
        jl.setHorizontalAlignment(SwingConstants.CENTER);
        jdc.add(jl);
    }
}