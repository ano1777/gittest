import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	public void run() {
	int n = readInt("n :");
	int m = readInt ("m :");
	int average = ((n+m)/2);
	println (average);
}
}