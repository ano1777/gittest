import acm.program.GraphicsProgram;

public class shualeduri22 extends GraphicsProgram {
	public void  run() {
		String adress = "1.1.1.1.1.11.1";
		 adress = adress.changeString(adress);
		println(adress);
	}
	private String changeString(String adress){
		String result = "";
		for(int i = 0 ; i < adress.length(); i++){
			if(adress.charAt(i) == '.'){
				result +="[.]";
			}
			else{
				result+=adress.charAt(i);
			}
		}
		return result;
	}

}
