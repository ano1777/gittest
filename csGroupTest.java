import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class csGroupTest  extends ConsoleProgram {
	public void run() {
		ArrayList<String> students = new ArrayList<>();
		students.add("sansi23");
		students.add("akave23");
		csGroup classB = new csGroup();
		println(classB.getScore("akave23"));
		classB.setScore("akave23", 15.0);
		println(classB.getScore("akave23"));
		classB.addStudent("akave22");
		println(classB.getScore("akave22"));
		
	}
}
