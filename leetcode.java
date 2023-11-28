import acm.program.ConsoleProgram;
//დაწერეთ მეთოდი getBiggestDivisor, რომელსაც გადაეცემა ნატურალური რიცხვი n და რომელიც აბრუნებს ამ რიცხვის ყველაზე დიდ მარტივ გამყოფს. ჩათვალეთ, რომ n>1 
//მაგალითად 24-ის ყველაზე დიდი მარტივი გამყოფია 3, ხოლო 37-ის ყველაზე დიდი მარტივი გამყოფია 37 
//ამოცანა შეასრულეთ BiggestDivisor.java ფაილში. 

public class leetcode extends ConsoleProgram {

	public void run() {
		int n = readInt();
		println(primeDivisors(n));
		
	}
	
		private int primeDivisors(int  n) {
			int maxDivisor = 0;
				for(int i=1; i<=n; i++) {
					if(n % i == 0) {
						if(Prime(i)){
							maxDivisor = i;
		
		                }
				    }
			    }
			return maxDivisor;
		
		}
		private boolean Prime (int n) {
			for(int i=2; i<n; i++) {
				if(n % i == 0){
				return false;
				}
			}
		return true;		
		}		
}	
		
		
		
		
		
		
//		
//		
//		
//		int n = readInt("enter number: ");
//		FindDivisors(n);
//		println(biggestDivisor(n));
//	}
//
//	private int FindDivisors(int n) {
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				int divisor = i;
//
//				println(divisor);
//			}
//		}
//		return divisor;
//	}
//
//	// private int biggestDivisor(int n) {
//	// int bigDiv = 0;
//	// for(int i=0; i < Math.sqrt(n); i++){
//	// if(n % i != 0){
//	// prime = true;
//	// }
//	// }
//	// return null;
//	// }
//
//}
