
import acm.program.ConsoleProgram;


public class practice2 extends ConsoleProgram {


	public void run() {
		calculateSqrt();	
	}
	
	private void calculateSqrt() {
        int a = readInt("a : ");
		int b = readInt("b : ");
		double c = Math.sqrt(a * a + b * b);
		println("c = " + c);
	}
}