import acm.program.ConsoleProgram;

public class console26  extends ConsoleProgram{
	public void run() {
		int num1 = readInt ("Enter numner 1:");
		int num2 = readInt("Enter number 2: ");
		for (int i = Math.max(num1, num2); i <= num1 * num2; i++ ){
			if(i % num1 == 0 & i % num2 == 0){
				print("this is the answer: " + i);
				break;
			}
		}
		
	}

		
		
	}
	
	


