/**
 * 这里要写一个按下按钮会跳出对话框的功能
 */
package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo3 {
    public static void main(String[] args) {
        JFrame jf = new JFrame("ABC");
        Container c = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(1500, 1000);
        jf.setLayout(null);

        JButton jb = new JButton("按钮");
        jb.setBounds(350, 270, 100, 65);

        c.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JDialog(jf).setVisible(true);
            }
        });
    }
}
