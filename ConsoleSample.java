import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	private static final double PI = 3.14;

	public void run() {
		double f = readInt(" Enter degree in farenheit : ");
		double c = 5/9*(f-32);
		println (c);
	}
}