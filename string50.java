import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class string50 extends ConsoleProgram {
	public void run() {
		String str = readLine("enter text: ");
		String str2 = reverseWords(str);
		println(str2);
		
		
	}

	private String reverseWords(String str) {
		
		String answer = "";
	
		for(int i=0; i<str.length(); i++){
		
			while(true){
			if(str.charAt(i) == ' '){
	
				String sub1 = str.substring(0, i);
				String sub2 = str.substring(i+1);
				println(sub1);
				println(sub2);
				answer = sub2 + ' ' + sub1; 
			}
			}
		}
		return answer;
	}
	}


		// String str = readLine("Enter string: ");
		// StringTokenizer newtokens = new StringTokenizer(str, " ");
		// while(newtokens.hasMoreTokens()){
		// String newTok = newtokens.nextToken();
		// println(newTok);
		// }
		// }
		
		
		
//		String s = readLine("enter text: ");
//		String newSt = reversed(s);
//		println(simulate(newSt));
//	}
//
//	private String simulate(String newSt) {
//		String answer ="";
//		StringTokenizer newTokens = new StringTokenizer(newSt, " ");
//		while (newTokens.hasMoreTokens()) {
//			String token = newTokens.nextToken();
//			String rev = reversed(token);
//			answer += rev + " ";
//		}
//		return answer;
//	}
//
//	private String reversed(String s) {
//		String result = "";
//		for (int i = s.length() - 1; i >= 0; i--) {
//			char ch = s.charAt(i);
//			result += ch;
//		}
//		return result;
//
//	}
//}

