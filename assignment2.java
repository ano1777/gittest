import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;

public class assignment2 extends ConsoleProgram {
	public void init() {
		JLabel label = new JLabel("ani");
		add(label, SOUTH);
		JButton button = new JButton("press");
		add(button, EAST);
		JTextField field = new JTextField(10);
		add(field, WEST);
		field.getText();
	
	}

	public void run() {

	}

}
