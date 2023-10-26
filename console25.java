
import acm.program.ConsoleProgram;
import java.lang.Math;

 
public class console25 extends ConsoleProgram{
	public void run() {
		int n = readPositiveInt(" Enter n:");
		int m = readPositiveInt("Enter m:");
		for (int i = Math.min(n, m); i >= 1; i--){
			if ( n % i == 0 && m % i ==0){
				println(i);
				break;
			}
		}
	}

	private int readPositiveInt(String text) {
		int n = readInt(text);
		while (n < 0){
			println ("Enter positive number");
			n = readInt(text);
		}
		return n;
	}
	

}
	
