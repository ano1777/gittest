import java.math.BigDecimal;

import acm.program.ConsoleProgram;

public class console17 extends ConsoleProgram {
	public void run() {
	calculateInDoubles();
}

	private void calculateInDoubles() {
		double a= readDouble ("Enter real number:");
		int integerPart = (int)a;
		double fractionPart = a - integerPart;
		println ("integer part:" + integerPart);
		println ("fraction Part:" + fractionPart);
		
	}	

}
