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

	public void init() {

		JLabel teacher = new JLabel("Teach: ");
		add(teacher, SOUTH);

		teachField = new JTextField(10);
		add(teachField, SOUTH);

		JLabel subject = new JLabel("Subj: ");
		add(subject, SOUTH);
		subjField = new JTextField(10);
		add(subjField, SOUTH);

		JLabel pupil = new JLabel("Pupil: ");
		add(pupil, SOUTH);
		pupilField = new JTextField(10);
		add(pupilField, SOUTH);

		addTeacher = new JButton("Add Teach");
		add(addTeacher, SOUTH);

		JButton addSubject = new JButton("Add Subj");
		add(addSubject, SOUTH);

		JButton addPupil = new JButton("Add Pupil");
		add(addPupil, SOUTH);

		JButton dispPupils = new JButton("Display Pupils");
		add(dispPupils, SOUTH);

		JButton dispTeachers = new JButton("Display Teachers");
		add(dispTeachers, SOUTH);

		addActionListeners();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == teachField || e.getSource() == addTeacher) {
			addTeacher(teachField.getText());

		}
	}

}
