import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	

	public void run() {
		int n =  readInt("Enter n :");
		while( n != 1){
			n = readInt("Enter n :");
			if (n == 1){
				addNumberOfEvenNumbers();
				
			}
			
		}
		
	
	}

	private void addNumberOfEvenNumbers(n) {
		int total = 0;
		if ( n % 2 == 0){
			total += 1;
		}
		return total;
	}
}