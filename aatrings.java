import acm.program.ConsoleProgram;

public class aatrings extends ConsoleProgram {
	public void run() {
		int [][] bb = new int[4][5];
		for (int i=0; i<  bb.length; i++) {
			for(int j =0; j < bb[0].length; j++){
				bb[i][j] = 4;
			}
		}
		println(bb);
		//bb[0][1] = 3;
		
//		for(int[] num : bb) {
//			println(num.toString());
//		}
//		
	}
		//iteratori sashualebas gvadzlevs yvela elementi moiaro nebismier setshi,
		//tokenaizeris msgavsi funqcia aqvs.
	
//	int num1 = readInt("Enter number: ");
//	int num2 = readInt("Enter second number: ");
//	int answer = log(num1, num2);
//	println(log(num1,num2));
//	}
//
//	private int log(int num1, int num2) {
//		int ans = 0;
//		int k = num1;
//		while(num1 <= num2) {
//			num1 *= k;
//			ans++;
//		}
//		return ans;
//	}
}
