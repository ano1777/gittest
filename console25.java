import acm.graphics.GLabel;
import acm.program.ConsoleProgram;
import java.lang.Math;

import com.sun.prism.paint.Color;

 
public class console25 extends ConsoleProgram{
	 private static final double NUMBER = 5;
	 
	 public void run() {
		 int n = readInt("enter number :");
	 
		 for(int i=0; i <= NUMBER; i++){
			 println(i + "!=" + factorial(i));
		 }

	}

	private double factorial(int n) {
		int result = 1;
		for (int i=1; i<NUMBER; i++){
	    result = i*result;
		} 
		return result;
	}

}
	
