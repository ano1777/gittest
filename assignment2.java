import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JTextField;

import acm.graphics.GCompound;
import acm.graphics.GImage;
import acm.graphics.GLabel;
import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;


public class assignment2 extends GraphicsProgram {
	private JRadioButton small;
	private JRadioButton medium;
	private JRadioButton large;
	JComboBox colors;
	private double prevY;
	private GCompound messages;
	private static final int SMALL_SIZE = 30;
	private static final int MED_SIZE = 50;
	private static final int LARGE_SIZE = 70;
	private GOval oval;
	private JTextField field;
	private JButton enter;
	private double x = DISTANCE;
	private double y = DISTANCE;
	private static final int DISTANCE = 40;
	public void init() {
		field = new JTextField(20);
		add(field, SOUTH);
		
		field.addActionListener(this);
		addActionListeners();
		
		GImage image = new GImage("bad path");
		double x = getWidth()/ 2 - image.getWidth() / 2;
		double y = getHeight()/ 2 - image.getHeight() / 2;
		add(image, x, y);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == field) {
			try {
				GImage image = new GImage(field.getText());
				double x = getWidth()/ 2 - image.getWidth() / 2;
				double y = getHeight()/ 2 - image.getHeight() / 2;
				add(image, x, y);
			} catch(Exception ex) {
				removeAll();
				add(new GLabel("Error occured"), 20, 20);
			}
			field.setText("");
		}
	}
//	public void init() {
//		field = new JTextField(20);
//		add(field, SOUTH);
//		field.addActionListener(this);
//		
//		enter = new JButton("enter");
//		add(enter, SOUTH);
//		addActionListeners();
//	}
//	
//	public void actionPerformed (ActionEvent e) {
//		if (e.getSource() == field || e.getSource() == enter) {
//			String text = field.getText();
//			//println(text);
//			displayMessage(text);
//			field.setText("");
//		}
//		String command = e.getActionCommand();
//		if (command.equals("enter")) {
//			println(field.getText());
//			field.setText("");
//		}
		
//	}
//
//	private void displayMessage(String text) {
//		if(text.equals("")) {
//			return;
//		}
//		GLabel message = new GLabel(text);
//		add(message, x, y);
//		y += DISTANCE;
//		fixPositionAtLastMessage();
//
//	}
//	
//	private void fixPositionAtLastMessage() {
//		if(messages.getHeight() + DISTANCE > getHeight()) {
//			double newY = getMinY(); //getHeight() - messages.getHeight() - DISTANCE;
//			messages.setLocation(messages.getX(), newY);
//		}
//		
//	}
//	
//	private double getMinY() {
//		return getHeight() - messages.getHeight() - DISTANCE;
//	}
//	@Override
//	public void mousePressed(MouseEvent e) {
//		prevY = e.getY();
//	}
//	
//	@Override
//	public void mouseDragged(MouseEvent e) {
//		if(messages.getHeight() + DISTANCE <= getHeight()) {
//			return;
//		}
//		messages.move(0, e.getY() - prevY);
//		prevY = e.getY();
//		
//		double minY = getMinY();
//		double maxY = 0;
//		if (messages.getY() < minY) {
//			messages.setLocation(messages.getX(), minY);
//		}else if(messages.getY() > maxY) {
//			messages.setLocation(messages.getX(), maxY);
//		}
//	}
	
//	public void mouseClicked (MouseEvent e) {
//		if() {
//			
//		}
//	}
	// JLabel label = new JLabel("ani");
	// add(label, SOUTH);
	// JButton button = new JButton("press");
	// add(button, SOUTH);
	// JCheckBox box = new JCheckBox();
	// add(box, NORTH);
	// JSlider slider = new JSlider();
	// add(slider, NORTH);
	// JButton remove = new JButton("Clear");
	// add(remove, NORTH);
	// small = new JRadioButton("small");
	// medium = new JRadioButton("med");
	// large = new JRadioButton("large");
	//
	// ButtonGroup size = new ButtonGroup();
	// size.add(small);
	// size.add(medium);
	// size.add(large);
	//
	// medium.setSelected(true);
	// add(small, NORTH);
	// add(medium, NORTH);
	// add(large, NORTH);
	// initColorChooser();
	// addMouseListeners();
	// addActionListeners();
	// }
	//
	// private void initColorChooser() {
	// colors = new JComboBox();
	// colors.addItem("Black");
	// colors.addItem("RED");
	// colors.addItem("green");
	//
	// colors.setEditable(false);
	// colors.setSelectedItem("Black");
	// add(new JLabel(" color:"), NORTH);
	// add(colors, NORTH);
	// }
	//
	// public void mouseClicked (MouseEvent e) {
	// GObject obj;
	// double diam = getDiamLength();
	// obj = new GOval(diam, diam);
	// x = e.getX();
	// y = e.getY();
	// obj.setColor(getCurrColor());
	// add(obj, e.getX(), e.getY());
	// }
	//
	// private Color getCurrColor() {
	// String color = (String) colors.getSelectedItem();
	//
	// if (color.equals("Green")) {
	// return Color.GREEN;
	// }
	// else if (color.equals("RED")) {
	// return Color.RED;
	// } else
	// return Color.BLACK;
	// }
	//
	// private double getDiamLength() {
	// double length = 0;
	// if (small.isSelected()) {
	// length = SMALL_SIZE;
	// }
	// else if (medium.isSelected()) {
	// length = MED_SIZE;
	// }
	// else if (large.isSelected()) {
	// length = LARGE_SIZE;
	// }
	// return length;
	// }
	//
	// public void actionPerformed(ActionEvent e) {
	// String command = e.getActionCommand();
	// if (command.equals("Clear")) {
	// removeAll();
	// }
	//
	// }

}
