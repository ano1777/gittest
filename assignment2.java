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
	private static final int SMALL_SIZE = 30;
	private static final int MED_SIZE = 50;
	private static final int LARGE_SIZE = 70;
	double x;
	double y;
	private GOval oval;

	public void init() {
		// JLabel label = new JLabel("ani");
		// add(label, SOUTH);
		// JButton button = new JButton("press");
		// add(button, SOUTH);
		// JCheckBox box = new JCheckBox();
		// add(box, NORTH);
		// JSlider slider = new JSlider();
		// add(slider, NORTH);
		JButton remove = new JButton("Clear");
		add(remove, NORTH);
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
		initColorChooser();
		addMouseListeners();
		addActionListeners();
	}

	private void initColorChooser() {
		colors = new JComboBox();
		colors.addItem("Black");
		colors.addItem("RED");
		colors.addItem("green");

		colors.setEditable(false);
		colors.setSelectedItem("Black");
		add(new JLabel("    color:"), NORTH);
		add(colors, NORTH);
	}

	public void mouseListeners(MouseEvent e) {
		GObject obj;
		double diam = getDiamLength();
		obj = new GOval(diam, diam);
		x = e.getX();
		y = e.getY();
		obj.setColor(getCurrColor());
		add(obj, e.getX(), e.getY());
	}

	private Color getCurrColor() {
		String color = (String) colors.getSelectedItem();

		if (color.equals("Green")) {
			return Color.GREEN;
		}
		else if (color.equals("RED")) {
			return Color.RED;
		} else
			return Color.BLACK;
	}

	private double getDiamLength() {
		double length = 0;
		if (small.isSelected()) {
			length = SMALL_SIZE;
		}
		else if (medium.isSelected()) {
			length = MED_SIZE;
		}
		else if (large.isSelected()) {
			length = LARGE_SIZE;
		}
		return length;
	}

	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		if (command.equals("Clear")) {
			removeAll();
		}

	}

}
