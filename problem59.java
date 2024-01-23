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
		
		print(matrix1. toString());
		
		print(matrix2);
		
		print(matrix3);
		}
		
	
}
