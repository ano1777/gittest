import acm.program.ConsoleProgram;

public class sum1 extends ConsoleProgram {
	public void run() {
		double n = readInt("ENTER N :");
		double m = readInt("ENTER M) :");
		double total = n * m;
		println("The sum is :" +total+ ".");
	}

}
