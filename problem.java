import acm.graphics.GLine;
import acm.program.GraphicsProgram;
public class problem extends GraphicsProgram {
	public void run (){
		addLine();
	
 }

	private void addLine() {
		double x1 = getWidth()/2;
		double y1 = 0;
		double x2 = x1;
		double y2 = getHeight();
		GLine midLine = new GLine(x1,y1,x2,y2);
		add (midLine);
	}
	 
}
