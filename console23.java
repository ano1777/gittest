import acm.program.ConsoleProgram;

public class console23 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n:");
		int addSum = (1+(n+1))*n/2;
		for (int i=1; i<n+1;i++){
			print(addSum);
		}
	}

}
