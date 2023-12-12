import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem57 extends ConsoleProgram{
	private static final int SENTINEL = -1;
	public void run() {
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		myArrayList.get(5);
		println(myArrayList.size());
		myArrayList.add(10);
		while( true) {
			int n = readInt();
			if (n == SENTINEL) {
				break;
			}
		}
	}
	
	
	
	
	
	
	
//		String str1 = "mariam";
//		String str2 = "mrmiaa";
//		println(isAnagram(str1, str2));
//		
//	}
//
//	private boolean isAnagram(String str1, String str2) {
//		int [] count1 = getCountArray(str1);
//		int [] count2 = getCountArray(str2);
//		
//		for(int i=0; i<str1.length(); i++) {
//			char ch = str1.charAt(i);
//			
//		}
//		return Arrays.equals(count1,  count2);
//	}
//	private int getCountArray(String s) {
//		int[] count = new int [26];
//		int index = ;
//		return index;
//	}
}
