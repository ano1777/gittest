import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {

	public void run() {
		int n = readInt ("enter number");
		int m = 0;
		int a = 0;
		while (n != -1){
			n = readInt("enter number");
		
		}
		m = m +a(n);
		println ("number of evens are :" + n);
	}

	private int a(int n) {
		int total = 0;
		while (n % 2 == 0){
			total += 1;
		}
		return total ;
	}
}
