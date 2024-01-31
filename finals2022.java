import java.util.Arrays;

import acm.program.ConsoleProgram;

public class finals2022 extends ConsoleProgram {

	private int amount;
	// EnTerNal sunSHiNe oF THe sPotLesS MiNd

	public void run() {
		String title = readLine();

		println(translateToTitle(title));

		String a = "gvcaja";
		char[] arr = a.toCharArray();
		Arrays.sort(arr);
		String sorted = new String(arr);
		println(sorted);
	}

	private String translateToTitle(String title) {
		String str = "";
		for (int i = 0; i < title.length(); i++) {
			char ch = title.charAt(i);
			str += Character.toLowerCase(ch);// ugh gfyhvghvgtf gfhgvgh
		}
		String res = "" + Character.toUpperCase(str.charAt(0));

		for (int j = 1; j < str.length(); j++) {
			char c = str.charAt(j);
			if(c != (' ')) {
				res += c;
			}
			else{
				res += " " +  Character.toUpperCase(str.charAt(j + 1));
			}
		}

		return res;
	}
}

// String s = readLine();
// println(amount);
// println(blowUp(s));
// }
//
// /// a2/s6/a1/3
// private String blowUp(String s) {
// if(s.length() == 0){
// return "";
// }
//
// String res = "" + s.charAt(0);
// for (int i = 1; i < s.length(); i++) {
// if (Character.isDigit(i)) {
// char ch = s.charAt(i);
// amount = Character.getNumericValue(ch);
// // amount = Character.getNumericValue(s.charAt(i)); // int =2 2 a unda
// daematos
//
// for(int j = 0; j < amount; j ++){
// res+= s.charAt(i-1);
// }
// if(i != s.length()-1){
// res += s.charAt(i+1);
// }
//
//
// }
//
// }
// return res;
//
// }
// }
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
