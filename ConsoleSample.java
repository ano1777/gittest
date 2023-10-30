import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	public void run() {
	double n = readInt("n :");
	double m = readInt ("m :");
	double average = (double) ((n+m)/2);
	println (average);
}
}