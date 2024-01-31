import java.awt.event.ActionEvent;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class finals extends GraphicsProgram {
	
	private JTextField name;
	private JTextField number;
	private JButton add;
	private HashMap<String, Array> peopleNumbers;
	public void init() {
		name = new JTextField(10);
		name.addActionListener(this);
		add(name, SOUTH);
		number = new JTextField(10);
		number.addActionListener(this);
		add(number, SOUTH);
		add = new JButton("add");
		add.addActionListener(this);
		add(add, SOUTH);
		
		addActionListeners();
		
	}
	
	public void run() {
		peopleNumbers = new HashMap<String, Array>();
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == name || e.getSource() == number || e.getSource() == add) {
			if(!name.getText().equals("") && !number.getText().equals("")) {
				peopleNumbers.put(name.getText(), number.getText().toCharArray());
				
				
			}
		}
	}

}
