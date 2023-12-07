import java.util.Arrays;

import acm.program.ConsoleProgram;

public class problem54 extends ConsoleProgram {
	public void run() {
		int[] n = {1,4,5,6,8};
		n[2]= n[1]+n[4];
		println("n is :" + Arrays.toString(n));
	}

}
