import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem59 extends ConsoleProgram{
	public void run() {
		int [][] matrix1 = {
		    {0, 1, 1, 0, 1, 0, 0},
			{0, 1, 1, 1, 1, 1, 0},
			{0, 0, 1, 1, 1, 1, 0},
			{0, 0, 1, 1, 1, 1, 0}};
		int [][] matrix2 =  {
     		{1, 1, 1, 0},
     		{0, 1, 1, 1},
     		{1, 1, 0, 0}};
		
		int [][] matrix3 = {
				{0, 0, 0, 0, 1, 1},
				{1, 1, 1, 1, 1, 1},
				{1, 1, 1, 0, 0, 1},
				{1, 0, 1, 0, 0, 0},
				{0, 1, 1, 1, 1, 1}};
		
		printMatrix(matrix1);
		println("");
		printMatrix(matrix2);
		println("");
		printMatrix(matrix3);
		println("");
		}

	private void printMatrix(int[][] matrix) {
		for(int[] row : matrix) {
			println(Arrays.toString(row));
		}
		
		}
		
	
		
	
}
