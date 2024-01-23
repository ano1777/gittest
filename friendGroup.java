import java.util.ArrayList;
import java.util.HashMap;

public class friendGroup {
	HashMap<String, ArrayList<String>> friendships ;
	public friendGroup() {
		friendships = new HashMap<String, ArrayList<String>>();
		//System.out.println("constructor called");
	}
	
	public void addFriendship(String friend, String person) {
	
		if(!friendships.containsKey(person)) {
			friendships.put(person, new ArrayList<String>());
		}
		
		ArrayList<String> friends = friendships.get(person);
		friends.add(friend);
	
		System.out.println(friendships);
		
	}
	
	public String mostPopularPerson () {
		int maxAmount = 0;
		String popular = "";
		for(String key: friendships.keySet()){
			int currFriendsAmount = friendships.get(key).size();
			if(currFriendsAmount > maxAmount) {
				maxAmount = currFriendsAmount;
				popular = key;
			}
		}
		return popular;	
	}
	
	public String getFriendsAsString(String person) {
		if(!friendships.containsKey(person)) {
			return "Does not have friends";
		}
		
		ArrayList<String> friends = friendships.get(person);	
		return friends.toString();
	}
	
	public ArrayList<String> getAllNames() {
		ArrayList<String> allNames = new ArrayList<String>();
		for(String person: friendships.keySet()) {
			if(!allNames.contains(person)){
				allNames.add(person);
			}
		ArrayList<String> friends = friendships.get(person);
		for(String friend: friends) {
			if(!allNames.contains(friend)) {
				allNames.add(friend);
			}
		  }
		}
		return allNames;
		
		
	}
}
