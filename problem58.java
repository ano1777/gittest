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
		printMatrix(matrix2);
		printMatrix(matrix3);
	}

	private void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			println(Arrays.toString(row));
		}
		
	}

}
