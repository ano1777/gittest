import acm.program.ConsoleProgram;

public class connsole18 extends ConsoleProgram {
	public void run(){
		println("this program shows the maximal number");
		int num1 = readInt("Enter num1: ");
		int num2 = readInt("Enter num2: ");
		if ( num1 > num2){
		    print (num1);
		}
		if (num2 > num1) {
			print (num2);
		}
		
	}

}
