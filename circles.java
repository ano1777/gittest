import acm.program.ConsoleProgram;

public class circles extends ConsoleProgram{
	private static final int NUM =0;
	public void run(){
		
		int n = readInt(" ? ");
		int max = n;
		int min = n;
		 
		
		if ( n == 0 ) {
			println(" this number is not allowed. try again.");
		}
		while (n != NUM) {
			n = readInt(" ? ");
			if( max < n) {
				max = n;
			} 
			n = readInt(" ? ");
			if (min > n){
				min = n;
			}
		if ( n == 0) {
			addMaxAndMin(n, max, min);
		}
		}


	}
	
	private void addMaxAndMin(int n, int max, int min) {
		println("smallest : " + min);
		println("highest : " + max);
		
	}

}
