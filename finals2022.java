import acm.program.ConsoleProgram;

public class finals2022 extends ConsoleProgram {
	public void rn() {
		String str = readLine("enter: ");
		println(compressedStr(str));
	}

	private String compressedStr(String str) {
		int amount = 0;
		String res = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i + 1)) {
				for(int j= 0; j < i+1; j ++){
					amount ++;
				}
				String str1 = str.substring(i+1);
				res += str.charAt(i) + amount + str1 ;				
			}	
		}
		return res;
	}

//	private char numberOfLetters(String str) {
//		for(int i = 0 ; i < str.length(); i++){
//			if(str.charAt(i))
//		}
//		return 0;
//	}

}
