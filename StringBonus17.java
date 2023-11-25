import acm.program.ConsoleProgram;

public class StringBonus17 extends ConsoleProgram {
	public void run() {
		println(" this program checks if two strings are anagram");
		String str = readLine("Enter text : ");
		String str2 = readLine("Enter text : ");
		println(checkIfItsAnagram(str, str2));
	}

	private boolean checkIfItsAnagram(String str, String str2) {
		for (int i = 0; i < str.length(); i++) {
	    char ch = str.charAt(i);
	    int index = str2.indexOf(ch);
	    if(index == -1){
	    	return false;
	    } else {
	    str2 = str2.substring(index + 1); 
	    	}
		}
		return true;
	}
}
