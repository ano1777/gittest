import acm.program.ConsoleProgram;

public class console32 extends ConsoleProgram {
	private static final int MAX_NUM = 1000;

	public void run() {
		for (int i = 0; i<MAX_NUM; i++){
			if(isPrime(i)){
				println(i);
			}
		}
		
		
	}

	private boolean isPrime(int i) {
		for(int j = 2; j<=Math.sqrt(i); j++){
			if(i % j == 0){
				return false;
			}
		}
		return true;
	}	
		
		
		
		
		
		
		
		
		
		
	
		
//		int num;
//		for (int i = 1; i < MAX_NUM; i++) {
//			if (isPrime(i)) {
//				println(i);
//			}
//		}
//	}
//
//	private boolean isPrime(int num) {
//		for (int i = 2; i <= Math.sqrt(num); i++) {
//			if (num % i == 0) {
//				println("this number is not prime");
//			}
//		}
//		return false;
//	}
}
