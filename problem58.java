import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem58 extends ConsoleProgram{
	public void run() {;
		int[][] matrix1 = {
				{1, 2, 3},
				{9, 7, 8},
				{4, 5, 6}};
		int[][] matrix2 = {
				{1, 2, 3},
				{9, 7, 8},
				{4, 5, 10}};
		int[][] matrix3 = {
				{1, 2, 3},
				{4, 5, 6}};
	
		printMatrix(matrix1);
		println(isMagicMatrix(matrix1));	
		printMatrix(matrix2);
		println(isMagicMatrix(matrix2));
		printMatrix(matrix3);
		println(isMagicMatrix(matrix3));
	}

	private boolean isMagicMatrix(int[][] matrix) {
		int height =  matrix.length;
		int width = matrix[0].length;
		if(height != width) {
			return false;
		}
		for(int i=1; i <height*height; i++) {
			if((!matrixContains(matrix, i))) {
				return false;	
			}
		}
		return true;
	}

	private boolean matrixContains(int[][] matrix, int i) {
		for(int h = 0; h < matrix.length; h ++)/*height */ {
			for(int w = 0; w < matrix[0].length; w ++) /* width*/ {
				if(matrix[h][w] != i) {
					return false;
				}
			}
		}
		return true;
	}

	private void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			println(Arrays.toString(row));
		}
		
	}

}
