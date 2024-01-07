import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
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
		add(button, SOUTH);
		JCheckBox box = new JCheckBox();
		add(box, NORTH);
		JSlider slider = new JSlider();
		add(slider, NORTH);
		JRadioButton butn = new JRadioButton();
		add(butn, NORTH);
			}

	public void run() {
		
		JTextField field = new JTextField(10);
		add(field, WEST);
		field.getText();	
		field.setText("ano");
		field.addActionListener(this);
		addActionListeners();
	}
		public void actionPerformed(ActionEvent e) {
			println(e.getActionCommand());
			}

	

}
