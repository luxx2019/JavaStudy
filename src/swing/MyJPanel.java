/**
 *
 */
package swing;

import javax.swing.*;
import java.awt.*;

public class MyJPanel {
    public static void main(String[] args) {
        JFrame jf = new JFrame("ABC");
        Container c = jf.getContentPane();
        jf.setVisible(true);
        jf.setSize(1500, 800);
        jf.setLayout(new GridLayout(1,2,20,10));

        jf.getContentPane().setBackground(Color.BLACK);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        p1.add(new Button("button"));
        p2.add(new Button("button"));

        c.add(p1);
        c.add(p2);
    }
}
