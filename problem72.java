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
		//SchoolTst test = new SchoolTst();
		JLabel teacher = new JLabel("Teach: ");
		add(teacher, SOUTH);

		teachField = new JTextField(10);
		
		add(teachField, SOUTH);
		teachField.addActionListener(this);

		JLabel subject = new JLabel("Subj: ");
		add(subject, SOUTH);
		subjField = new JTextField(10);
		
		add(subjField, SOUTH);
		subjField.addActionListener(this);

		JLabel pupil = new JLabel("Pupil: ");
		add(pupil, SOUTH);
		pupilField = new JTextField(10);
		
		add(pupilField, SOUTH);
		pupilField.addActionListener(this);

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
			if(teachField.getText() != null && !teachField.getText().equals("")){
			sch.addTeacher(teachField.getText());
			}
		}
//		} else if (e.getSource() == subjField || e.getSource() == addSubject) {
//			if(subjField.getText() != null && !subjField.equals("")) {
//			sch.addSubject(subjField.getText(), teachField.getText());
//			}
//		} else if (e.getSource() == pupilField || e.getSource() == addPupil) {
//			if(pupilField.getText() != null &&  !pupilField.getText().equals("")) {
//				sch.addPupil(pupilField.getText(), subjField.getText());
//			}
//		}
//		} else if (e.getSource() == dispPupils) {
//			removeAll();
//			sch.getPupils(teachField.getText());
//		} else if (e.getSource() == dispTeachers) {
//			removeAll();
//			sch.getTeachers(pupilField.getText());
//		}
	//}
	}

}
