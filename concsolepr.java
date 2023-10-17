import acm.program.ConsoleProgram;

public class concsolepr extends ConsoleProgram {
	public void run(){
	
	 	int num1 = readInt("Enter num1 =");
		int num2 = readInt("Enter num2 =");
		int average =(num1+num2)/2;
		print(average);
		
		double averageInDoubles = (double)(num1+num2)/2;
		double d1 = readInt("Enter first number):");
		double d2 = readInt("Enter seconnd number");
		double averageDouble = (d1+d2)/2;
		print(averageInDoubles);
		
	}

}
