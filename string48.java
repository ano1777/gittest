import acm.program.ConsoleProgram;

public class string48 extends ConsoleProgram {
	public void run() {
		String str = "ani";
		String str2 = "ani";
		String str3 = new String ("ani");
		String str4 = readLine("Enter string");
		
		str = str.substring(0,1)+"a";
		println("the changed string : " +str);
		
		str3 = str3.substring(0, str3.length()-1) + "a";
		println("changed str3 :" + str3);
		
		
		
		
		
		
		
		
	}
//		String text = "mariami";
//		printCharStatics(text);
//
//	}
//
//	private void printCharStatics(String text) {
//		for(int i=0; i<text.length(); i++) {
//			int count = countSymbol(text, text.charAt(i));
//			if(isFirstOccurance (text, i)){
//				int count = countSymbol(text, currCh);
//				println(currCh );
//			}
//		}
//		
//	}
//	private boolean isFirstOccurance(String text, int i) {
//		
//		return false;
//	}
//
//	private int countSymbol (String text, char symbol) {
//		int symbolCount = 0;
//		for(int i = 0; i < text.length(); i++) {
//			if(text.charAt(i) ==symbol) {
//				symbolCount++; //
//			}
//		}
//		return symbolCount;
//	}

}
