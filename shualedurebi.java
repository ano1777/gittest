import acm.program.ConsoleProgram;

public class shualedurebi  extends ConsoleProgram{
	public void run() {
		String father = readLine();
		String child = readLine();
		println(iAmYourFather(father, child));
	}

	private boolean iAmYourFather(String father, String child) {
		int maxLength = 0;
		for (int i=0; i<child.length(); i++) {
			for(int j=i+1; j < child.length()+1; j++) {
				String currsub = child.substring(i,j);
				if(father.indexOf(currsub) == -1){
					break;
				}
					maxLength = Math.max(maxLength, currsub.length());
				}
			}
		
		return maxLength > father.length()/2.0;
	}

}
