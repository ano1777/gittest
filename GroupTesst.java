import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class GroupTesst extends ConsoleProgram {
	private String person;
	public void run() {

		friendGroup friends = new friendGroup();
		while (true) {
			String friend = readLine("enter friend: ");
			if (friend.equals("")) {
				break;
			}
			 person = readLine("enter person: ");
			friends.addFriendship(friend, person);
			
		
		}
		println("most popular person is" + " " + friends.mostPopularPerson() + " " +  friends.getAmountOfFriends(friends.mostPopularPerson()));
		
		ArrayList<String> allNames = friends.getAllNames();
		for(String name : allNames) {
			println(name + " 's friends:  " + friends.getFriendsAsString(name));
		}
		println("Most popular friend is: " + friends.popularFriend());

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
