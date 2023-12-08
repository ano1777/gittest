import java.util.Arrays;

import acm.program.ConsoleProgram;
//
//public class problem56 extends ConsoleProgram {
//	int length;
//	public void run() {
//		int n = readInt();
//		int[] arr = new int[n];
//		for(int i=0; i<arr.length; i++) {
//			
//		}
//		
//		
//	}
//		int n = readInt();
//
//		int[] numbers = new int[n];
//		for (int j = 0; j < n; j++) {
//			numbers[j] = readInt("enter numbeer : ");
//		}
//	
//		println(Arrays.toString(numbers));
//		 length = numbers.length;
//		reverseElements(numbers);
//
//	}
//
//	private void reverseElements(int[] numbers) {
//
//		for (int i = 0; i < length / 2; i++) {
//			int temp = numbers[i];
//			numbers[i] = numbers[length - 1 - i];
//			numbers[length - 1 - i] = temp;
//		}
//
//		println(Arrays.toString(numbers));
//		
//	}
	
	public class problem56 extends ConsoleProgram {
		public void run() {
			int n = readInt("enter  n: ");
			int[] nums = new int[n];
			for (int i = 0; i < n; i++) {
				nums[i] = readInt("enter  nums[" + i+ "]: ");
			}
			
//			for testing
//			int[] nums = {3, 4, 5, 1, 2, 7, 6};
			
			println(Arrays.toString(nums));
			sort(nums);
			println(Arrays.toString(nums));
		}
		
		private void sort(int[] nums) {
			for(int i = 0; i < nums.length; i++) {
				int j = findMinIndex(nums, i);
				swap(nums, i, j);
			}
		}

		private void swap(int[] nums, int i, int j) {
			int tmp = nums[i];
			nums[i] = nums[j];
			nums[j] = tmp;
		}

		private int findMinIndex(int[] nums, int i) {
			int minIndexSoFar = i;
			for(int j = i; j < nums.length; j++) {
				if(nums[j] < nums[minIndexSoFar]) {
					minIndexSoFar = j;
				}
			}
			return minIndexSoFar;
		}
	}

