import acm.program.ConsoleProgram;

public class console23 extends ConsoleProgram {
	public void run(){
	int n = readInt ("Enter n:");
	for(int i=0; i<n+1; i++){
		println(i);
		}
	
		println("sum:");
		int addSum = calculateSum(n);
		println(addSum);
	}

	private int calculateSum(int n) {
		int sum = 0;
		for (int i=1; i<=n; i++){
			sum += i;
			
		}		

		return sum;
	}
}
