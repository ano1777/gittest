import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;

public class console36 extends ConsoleProgram{
	private RandomGenerator rgen = RandomGenerator.getInstance();
	private static final int NUM_EXPERIMENTS = 1000;
	
	
    public void run(){
    	int numFlips = 0;
    	int numConsecutiveHeads = 0;
    	while(true) {
    		numFlips += 1;
    		boolean isHeads = rgen.nextBoolean();
    		if(numConsecutiveHeads ==3 ) {
    			break;
    		}
    		else {
    			numConsecutiveHeads ==0;
    		}
    		return numFlips;
    	}
    	
    
}
}