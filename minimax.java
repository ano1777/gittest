import acm.program.ConsoleProgram;

public class minimax extends ConsoleProgram {
	int currMax;
	int currMin;
	int  max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	public void run() {
		int[][] matrix = { { 0, 0,  0,  0 },
				           { 0, 0,  0,  0 }, 
			               { 0, 0, 0, 0 }};
		println(compareMiniMax(matrix));
	}

	private int compareMiniMax(int[][] matrix) {
	
		
		for (int i = 0; i < matrix[0].length; i++) {
			currMax = findMaxElement(matrix, i);
			currMin = findMinElement(matrix, i);
			
			max = Math.max(max, currMax) ;
			min = Math.min(min, currMin);
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
