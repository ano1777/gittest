import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	private static final double INCH_IN_CM = 2.54;
	public void run() {
		int n = readInt("starting balance : ");
		double m = readInt("annual percentage :");
		double finalBalance = (n + n*m/100);
		println (finalBalance);
	
	}
}