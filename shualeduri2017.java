import acm.program.ConsoleProgram;

public class shualeduri2017 extends ConsoleProgram {
	public void run() {
		String str = readLine();
		String str2 = readLine();
		println(spellWord(str, str2));
	}

	private boolean spellWord(String str, String str2) {
		int a = 0;
		int b = 0;
		for(char i=0; i<200; i++){
			for(int f=0; f<str.length(); i++){
			if(str.charAt(f) == i) {
				a++;
			}
		}
			for(int j=0; j<str2.length(); j++){
				if(str2.charAt(j) == i) {
					b++;
				}
			}
			if(b>a) {
				return false;
			}
		
	}
		return true;

}
}
