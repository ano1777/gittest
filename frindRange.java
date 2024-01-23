
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

private boolean inBounds(int[][] m, int r, int c){
return Math.min(r, c) >= 0 && r < m.length && c < m[r].length;
}

private int min(ArrayList<Integer> a){
int min = a.get(0);
for(int i = 0; i < a.size(); i++){
min = Math.min(min, a.get(i));
}
return min;
}

private ArrayList<Integer> getOnes(int[][] m, int r, int c){
ArrayList<Integer> ones = new ArrayList<Integer>();

int lengthT = 1;
int ptrV = r;
while(true){
if(!inBounds(m, ptrV, c) || m[ptrV][c]==0) break;
ptrV--;
lengthT++;
}
ones.add(lengthT);

ptrV = r;

int lengthB = 1;
while(true){
if(!inBounds(m, ptrV, c) || m[ptrV][c]==0) break;
ptrV++;
lengthB++;
}
ones.add(lengthB);

int ptrH = c;
int lengthR = 1;
while(true){
if(!inBounds(m, r, ptrH) || m[r][ptrH]==0) break;
ptrH++;
lengthR++;
}
ones.add(lengthR);

ptrH = c;
int lengthL = 1;

while(true){
if(!inBounds(m, r, ptrH) || m[r][ptrH]==0) break;
ptrH--;
lengthL++;
}
ones.add(lengthL);

return ones;
}

//IMPLEMENT THIS:
private int biggestPlusSize(int[][] m){
int res = 0;
for(int r = 0; r < m.length; r++){
for(int c = 0; c < m[0].length; c++){
if(m[r][c]==0) continue;

ArrayList<Integer> ones = getOnes(m, r, c);
int sizeOfCurrentPlus = min(ones)-1;
res = Math.max(res, sizeOfCurrentPlus);
}
}
return res;
}

//Biggest Plus Tests: [Calls biggestPlusSize method]
@SuppressWarnings("unused")
private void biggestPlusTests(){
int[][] m1 = new int[][]
{{0, 0, 0, 0, 0, 1, 0, 0},
{0, 0, 0, 0, 1, 1, 1, 0},
{0, 0, 1, 0, 0, 1, 0, 0},
{0, 1, 1, 1, 1, 1, 1, 1},
{0, 0, 1, 0, 0, 1, 1, 0},
{0, 0, 1, 0, 0, 1, 0, 0}};
println("TEST 1: ");
if(biggestPlusSize(m1) == 3){
print("SUCCESS");
}else{
print("FAIL");
}
println("");

int[][] m2 = new int[][]
{{0, 1, 0, 1, 1, 1, 0},
{1, 1, 1, 1, 1, 1, 0},
{0, 1, 1, 0, 0, 1, 0},
{0, 1, 1, 0, 1, 1, 0},
{1, 1, 1, 1, 1, 0, 1},
{0, 0, 1, 0, 1, 0, 1},
{0, 0, 1, 0, 1, 0, 1},
{0, 0, 0, 1, 1, 1, 0},
{0, 0, 0, 1, 1, 1, 0}};
println("TEST 2: ");
if(biggestPlusSize(m2) == 3){
print("SUCCESS");
}else{
print("FAIL");
}
println("");

int[][] m3 = new int[][]
   {{0, 1, 0, 1, 1},
    {1, 1, 1, 1, 1},
    {0, 1, 1, 1, 0},
    {1, 1, 1, 1, 1},
    {1, 0, 1, 1, 0},
    {1, 1, 1, 0, 1},
    {0, 1, 1, 1, 0}};

println("TEST 3: ");
if(biggestPlusSize(m3) == 3){
   print("SUCCESS");
}else{
   print("FAIL");
}
println("");

}
		
		
		
		
		
	}
	}
//		int matrix[][] = new int [3][3];
//
//		
//		int count = 1;
//		for(int i = 0; i < matrix.length; i++){
//		for(int j = 0; j < matrix[i].length; j++){
//		matrix[i][j] = count;
//		count++;
//		}
//		}
//		for(int i = 0; i < matrix.length; i++){
//			for(int j = 0; j < matrix[i].length; j++){
//			print(matrix[i][j] + " ");
//			}
//			println("");
//			}
//
//	}
//	}
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