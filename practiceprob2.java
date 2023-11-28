import acm.program.ConsoleProgram;

public class practiceprob2 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		println(isSequential(str));
	}

	private boolean isSequential(String str) {
		for(int i=0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isLowerCase(ch)){
				
			}
		}
		return true;
	}

}
// (int) str.charAt(i) -