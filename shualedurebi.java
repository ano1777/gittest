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

	ArrayList<String> ingr;

	public void run() {
		mealIngr = new HashMap<String, ArrayList<String>>();
		fridge = new ArrayList<String>();

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

		println(kitchen(mealIngr, fridge));
	}

	private ArrayList<String> kitchen(HashMap<String, ArrayList<String>> mealIngr, ArrayList<String> fridge) {
		ArrayList<String> canDo = new ArrayList<String>();
		for (String meal : mealIngr.keySet()) {
			ArrayList<String> receipt = mealIngr.get(meal);
			for (String eachIngr : receipt) {
				if (isElement(eachIngr)) {
					canDo.add(meal);

				}
			}
		}
		return canDo;
	}

	private boolean isElement(String eachIngr) {
		if (!ingr.contains(eachIngr)) {
			return false;
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
