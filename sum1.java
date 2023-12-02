import acm.graphics.GOval;
import acm.program.ConsoleProgram;

public class sum1 extends ConsoleProgram {
	public void run() {
		        String str = readLine();
		        println(reverse(str));
		    }

		    private String reverse(String str) {
		        String newStr = "";
		        for (int i = 0; i < str.length(); i++) {
		            char ch = str.charAt(i);
		            if (Character.isLetter(ch)) {
		                newStr = createNew(newStr, ch);
		            } else {
		                newStr += ch;
		            }
		        }
		        return newStr;
		    }

		    private String createNew(String str, char ch) {
		        return ch + str;
		    }
		}
	
//		String str = readLine();
//		println(reverse(str));
//	}
//
//	private String reverse(String str){
//		String newStr;
//		for(int i=0; i<str.length(); i++) {
//			char ch = str.charAt(i);
//			//if(Character.isLetter(str.charAt(i))) {
//				  newStr = createNew(str, ch);
//	//	}
//	}
//		return newStr;
//	}
//
//	private String createNew(String str, char ch) {
//		String result = "";
//		
//			for (int i = str.length(); i >= 0; i--) {
//				if (Character.isLetter(ch)) {
//				result += ch;
//			}
//				else {
//					i = i-1;;
//				}
//		}
//		return result;
//	}
//}
//



// int x =1;
// int y = 2;
// GOval o = new GOval(2,1);
// println(one(x, 2, o));
//
//
//
// }
//
// private String one(int x, int i, GOval o) {
// String s = "hello world";
// x = racxa(x/y, (int)o.getHeight(), s);
// o.scale(2);
// y = racxa(x, y+(int)o.getHeigth(), s)
// return null;
// }
//

// double n = readInt("ENTER N :");
// double m = readInt("ENTER M) :");
// double total = n % m;
// println("The sum is :" +total+ ".");
