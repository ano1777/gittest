import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {

	public void run() {
		int n = readInt ("enter number");
		int m = 0;
		while (n != -1){
			n = readInt("enter number");
			m = m +a(n);
		}
	}

	private int a(int n) {
		double total = 0;
		while (n % 2 == 0){
			total += 1;
		}
		return n ;
	}
}
