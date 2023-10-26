import acm.program.ConsoleProgram;

public class console28 extends ConsoleProgram {
	public void run() {
		int n = readInt(" Enter num: ");
		for (int i=0; i>=0; i++){
			println(n);
			if (n == -1){
				break;
			}
		}
		int EvenNumbers = numberOfEvenNumbers();
		println(EvenNumbers);
		
	}

	private int numberOfEvenNumbers(int n) {
	    int total = 0;  
		if(n % 2 == 0){
			total += 1;
		}
		
		return total;
	}

}
