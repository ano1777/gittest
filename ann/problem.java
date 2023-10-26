import acm.program.*;

public class problem extends ConsoleProgram {
	public void run(){
		int n = readInt ("Enter n:");
		for(int j=1; j<n+1; j++){
			int addSum = ((1+(n+1))*n/2);
			print(addSum);
		}
   
 }
	 
}
