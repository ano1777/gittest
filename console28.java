import acm.program.ConsoleProgram;

public class console28 extends ConsoleProgram {
	public void run() {
		int n = readInt(" Enter num: ");
		int EvenNumbers = 0;
		while (n != -1) {
			n = readInt(" Enter num: ");
			EvenNumbers = EvenNumbers + numberOfEvenNumbers(n);
		}
		println(EvenNumbers);

	}

	private int numberOfEvenNumbers(int n) {
		int total = 0;
		if (n % 2 == 0) {
			total += 1;
		}

		return total;
	}

}
