
import acm.program.ConsoleProgram;
import java.lang.Math;

 
public class console25 extends ConsoleProgram{
	public void run() {
		int n = readInt(" Enter n:");
		int m = readInt("Enter m:");
		for (int i = 1; i <= Math.min (n, m); i++){
			if ( n % i == 0 && m % i ==0){
				println(i);
				break;
			}
		}
	}
	

}
	
