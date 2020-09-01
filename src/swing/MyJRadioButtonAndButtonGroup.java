/**
 * 使用单选按钮和按钮组完成一道选择题
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class MyJRadioButtonAndButtonGroup extends JFrame {
    public static void main(String[] args) {
        new MyJRadioButtonAndButtonGroup();
    }

    public MyJRadioButtonAndButtonGroup() {
        setTitle("选择题1");
        setVisible(true);
        setLayout(new GridLayout(5, 1));
        Container container = getContentPane();
        //setSize(1000, 600);
        setBounds(400, 250, 1000, 300);

        JRadioButton j1 = new JRadioButton("当然是陆小小了，他比太阳神阿波罗还要闪耀");
        JRadioButton j2 = new JRadioButton("吴彦祖");
        JRadioButton j3 = new JRadioButton("彭于晏");

        ButtonGroup group = new ButtonGroup();

        group.add(j1);
        group.add(j2);
        group.add(j3);

        //container.add(group);

        JLabel jl = new JLabel("1、魔镜呀魔镜，谁是世界上最帅的人？");
        container.add(jl);

        container.add(j1);
        container.add(j2);
        container.add(j3);
    }
}
