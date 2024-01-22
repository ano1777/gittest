import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import acm.program.ConsoleProgram;

public class problem63to66 extends ConsoleProgram {
	private static final String SENTINEL = "";

	public void run() {
		Map<String, ArrayList<String>> names = new HashMap<String, ArrayList<String>>();
		while (true) {
			String friend = readLine("Enter friend: ");
			if (friend.equals(SENTINEL)) {
				break;
			}
			String person = readLine("Enter person: ");
			
			names.put(person, new ArrayList<String>());

			ArrayList<String> friendsList = names.get(person);
			friendsList.add(friend);
			
			names.put(person, friendsList);
		}
		
		int mostFriends = 0;
		String popularPerson = "";
		for (String key : names.keySet()) {
			int friendCount = names.get(key).size();
			if (friendCount > mostFriends) {
				mostFriends = friendCount;
				}
				popularPerson = key;
			
		}
		println(popularPerson); //+ " has the most friends : "+ mostFriends);
		

	}
}
