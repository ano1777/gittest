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
		Arrays.toString(matrix1);
		Arrays.toString(matrix2);
		Arrays.toString(matrix3);
		println(matrix1);
		println(matrix2);
		println(matrix3);
	}

}
