import acm.program.ConsoleProgram;

public class aatrings extends ConsoleProgram {
	public void run() {
		String text = "ania";
		String str = "";
		println(str);
		for (int i=0; i <  text.length(); i++ ){
			char current = text.charAt(i);
		 
			str = current  +  str;
		}
	}
}
