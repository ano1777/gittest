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
		
		printMatrix(matrix2);
		
		printMatrix(matrix3);
		}

	private void printMatrix(int[][] matrix) {
		for(int r = 0; r < matrix.length; r ++){ 
			for (int c = 0; c < matrix[0].length; c++ ) {
				int num = matrix[r][c];
				println(num);
			}
		
		}
		
	}
		
	
}
