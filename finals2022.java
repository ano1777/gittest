import java.util.Arrays;

import acm.program.ConsoleProgram;

public class finals2022 extends ConsoleProgram {
	private int amount;
	public void run() {
		String a = "gvcaja";
		char[] arr  = a.toCharArray();
		Arrays.sort(arr);
		String sorted = new String(arr);
		println(sorted);
	}
	}
//		String s = readLine();
//		println(amount);
//		println(blowUp(s));
//	}
//
//	/// a2/s6/a1/3
//	private String blowUp(String s) {
//		if(s.length() == 0){
//			return "";
//		}
//		
//		String res = "" + s.charAt(0);
//		for (int i = 1; i < s.length(); i++) {
//			if (Character.isDigit(i)) {
//				char ch = s.charAt(i);
//			amount = Character.getNumericValue(ch);
//				// amount = Character.getNumericValue(s.charAt(i));    // int =2 2 a unda daematos
//		
//				for(int j = 0; j < amount; j ++){
//					res+= s.charAt(i-1);
//				}
//				if(i != s.length()-1){
//					res += s.charAt(i+1);
//				}
//				
//				
//			}
//
//		}
//		return res;
//
//	}
//}
//// aaaaaddssssiiiii
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
