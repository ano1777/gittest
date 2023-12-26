import java.util.ArrayList;
import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem57 extends ConsoleProgram{
	private static final int SENTINEL = -1;
	public void run() {
		
	String str1 = "ania";
	String str2 = "inaa";
	println(isAnagram(str1, str2));
	
	
	}
	
	private boolean isAnagram(String str1, String str2) {
		if(str1.equals(str2)){
			return false;
		}
		
		int[] count1 = numberOfChars(str1) ;
		int[] count2 = numberOfChars(str2);
		
		return Arrays.equals(count1, count2);
	}

	private int[] numberOfChars(String str1) {
		int[] num = new int [26];
		for(int i=0; i<str1.length(); i++) {
			char ch = str1.charAt(i);
			int index = ch - 'a';
			num[index] ++;
		}
		return num;
	}
	
	
		//ArrayList<String> arr = new ArrayList<String>();
		
		
		
		
		
//		
//		arr.add("comon");
//		arr.add("ani");
//		arr.add(2, "kava");
//	arr.set(2, "ani");
//	arr.set(1, "kava");
//	arr.remove(0);
//
//	println(arr.indexOf(2));
//	if (arr.contains(3)) {
//		println("it contains");
//	}
//	else {
//		println("oh no");
//	}
//		for(String in : arr) {
//			println(in);
//		}
//		for(int i = 0; i < arr.size(); i++) {
//			println(arr.get(i));	
//		}
//		
//		
//		int[][] matrix = new int[3][3];
//		for(int i = 0; i < 3; i++){
//			for(int j=0; j < 3; j++){ 
//				matrix[i][j] = readInt("Enter a number: ");
//			}
//		}
//	}
//	private boolean isMagic (int[][] matrix) {
//		
//		return false;
	
	
	
	
	
	
	
	
	
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
