import acm.program.ConsoleProgram;

public class randomSpeed extends ConsoleProgram {
	public void run() {
		String first = readLine();
		String sec = readLine();
		println(isAnagram(first, sec));
	}

	private boolean isAnagram(String first, String sec) {
		int m =0;
		int n =0;
		int num1 =0;
		int num2 =0;
		if(first.length() != sec.length())
			return false;
		else
			for(int i=0; i<first.length(); i++){
				char symb = first.charAt(i);
				 n = countChars(first, symb);
				 num1 += (int) symb;
				 println(num1);
			}
		for(int j=0; j<sec.length(); j++){
			  char cha = sec.charAt(j);
			   m = countChars(sec, cha);
			   num2+= (int)cha;
			   println(num2);
		}
		if(n == m && num1==num2){
		return true;
		}
		return true;
	}

	private int countChars(String text, char ch) {
		int number = 0;

		for (int i = 0; i < text.length(); i++) {
			if(ch == text.charAt(i)){
				number ++;
			}

		}
		return number;
	}
}
