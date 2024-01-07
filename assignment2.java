import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class assignment2 extends GraphicsProgram {
	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;
	private static final int SMALL_SIZE = 30;
	private static final int MED_SIZE = 50;
	private static final int LARGE_SIZE = 70;
	double x ;
	double y;
	private GOval oval;
	public void init() {
//		JLabel label = new JLabel("ani");
//		add(label, SOUTH);
//		JButton button = new JButton("press");
//		add(button, SOUTH);
//		JCheckBox box = new JCheckBox();
//		add(box, NORTH);
//		JSlider slider = new JSlider();
//		add(slider, NORTH);
	
		
		small = new JRadioButton("small");
		medium = new JRadioButton("med");
		large = new JRadioButton("large");
		
		
		ButtonGroup size = new ButtonGroup();
		size.add(small);
		size.add(medium);
		size.add(large);
		
		medium.setSelected(true);
		add(small, NORTH);
		add(medium, NORTH);
		add(large, NORTH);
	}

	public void run() {
		JTextField field = new JTextField(10);
		add(field, WEST);
		field.getText();
		field.setText("ano");
		field.addActionListener(this);
		addActionListeners();
		addMouseListeners();
	}

	public void mouseListeners(MouseEvent e) {
		x = e.getX();
		y = e.getY();
	}
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if(command.equals("press")) {
		println("ano");
		
		} 
		else if (command.equals("small")) {
			oval = new GOval(SMALL_SIZE, SMALL_SIZE);
			oval.setFilled(true);
           
			add(oval, x, y);
		}
		else if(command.equals("medium")) {
			oval = new GOval(MED_SIZE, MED_SIZE);
			oval.setFilled(true);
			add(oval,x, y);
		}
				else {
			println ("look");
		}
	}

}

