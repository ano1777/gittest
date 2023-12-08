import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram {
	public void run() {
		int n = readInt();
		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = readInt("enter number: ");
		}
		println(Arrays.toString(numbers));
		println(isSorted(numbers));
		println(sorted2(numbers));
	}

	private boolean isSorted(int[] numbers) {
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < numbers[i - 1]) {
				return false;
			}
		}
		return true;
	}
	 private boolean sorted2 (int [] numbers) {
	    int[] numbersCopy = Arrays.copyOf(numbers, numbers.length); 
	    Arrays.sort(numbersCopy);
	    
	    return Arrays.equals(numbers, numbersCopy);
	 }
}
	// int[] num = new int[5];
	// String[] array = new String[3];
	// array [0] = " ";
	// array [1] = "ani";
	// array [2] = "kavelashvili";
	// int k = num[2];
	// println(k);
	// println(Arrays.toString(array));
	//
	// int[] arr = {2,5,20,1,10};
	// num[0] = 20;
	// num[1] = 5;
	// num[2] = 230;
	// num[3] = 19;
	// num[4] = 3;
	// println("this arrays are equal: " + Arrays.equals(num,arr));
	// Arrays.sort(num);
	// println(Arrays.toString(num));
	// Arrays.sort(arr);
	// println(Arrays.toString(arr));
	// Arrays.fill(num, 3);
	// println(Arrays.toString(num));
	//
	// for(int i=0; i<arr.length; i ++){
	//
	// }

	// println(num);
	// Arrays.sort(num);
	// println(num);


// int n = readInt("Enter num :");
//
// int maxNum = 0;
// int secondMaxNum = 0;
// if (maxNum < secondMaxNum) {
// int temp = maxNum;
// maxNum = secondMaxNum;
// secondMaxNum = temp;
// }
// for (int i = 1; i < n + 1; i++) {
// int number = readInt("enter number # " + i + " :");
// if (number > maxNum) {
// secondMaxNum = maxNum;
// maxNum = number;
// } else if (number > secondMaxNum) {
// secondMaxNum = number;
// }
// }
// println("the biggest number" +maxNum);
// println("the second biggest number" + secondMaxNum);
// }
