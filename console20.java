import acm.program.ConsoleProgram;

public class console20 extends ConsoleProgram {
	public void run() {
	 int n = readInt("Enter number :");
	 int sum = 0;
	 for (int i=1; i < n+1; i++){
	     int number = readInt("Enter number #" + i + " :" );
	     sum = sum + number;
   }
	 println( "sum : " +sum);
	}

}
