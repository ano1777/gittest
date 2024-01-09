import acm.program.ConsoleProgram;

public class concsolepr extends ConsoleProgram {
	public void run(){
		
		println("this program counts the average of two integers");
	 	double num1 = readInt("Enter num1");
	 	double num2 = readInt("Enter num2");
		double averageInDoubles = (double)(num1+num2)/2;
		print(averageInDoubles);
		
	}

}
