import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class GroupTesst extends ConsoleProgram {
	public void run() {

		friendGroup friends = new friendGroup();
		while (true) {
			String friend = readLine("enter friend: ");
			if (friend.equals("")) {
				break;
			}
			String person = readLine("enter person: ");

			friends.addFriendship(friend, person);
		}

		// ArrayList<String> students = new ArrayList<>();
		// students.add("sansi23");
		// students.add("akave23");
		// csGroup classB = new csGroup(students);
		// println(classB.getScore("akave23"));
		// classB.setScore("akave23", 15.0);
		// println(classB.getScore("akave23"));
		// classB.addStudent("akave22");
		// println(classB.getScore("akave22"));
	}
}
