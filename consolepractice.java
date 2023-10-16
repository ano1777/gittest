import acm.program.ConsoleProgram;

public class consolepractice extends ConsoleProgram{
	public void run(){
		println("this program adds two numbers.");
		int n1 = readInt("20: ");
		int n2 = readInt("10:");
		int total = n1 + n2;
		println("The total is" + total +".");
	}

}
