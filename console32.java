import acm.program.ConsoleProgram;

public class console32 extends ConsoleProgram {
	final static final int MAX_NUM = 1000000;

	public void run() {
		int num;
		for (int i = 1; i < MAX_NUM; i++) {
			if (isPrime(i)) {
				println(i);
			}
		}
	}

	private boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				println("this number is not prime");
			}
		}
		return false;
	}
}
