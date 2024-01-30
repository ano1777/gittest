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

	public void init() {
		nameLabel = new JLabel("directions");
		add(nameLabel, SOUTH);

		name = new JTextField(10);
		add(name, SOUTH);

		addActionListeners();
		addMouseListeners();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == name) {
		}
	}

	public void run() {
		double size = Math.min(getWidth(), getHeight());
		int rectSize = (int) size / 8;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				GRect myRect = new GRect(rectSize, rectSize);
				add(myRect, rectSize *i, rectSize *j);
			}
		}

	}

}
