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

	public void init() {
		addComponentListener(this);
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
				add(myRect, rectSize * i, rectSize *j);
			}
		}
		GOval myOval = new GOval(rectSize, rectSize);
		myOval.setFilled(true);;
		myOval.setColor(Color.RED);
		add(myOval, rectSize * 4, rectSize * 4);

		GRect recta = new GRect(rectSize * 0.6, rectSize * 0.6);
		recta.setFilled(true);
		recta.setColor(Color.GREEN);
		add(recta, rectSize * 4 + rectSize / 2 - rectSize*0.6 / 2 , rectSize * 4 + + rectSize / 2 - rectSize*0.6 / 2);
	}

	@Override
	public void componentHidden(ComponentEvent arg0) {
		
		
	}

	@Override
	public void componentMoved(ComponentEvent arg0) {
		run();
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
