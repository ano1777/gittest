import acm.program.ConsoleProgram;

public class consolepractice extends ConsoleProgram{
	public void run(){
		println("this program adds two numbers.");
		int n1 = readInt("Enter 20: ");
		int n2 = readInt("Enter 10: ");
		int total = n1 + n2;
		println("The total is" + total +".");
	}

}
