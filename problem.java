import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class problem extends GraphicsProgram {
	private static final double FACE_WIDTH = 40;
	private static final int FACE_HEIGHT = 60;
	public void run (){
		addLine();
		addRobotFace();
	
 }

	private void addRobotFace() {
		double x1 = getWidth()/2 - 20;
		double y1 = getHeight()/2 - 30;
		double width = FACE_WIDTH;
		double height = FACE_HEIGHT;
		GRect myGRect = new GRect(x1,y1, width, height);
		add (myGRect);
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
