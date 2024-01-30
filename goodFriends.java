import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class goodFriends extends GraphicsProgram {
	private JTextField name;
	private JLabel nameLabel;
	private JLabel x;
	private JTextField xText;
	private JLabel y;
	private JLabel width;
	private JLabel height;
	private JTextField ytext;
	private JTextField heightText;
	private JTextField widthText;
	private JButton add;

	public void init() {

		nameLabel = new JLabel("name");
		add(nameLabel, SOUTH);

		name = new JTextField(5);
		add(name, SOUTH);

		x = new JLabel("x");
		add(x, SOUTH);

		xText = new JTextField(5);
		xText.addActionListener(this);
		add(xText, SOUTH);

		y = new JLabel("y");
		add(y, SOUTH);

		ytext = new JTextField(5);
		ytext.addActionListener(this);
		add(ytext, SOUTH);

		height = new JLabel("width");
		add(height, SOUTH);

		heightText = new JTextField(5);
		heightText.addActionListener(this);
		add(heightText, SOUTH);

		width = new JLabel("width");
		add(width, SOUTH);

		widthText = new JTextField(5);
		widthText.addActionListener(this);
		add(widthText, SOUTH);

		add = new JButton("Add");
		add.addActionListener(this);
		add(add, SOUTH);

		addActionListeners();
		addMouseListeners();
	}

	public void actionPerformed(ActionEvent e) {
		int x = Integer.parseInt(xText.getText());
		int y = Integer.parseInt(ytext.getText());
		int width = Integer.parseInt(widthText.getText());
		int height = Integer.parseInt(heightText.getText());
	
		if (e.getSource() == "add") {
			if (name.getText() != ("") && xText.getText() != ("") && ytext.getText() != ("")
					&& widthText.getText() != ("") && heightText.getText() != ("")) {

				GRect rectName = new GRect(width, height);
				add(rectName, x, y);

			}
		}
	}

	public void run() {

	}

}
