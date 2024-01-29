import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class shualedurebi extends ConsoleProgram {
	HashMap<String, ArrayList<String>> mealIngr;
	// puri - marili,fqvili
	// xachapuri - marili, fqvili, yveli
	// burg - puri, yveli, salati

	ArrayList<String> fridge;
	// yveli, fqvili, marili

	public void run() {
		mealIngr = new HashMap<String, ArrayList<String>>();
		// fridge = new ArrayList<String>();

		fridge.add("yveli");
		fridge.add("fqvili");
		fridge.add("marili");

		ArrayList<String> puris = new ArrayList<String>();
		puris.add("marili");
		puris.add("fqvili");

		ArrayList<String> xachas = new ArrayList<String>();
		xachas.add("marili");
		xachas.add("fqvili");
		xachas.add("yveli");

		ArrayList<String> burg = new ArrayList<String>();
		burg.add("salati");
		burg.add("puri");
		burg.add("yveli");

		mealIngr.put("puri", puris);
		mealIngr.put("xacha", xachas);
		mealIngr.put("burg", burg);

		//println(kitchen(mealIngr, fridge));
	}

	private ArrayList<String> kitchen(HashMap<String, ArrayList<String>> mealIngr, ArrayList<String> fridge) {
		ArrayList<String> canDoMeals = new ArrayList<String>();
		fridge = new ArrayList<String>();

		for (String meal : mealIngr.keySet()) {
			ArrayList<String> receipt = mealIngr.get(meal);
			if (canDo(receipt, fridge)) {
				canDoMeals.add(meal);
			}
		}
//			for (String eachIngr : receipt) {
//				if (canDo(eachIngr)) {
//					if (!canDoMeals.contains(meal)) {
//						canDoMeals.add(meal);
//					}
//				}
//			}
		
			return canDoMeals;
	}

	private boolean canDo(ArrayList<String> receipt, ArrayList<String> fridge) {
		for (String ing : receipt) {
			if (!fridge.contains(ing)) {
				return false;
			}
		}
		return true;
	}
}

// String father = readLine();
// String child = readLine();
// println(iAmYourFather(father, child));
// }
//
// private boolean iAmYourFather(String father, String child) {
// int maxLength = 0;
// for (int i=0; i<child.length(); i++) {
// for(int j=i+1; j < child.length()+1; j++) {
// String currsub = child.substring(i,j);
// if(father.indexOf(currsub) == -1){
// break;
// }
// maxLength = Math.max(maxLength, currsub.length());
// }
// }
//
// return maxLength > father.length()/2.0;
// }

// }
