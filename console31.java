import acm.program.ConsoleProgram;

public class console31 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter number : "); 
		int reverseNum = reverse(n);
		println(reverseNum);
		}

	private int reverse(int n) {
		int reverseNum = 0;
		while(n != 0){
		int lastNum = n % 10;
		n = n / 10 ;
		print  (lastNum);
		reverseNum = reverseNum * 10 + lastNum;
		}
	
		return reverseNum;
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	