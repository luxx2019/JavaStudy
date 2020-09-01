package swing;

import javax.swing.*;
import java.awt.*;

public class MyScrollPane {
    public static void main(String[] args) {
        JFrame jf = new JFrame("ABC");
        Container c = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(1500, 800);
        jf.getContentPane().setBackground(Color.BLACK);
        jf.setLayout(new GridLayout(2, 1));

        //JTextArea jt = new JTextArea(20,50);
        //jt.setVisible(true);
        //jt.setSize(300, 180);

        JButton jb = new JButton("按钮");
        //jb.setBounds(350, 270, 100, 65);
        jb.setBackground(Color.blue);

        JScrollPane jsp = new JScrollPane();
        jsp.setVisible(true);
        //jsp.setBounds(300, 200, 1000, 600);

        jsp.add(jb);
        c.add(jsp);
    }
}
