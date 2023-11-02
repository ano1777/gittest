import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {


	public void run() {
		while(true){
			
		int n = readInt("enter number : ");
		
		int fibN = fib(n);
		
		println(fibN);
		
		
		}
	}

	// indices: 0 1 2 3 4 5 6
	// values:  0 1 1 2 3 5 8
	private int fib(int n) {
		if (n == 0 || n == 1) { 
			return n;
		}
		int prev1 = 1;
		int prev2 = 0;
		
		//loop
		
	for (int i = 2; i<=n; i++){
			int current = prev2 + prev1; //0+1
			prev1 = current;         //
			prev2 = current + prev2;
			
		}
		
		
		return prev2 ;
		
	}
}
