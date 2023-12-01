import acm.program.ConsoleProgram;

public class shualedurebi  extends ConsoleProgram{
	public void run() {
		String father = readLine();
		String child = readLine();
		println(iAmYourFather(father, child));
	}

	private boolean iAmYourFather(String father, String child) {
		int maxLength = 0;
		for (int i=0; i<child.length()-1; i++) {
			for(int j=1; j < father.length(); j++) {
				String sub = father.substring(i,j);
				if(sub.equals(child)){
					maxLength = sub.length();
				}
			}
		}
		return maxLength > father.length()/2.0;
	}

}
