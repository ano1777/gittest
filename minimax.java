import acm.program.ConsoleProgram;

public class minimax extends ConsoleProgram {
	int max;
	int min;

	public void run() {
		int[][] matrix = { { 1, 2, 5,  2 },
				           { 2, 0, 7, 2 }, 
			               { -2, 6, 2, 4 }};
		println(compareMiniMax(matrix));
	}

	private int compareMiniMax(int[][] matrix) {
		for (int i = 0; i < matrix[0].length; i++) {
			max = findMaxElement(matrix, i);
			min = findMinElement(matrix, i);
		}
		if (min > max) {
			return 1;
		} else if (max > min) {
			return -1;
		}
		return 0;
	}

	private int findMaxElement(int[][] matrix, int col) {
		int maxElem = Integer.MIN_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] > maxElem) {
				maxElem = matrix[i][col];
			}
		}
		return maxElem;
	}

	private int findMinElement(int[][] matrix, int col) {
		int minElem = Integer.MAX_VALUE;
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][col] < minElem) {
				minElem = matrix[i][col];
			}
		}
		return minElem;
	}

}
