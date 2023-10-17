import acm.program.ConsoleProgram;

public class concsolepr extends ConsoleProgram {
	public void run(){
		println("this program counts average harmonic");
		int x = readInt("Enter x = ");
		int y = readInt("Enter y = ");
		int z = readInt("Enter z =");
		double harmonic = (double) (x*y*z)/(x*y)+(y*z)+(x*z);
		print (harmonic);
	}

}
