import acm.program.ConsoleProgram;

public class bonus1 extends ConsoleProgram{
	public void run(){
		while(true){
		int n = readInt (" Enter n : ");
		 int fibonacci = fin(n);
		 println (fibonacci);
		
		}
	}

	private int fin(int n) {
		while (n == 1 || n == 0){
			println (n);
			
		}
		int prev1 = 0;
		int prev2 = 1;
		
	for( int i = 2; i<=n; i++){				
		int current = prev1 + prev2;
		prev1 = current;
		prev2 = current + prev2;
		}
		
		return prev1;
	}
}


