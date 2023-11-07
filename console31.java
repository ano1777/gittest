import acm.program.ConsoleProgram;

public class console31 extends ConsoleProgram {
	public void run() {
		int n = readInt("Enter number : ");
		if (numIsPrime(n)) {
			println("this number is prime");

		} else{
			
			println("this number is not prime");
		}
	}

	

	private boolean numIsPrime(int n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
}
