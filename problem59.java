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
	}

	private int biggestRectSize(int[][] matrix) {
		int maxNum = 0;
		int current = 0;
	// r and c are the coordinates of the first point of the rect
		for (int r = 0; r < matrix.length; r++) {
			for (int c = 0; c < matrix[0].length; c++) {
				
				// i and j are the last coordinates of the rect
				for(int i = r; r< matrix.length; r ++) {
					for(int j = c; j < matrix[0].length; j ++) {
						if(rectHasOnlyOnes(matrix, r, c, i, j)){
							current = (i - r  + 1) * (j - c + 1); 
								maxNum = Math.max(current, maxNum);
							}
						}
					}
				}
		
		}
		return maxNum;
	}

	private boolean rectHasOnlyOnes(int[][] matrix, int r, int c, int i, int j) {
		for(int a = r; a < i + 1; a ++) {
			for(int b = c; b < j + 1; b ++) {
				if(matrix[a][b] != 1){
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
