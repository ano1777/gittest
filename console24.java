import acm.program.ConsoleProgram;

public class console24 extends ConsoleProgram {
	public void run(){
		int n = readPositiveInt("Enter n:");
		int Divisors = numberOfDivisors(n);
	    println ("number of divisors :" + Divisors);
	}
	private int readPositiveInt(String string) {
		int n = readInt(string);
		while(n <= 0){
			
			println( "positive number required");
			n = readInt(string);
		}
		return n;
	}
	
	private int numberOfDivisors (int n){
		int number = 0;
	    for (int i=1; i <= n; i++){
	    	 if (n % i == 0 ){
	    		 number += 1;
	    	 }
	    }
	    return number;
	    
	}

}
