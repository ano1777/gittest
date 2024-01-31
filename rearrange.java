import java.io.BufferedReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class rearrange extends ConsoleProgram {
	HashMap<String, Integer> letters;

	public void run() {
		String text = readLine();
			try{ 
				BufferedReader reader = new BufferedReader(new FileReader(filename)); 
					
				}
				catch(Exception e) {
					println("oops");
			}
	}
	
	private int addBigInteger() {
		
		return 0;
		
	}
	
	
	

	}
//		letters = new HashMap<String, Integer>();
//		String text = readLine();
//		println(rearrange(text));
//
//	}
//
//	private String rearrange(String text) {
//		StringTokenizer tok = new StringTokenizer(text);
//		while (tok.hasMoreTokens()) {
//			String part = tok.nextToken();
//			letters.put(part, part.length());
//		}
//		String res = "";
//		int tmp = 0;
//		for (String part : letters.keySet()) {
//			int curr = letters.get(part);
//			if (curr > tmp) {
//				res += " " + part;
//				tmp = curr;
//			}
//			if (curr <= tmp) {
//				res = part + " " + res;
//			// part + " " + res;
//			}
//
//			// if(curr == tmp){
//			//
//			// }
//		}
//
//		return res;
//	}
//
//}
