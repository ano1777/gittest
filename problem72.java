import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.program.GraphicsProgram;

public class problem72 extends GraphicsProgram {
	JTextField teachField;
	JTextField subjField;
	JTextField pupilField;
	JButton addTeacher;
	School sch;
	JButton addSubject;
	JButton addPupil;
	JButton dispPupils;
	JButton dispTeachers;
	
	public void init() {
		sch = new School();
		JLabel teacher = new JLabel("Teach: ");
		add(teacher, SOUTH);

		teachField = new JTextField(10);
		teachField.addActionListener(this);
		add(teachField, SOUTH);

		JLabel subject = new JLabel("Subj: ");
		add(subject, SOUTH);
		subjField = new JTextField(10);
		subjField.addActionListener(this);
		add(subjField, SOUTH);

		JLabel pupil = new JLabel("Pupil: ");
		add(pupil, SOUTH);
		pupilField = new JTextField(10);
		pupilField.addActionListener(this);
		add(pupilField, SOUTH);

		addTeacher = new JButton("Add Teach");
		add(addTeacher, SOUTH);

		addSubject = new JButton("Add Subj");
		add(addSubject, SOUTH);

		addPupil = new JButton("Add Pupil");
		add(addPupil, SOUTH);

		 dispPupils = new JButton("Display Pupils");
		add(dispPupils, SOUTH);

		 dispTeachers = new JButton("Display Teachers");
		add(dispTeachers, SOUTH);

		addActionListeners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == teachField || e.getSource() == addTeacher) {
			sch.addTeacher(teachField.getText());
		}else if (e.getSource() == subjField || e.getSource() == addSubject) {
			sch.addSubject(subjField.getText(), teachField.getText());
		}else if(e.getSource() == pupilField || e.getSource() == addPupil) {
			sch.addPupil(pupilField.getText(), subjField.getText());
		}else if (e.getSource() == dispPupils) {
			removeAll();
			sch.getPupils(teachField.getText());
		}
	}

}
