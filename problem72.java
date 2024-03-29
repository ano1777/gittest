import java.awt.event.ActionEvent;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import acm.graphics.GLabel;
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
		// SchoolTst test = new SchoolTst();
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
			if (teachField.getText() != null && !teachField.getText().equals("")) {
				sch.addTeacher(teachField.getText());
			}
		} else if (e.getSource() == subjField || e.getSource() == addSubject) {
			if (subjField.getText() != null && !subjField.equals("") && teachField.getText() != null
					&& !teachField.getText().equals("")) {
				sch.addSubject(teachField.getText(), subjField.getText());
			}
		} else if (e.getSource() == pupilField || e.getSource() == addPupil) {
			if (pupilField.getText() != null && !pupilField.getText().equals("") && subjField.getText() != null
					&& !subjField.equals("")) {
				sch.addPupil(pupilField.getText(), subjField.getText());
			}
		} else if (e.getSource() == dispPupils) {
			removeAll();
			Iterator<String> pupilsForthisTeach = sch.getPupils(teachField.getText());
			
			double x = 20;
			double y = 20;
			GLabel res = new GLabel("Results: ");
			add(res, x, y);
			if (pupilsForthisTeach == null) {
				return;
			}
			while (pupilsForthisTeach.hasNext()) {
				  y += 20;
				String pupil = pupilsForthisTeach.next();
				GLabel pupils = new GLabel(pupil);
			  
				add(pupils, x, y);
			}

		} else if (e.getSource() == dispTeachers) {
			removeAll();
			double x = 20;
			double y = 20;
			GLabel res = new GLabel("Results: ");
			add(res, x, y);
			
			Iterator<String> teachers = sch.getTeachers(pupilField.getText());
			if (teachers == null) {
				return;
			}
			while(teachers.hasNext()){
				y+= 20;
				String teach = teachers.next();
				GLabel teacher = new GLabel (teach);
				add(teacher, x, y);
			}
		}
		clearAll();
	}

	private void clearAll() {
		teachField.setText("");
		pupilField.setText("");
		subjField.setText("");
	}

}
