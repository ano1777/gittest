/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {

	public void run() {
		println ("this program counts the average harmonic for three integers");
		int a = readInt ("Enter a =");
		int b = readInt ("Enter b =");
		int c = readInt ("Enter c =");
		double avrgHarm = (double) 1/((1/a)+(1/b)+(1/c));
		print (avrgHarm);
	 
	}
	
	

}
