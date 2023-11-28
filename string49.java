import acm.program.ConsoleProgram;

public class string49 extends ConsoleProgram {
	public void run() {
		String str = "1234";
		int num = stringToInt(str);
		println(num);
		println(num-8);
	}


	private int stringToInt(String str) {
		int count = 0;
		for(int i=0; i < str.length(); i++){
			int currinteger = charToInt(str, str.charAt(i));
			count = count * 10 + currinteger;
		}
		return count ;
	}


	private int charToInt(String str, char charAt) {
		int num =((int) charAt) - '0';
		return num;
	}



}
