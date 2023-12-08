import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram {
	public void run() {
		//int n = readInt();
		int[] num = new int[5];
		String[] array = new String[3];
		println(array);
		int[] arr = {2,5,20,1,10};
		num[0]= 20;
		num[1] = 5;
		num[2] = 230;
		num[3] = 19;
		num[4] = 3;
		println("this arrays are equal: " + Arrays.equals(num,arr));
		Arrays.sort(num);
		println(Arrays.toString(num));
		Arrays.sort(arr);
		println(Arrays.toString(arr));
		Arrays.fill(num, 3);
		println(Arrays.toString(num));
		
		

	
	
		//for(int i=0; i<num.length; i++) {
			// = 3;
			
		}
	//	println(num);
//	    Arrays.sort(num);
//	    println(num);
		
		
		
		
		
		
		
		
	}
//		int n = readInt("Enter num :");
//
//		int maxNum = 0;
//		int secondMaxNum = 0;
//		if (maxNum < secondMaxNum) {
//			int temp = maxNum;
//			maxNum = secondMaxNum;
//			secondMaxNum = temp;
//		}
//		for (int i = 1; i < n + 1; i++) {
//			int number = readInt("enter number # " + i + " :");
//			if (number > maxNum) {
//				secondMaxNum = maxNum;
//				maxNum = number;
//			} else if (number > secondMaxNum) {
//				secondMaxNum = number;
//			}
//		}
//		println("the biggest number" +maxNum);
//		println("the second biggest number" + secondMaxNum);
//	}

