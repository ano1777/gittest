import acm.program.ConsoleProgram;

public class finals2022 extends ConsoleProgram {
	public void run() {
		String s = readLine();
		println(blowUp(s));
	}

	/// a2/s6/a1/3
	private String blowUp(String s) {
		if(s.length() == 0){
			return "";
		}
		
		String res = "" + s.charAt(0);
		for (int i = 1; i < s.length(); i++) {
			if (Character.isDigit(i)) {
				String integer = "" + s.charAt(i);
				int amount = Integer.parseInt(integer);// int =2 2 a unda daematos
				for(int j = 0; j < amount; j ++){
					res+= s.charAt(i-1);
				}
				if(i != s.length()-1){
					res += s.charAt(i+1);
				}
				
				
			}

		}
		return res;

	}
}
// aaaaaddssssiiiii
// private String compressedStr(String str) {
// if(str.length() ==0){
// return "";
// }
// int count = 1;
// String res = "" + str.charAt(0);
// for (int i = 1; i < str.length(); i++) {
// char ch = str.charAt(i);
// char ch2 = str.charAt(i - 1);
// if (ch2 == ch) {
// count++;
// } else {
// res += count;
// count = 1;
// res += ch;
// }
// }
// res += count;
// if (res.length() > str.length()) {
// return str;
// }
// return res;
// }
// }
