package timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Modifier;

import javax.swing.Timer;

public class TimerTest {
	public static void main(String[] args) throws Exception {
		TimePrinter tp = new TimePrinter();
		Timer timer = new Timer(1000, tp);
		timer.start();
	}
}

class TimePrinter implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		System.out.println("hello");
		Toolkit.getDefaultToolkit().beep();
	}
}