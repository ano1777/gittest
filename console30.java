import acm.program.ConsoleProgram;

public class console30 extends ConsoleProgram{
	//final static final int MAX_NUM = 1000000;
	public void run() {
		int n = readInt("ENTER NUMBER : ");
		if (isPrime(n)) {
			println("this number is prime");
		}
	}
	
		
		
		
		private boolean isPrime(int n) {
			for (int i = 0; i<=Math.sqrt(n); i++) {
				if(n % i == 0) {
				}
			}
			return true;
			
		}
		
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//	for (int i = 1; i< MAX_NUM; i++){
	//		if (isPrime(i)){
	//			println(i);
	//			}
		//	}
	//}
//	private boolean isPrime(int num) {
	//	for (int i = 2; i<=Math.sqrt(num); i ++){
			
			

		//}
		//return false;//
	//}
