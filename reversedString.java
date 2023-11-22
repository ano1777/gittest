import acm.program.ConsoleProgram;

public class reversedString extends ConsoleProgram {
	public void run() {
		String str = readLine("Enter text : ");
		println("resversed text: " + reverseString(str));

	}

	 private String reverseString(String str) {
	 String result = " ";
	 for(int i = 0; i < str.length(); i++){
	 result = str.charAt(i) + result;
	 }
	 return result;
	 }
	 
//second way 
//	private String reverseString(String str) {
//		String result = " ";
//		for (int i = str.length() - 1; i >= 0; i--) {
//			result = result + str.charAt(i);
//		}
//		return result;
//	}
}