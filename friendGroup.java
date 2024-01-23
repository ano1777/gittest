import java.util.ArrayList;
import java.util.HashMap;

public class friendGroup {
	HashMap<String, ArrayList<String>> friendships ;
	public friendGroup() {
		friendships = new HashMap<String, ArrayList<String>>();
		System.out.println("constructor called");
	}
	
	public void addFriendship(String friend, String person) {
	
		if(!friendships.containsKey(person)) {
			friendships.put(person, new ArrayList<String>());
		}
		
		ArrayList<String> friends = friendships.get(person);
		friends.add(friend);
		
		System.out.println(friendships.toString());
	}
	
}
