
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
	}

private void nullMatrix(int[][] m){
HashMap<ArrayList<Integer>, Boolean> coords = new HashMap<ArrayList<Integer>, Boolean>();
for(int r = 0; r < m.length; r++){
for(int c = 0; c < m[r].length; c++){
if(m[r][c]==0){
ArrayList<Integer> coord = new ArrayList<Integer>();
coord.add(r);
coord.add(c);
coords.put(coord, true);
}
}
}

for(ArrayList<Integer> coord : coords.keySet()){
int r = coord.get(0);
int c = coord.get(1);

for(int i = 0; i < m[r].length; i++){
m[r][i] = 0;
}

for(int i = 0; i < m.length; i++){
m[i][c] = 0;
}
}
}