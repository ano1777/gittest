import acm.program.ConsoleProgram;

public class console23 extends ConsoleProgram {
	public void run(){
	int n = readInt ("Enter n:");
	for(int i=0; i<n+1; i++){
		println(i);
		}
	
		println("sum:");
		int addSum = ((1+n)*n)/2;
		println(addSum);
	}
}
