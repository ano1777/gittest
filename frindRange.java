
/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

import acm.program.*;

public class frindRange extends ConsoleProgram {

	public void run() {
		int matrix[][] = new int [3][3];

		
		int count = 1;
		for(int i = 0; i < matrix.length; i++){
		for(int j = 0; j < matrix[i].length; j++){
		matrix[i][j] = count;
		count++;
		}
		}
		for(int i = 0; i < matrix.length; i++){
			for(int j = 0; j < matrix[i].length; j++){
			print(matrix[i][j]+" ");
			}
			println("");
			}

	}
	}
//		ArrayList<String> arr0 = new ArrayList<String>();
//		arr0.add("ani");
//		arr0.add("Hi");
//		arr0.add("test");
//		
//		println(arr0);
//		
//		ArrayList<ArrayList<String>> arr1 = new ArrayList<ArrayList<String>>();
//		arr1.add(arr0);
//		println(arr1);
//		arr1.add(new ArrayList<String>());
//		arr1.add(new ArrayList<String>());
//		arr1.get(1).add("TEST2");
//		arr1.get(2).add("ania");
//		arr1.get(0).remove("Hi");
//		arr1.spliterator();
//		println(arr1);
//		arr1.get(1).add("TEST2");
//		arr1.get(1).remove("TEST2");
//		println(arr1);
//		}
//	}
	
		// REVIEW:

		// matrixNotations();
		// arrayListMethods();
		// hashMapMethods();

		// PROBLEMS:

		//biggestPlusTests();
		// enemyOfMyEnemyTests();

		// int[][] m = new int[][] {{1, 2, 3, 0, 0, 3, 6}, {2, 1, 1, 1, 0, 1,
		// 3}, {2, 1, 1, 1, 2, 1, 3}};
		//
		// for(int r = 0; r < m.length; r++){
		// for(int c = 0; c < m[r].length; c++){
		// print(m[r][c]+", ");
		// }
		// println("");
		// }
		//
		// println("");
		// nullMatrix(m);
		//
		// for(int r = 0; r < m.length; r++){
		// for(int c = 0; c < m[r].length; c++){
		// print(m[r][c]+", ");
		// }
		// println("");
		// }
//	}
//
//private void nullMatrix(int[][] m){
//HashMap<ArrayList<Integer>, Boolean> coords = new HashMap<ArrayList<Integer>, Boolean>();
//for(int r = 0; r < m.length; r++){
//for(int c = 0; c < m[r].length; c++){
//if(m[r][c]==0){
//ArrayList<Integer> coord = new ArrayList<Integer>();
//coord.add(r);
//coord.add(c);
//coords.put(coord, true);
//}
//}
//}
//
//for(ArrayList<Integer> coord : coords.keySet()){
//int r = coord.get(0);
//int c = coord.get(1);
//
//for(int i = 0; i < m[r].length; i++){
//m[r][i] = 0;
//}
//
//for(int i = 0; i < m.length; i++){
//m[i][c] = 0;
//}
//}
//}
//}