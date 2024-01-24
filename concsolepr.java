import java.util.Arrays;

import acm.program.ConsoleProgram;

public class concsolepr extends ConsoleProgram {
	public void run(){
		int[] arr = {4, 6, 1, 9, 22, 3};
		
		while(!sorted(arr)) {
			for(int i = 0 ; i < arr.length; i ++) {
				for(int j = i; j < arr.length; j ++){
					if(arr[j] < arr[i]){
						arr[j] = arr[i];
						arr[i] = arr[j];
					}
				}
			}
		}
		println(Arrays.toString(arr));
		
	}

	private boolean sorted(int[] arr) {
		for(int i = 0; i < arr.length - 1; i ++) {
			if(arr[i] > arr[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
