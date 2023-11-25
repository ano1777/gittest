import acm.program.ConsoleProgram;

public class aatrings extends ConsoleProgram {
	public void run() {
		String text = "ani yavelashvili";
		String str = "";
		
		for (int i=0; i <  text.length(); i++ ){
			char current = str.charAt(i);
		    //println(text.charAt(i));
			str = str + current ;
		}
	}
}
