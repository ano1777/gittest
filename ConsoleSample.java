import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	private static final double INCH_IN_CM = 2.54;
	public void run() {
		double numberInCm = readInt("Enter n :");
		double inch = numberInCm * INCH_IN_CM;
		println(inch);
	
	}
}