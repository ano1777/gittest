import acm.program.ConsoleProgram;

public class ConsoleProgram30 extends ConsoleProgram{
	public void run() {
		int n = readInt("Enter n");
		
		int reversedN = reverse(n);
		println(reversedN);
		
	}

	private int reverse(int n) {
		while( n != 0){
			int lastDigit = n %10;
			n /= 10;
			print(lastDigit);
		}
			
		return 0;
	}

}
