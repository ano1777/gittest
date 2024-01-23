import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem59 extends ConsoleProgram {
	public void run() {
		int[][] matrix1 = { { 0, 1, 1, 0, 1, 0, 0 },
							{ 0, 1, 1, 1, 1, 1, 0 }, 
							{ 0, 0, 1, 1, 1, 1, 0 },
							{ 0, 0, 1, 1, 1, 1, 0 } };
		int[][] matrix2 = { { 1, 1, 1, 0 }, 
							{ 0, 1, 1, 1 },
							{ 1, 1, 0, 0 } };

		int[][] matrix3 = { { 0, 0, 0, 0, 1, 1 },
							{ 1, 1, 1, 1, 1, 1 }, 
							{ 1, 1, 1, 0, 0, 1 },
							{ 1, 0, 1, 0, 0, 0 },
							{ 0, 1, 1, 1, 1, 1 } };

		printMatrix(matrix1);
		println(biggestRectSize(matrix1));
		printMatrix(matrix2);
		println(biggestRectSize(matrix2));
		printMatrix(matrix3);
		println(biggestRectSize(matrix3));
		int min = Integer.MAX_VALUE;
		println(min);
	
	}
	

	private int biggestRectSize(int[][] matrix1) {
		int maxArea = 0 ;
		int currentArea = 0;
		for(int i1 = 0; i1 < matrix1.length; i1 ++) {
			for (int j1 = 0; j1 < matrix1[0].length; j1 ++) {
				for(int i2 = i1; i2 < matrix1.length; i2 ++){
					for(int j2 = j1; j2 < matrix1[0].length; j2 ++){
						
						if(onlyOnes(matrix1, i1, j1, i2, j2)) {
							currentArea = (i2 - i1 + 1 ) * (j2 - j1 + 1);
							if(currentArea > maxArea) {
								maxArea = currentArea;
							}
						}
					}
				}
			}
		}
		return maxArea;
	}


	private boolean onlyOnes(int[][] matrix1, int i1, int j1, int i2, int j2) {
		for(int a = i1; a <= i2; a ++) {
			for(int b = j1; b <= j2; b ++) {
				if(matrix1[a][b] != 1) {
					return false;
				}
			}
		}
		
		return true;
	}

	
	private void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			println(Arrays.toString(row));
		}

	}

}
