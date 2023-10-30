import acm.program.ConsoleProgram;

public class ConsoleSample extends ConsoleProgram {
	
	public void run() {
		int n = readInt("starting balance : ");
		double m = readDouble("annual percentage :");
		double finalBalance = (n + n*m/100);
		double final2 = (finalBalance + finalBalance*m/100);
		println (finalBalance);
		println(final2);
	
	}
}