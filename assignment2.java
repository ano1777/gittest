import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram {
	public void init() {
		JLabel label = new JLabel("ani");
		add(label, SOUTH);
		JButton button = new JButton("press");
		add(button, NORTH);
	}
	
	public void run() {
		
	}
		
}


