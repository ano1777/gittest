import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	private static final double PI = 3.14;

	public void run() {
		double r = readInt(" Enter radius : ");
		double calculate = PI * Math.pow(r, 2);
		println(calculate);

	}
}