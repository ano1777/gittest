import acm.program.ConsoleProgram;

public class stringleetcode extends ConsoleProgram{
	public void run() {
		String haystack = ("Enter text: ");
		String needle = ("Enter text: ");
		int result = returnInt(haystack, needle);
		println(result);
	}

	private int returnInt(String haystack, String needle) {
		for(int i=0; i < (haystack.length()-1); i++){
			for(int j = 0; j<haystack.length(); j++){
				String sub = haystack.substring(i, j);
				if(sub.equals(needle)){
					return(i);
				}
				else{
					return -1;
				}
			}
		}
		return -1;

	}

}
