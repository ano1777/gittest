import java.util.ArrayList;
import java.util.HashMap;

public class friendGroup {
	HashMap<String, ArrayList<String>> friendships;

	public friendGroup() {
		friendships = new HashMap<String, ArrayList<String>>();
	}

	public void addFriendship(String friend, String person) {

		if (!friendships.containsKey(person)) {
			friendships.put(person, new ArrayList<String>());
		}

		ArrayList<String> friends = friendships.get(person);
		if (!friends.contains(friend)) {
			friends.add(friend);
		}
		System.out.println(friendships);
	}

	public int getAmountOfFriends(String person) {
		return friendships.get(person).size();
	}

	public String mostPopularPerson() {
		int maxAmount = 0;
		String popular = "";
		for (String key : friendships.keySet()) {
			int currFriendsAmount = friendships.get(key).size();
			if (currFriendsAmount > maxAmount) {
				maxAmount = currFriendsAmount;
				popular = key;
			}
		}
		return popular;
	}

	public String getFriendsAsString(String person) {
		if (!friendships.containsKey(person)) {
			return "Does not have friends";
		}

		ArrayList<String> friends = friendships.get(person);
		return friends.toString();
	}
	

	public ArrayList<String> getAllNames() {
		ArrayList<String> allNames = new ArrayList<String>();
		for (String person : friendships.keySet()) {
			if (!allNames.contains(person)) {
				allNames.add(person);
			}
			ArrayList<String> friends = friendships.get(person);
			for (String friend : friends) {
				if (!allNames.contains(friend)) {
					allNames.add(friend);
				}
			}
		}
		return allNames;
	}

	public String popularFriend() {
		occurances = new HashMap<String, Integer>();
		int maxOccurance = 0;
		int currentOccurance = 0;
		String popularFriend = "";
		for (ArrayList<String> friends : friendships.values()) {
			for (String friend : friends) {
				int value = occurances.getOrDefault(friend, 0) + 1;
				occurances.put(friend, value);
				currentOccurance = occurances.get(friend);
				if (currentOccurance > maxOccurance) {
					maxOccurance = currentOccurance;
					popularFriend = friend;
				}
			}
		}
		return popularFriend;
	}

	
	public int popularFriendsOccurance(String popularFriend) {
		int maxOccurance = 0;
		maxOccurance = occurances.get(popularFriend);

		return maxOccurance;
	}
	
	public 
	
	
	

	HashMap<String, Integer> occurances;

}
