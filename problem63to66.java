import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class problem63to66 extends ConsoleProgram {
	private static final String SENTINEL = "";

	public void run() {
		HashMap<String, ArrayList<String>> names = new HashMap<String, ArrayList<String>>();
		while(true){
			String friend = readLine("Enter friend: ");
			String person = readLine("Enter parson: ");
			if(friend.equals(SENTINEL)){
				break;
			}
			names.put(person, new ArrayList<String>());
			
		   	ArrayList<String> friendsList = new ArrayList<String>();
			friendsList.add(friend);
			
			names.put(person, friendsList);
			
			for(String key : names.keySet()) {
				int mostFriends = 0;
				String popularPerson = "";
				if(names.get(key).size() > mostFriends) {
					mostFriends = names.get(key).size();
					popularPerson = key;
				}
				
				 println(popularPerson);
			}
		
			
		}
	}
}
