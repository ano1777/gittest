import acm.program.ConsoleProgram;

public class consolepractice extends ConsoleProgram{
	public void run(){
		println("this program adds two numbers.");
		int n1 = readInt("Enter n1: ");
		int n2 = readInt("Enter n2: ");
		int total = n1 + n2;
		println("The total is" + total + ".");
	}

}
