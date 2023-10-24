import acm.program.ConsoleProgram;

public class console24 extends ConsoleProgram {
	public void run(){
		int n = readInt("Enter n:");
		int a = numberOfDivisors(n);
	}
	private int numberOfDivisors (int n){
		int number = 0;
	    for (int i=0; i <= n; i++){
	    	 if (n % i == 0 ){
	    		 number += 1;
	    	 }
	    }
	    return number;
	    
	}

}
