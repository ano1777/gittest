import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.ConsoleProgram;
import acm.program.GraphicsProgram;

public class goodFriends extends GraphicsProgram implements ComponentListener {
	private JTextField name;
	private JLabel nameLabel;
	GRect recta;
	int rectSize;
	double size;
	GOval myOval;

	public void init() {
		addComponentListener(this);
		nameLabel = new JLabel("directions");
		add(nameLabel, SOUTH);

		name = new JTextField(10);
		name.addActionListener(this);
		add(name, SOUTH);

		addActionListeners();
		addMouseListeners();
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == name) {
			if (name.getText() == "") {
				return;
			}

			if (myOval.getX() <= rectSize * 7 && name.getText().equals("right")) {
				myOval.setLocation(myOval.getX() + rectSize, myOval.getY());
				recta.setLocation(recta.getX() + rectSize, recta.getY());
			} else if (myOval.getX() > 0 && name.getText().equals("left")) {
				myOval.setLocation(myOval.getX() - rectSize, myOval.getY());
				recta.setLocation(recta.getX() - rectSize, recta.getY());
			} else if (myOval.getY() < rectSize * 7 && name.getText().equals("down")) {
				myOval.setLocation(myOval.getX(), myOval.getY() - rectSize);
				recta.setLocation(recta.getX(), recta.getY() - rectSize);
			} else if (myOval.getY() > 0 && name.getText().equals("up")) {
				myOval.setLocation(myOval.getX(), myOval.getY() + rectSize);
				recta.setLocation(recta.getX(), recta.getY() + rectSize);
			}
		}
	}

	public void run() {
		size = Math.min(getWidth(), getHeight());
		rectSize = (int) size / 8;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				GRect myRect = new GRect(rectSize, rectSize);
				add(myRect, rectSize * i, rectSize * j);
			}
		}
		myOval = new GOval(rectSize, rectSize);
		myOval.setFilled(true);
		;
		myOval.setColor(Color.RED);
		add(myOval, rectSize * 4, rectSize * 4);

		recta = new GRect(rectSize * 0.6, rectSize * 0.6);
		recta.setFilled(true);
		recta.setColor(Color.GREEN);
		add(recta, rectSize * 4 + rectSize / 2 - rectSize * 0.6 / 2, rectSize * 4 + +rectSize / 2 - rectSize * 0.6 / 2);
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {

	}

	@Override
	public void componentMoved(ComponentEvent arg0) {

	}

	@Override
	public void componentResized(ComponentEvent arg0) {
		removeAll();
		run();
	}

	@Override
	public void componentShown(ComponentEvent arg0) {

	}

}
