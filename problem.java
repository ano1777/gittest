import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class problem extends GraphicsProgram {
	private static final double FACE_WIDTH = 80;
	private static final int FACE_HEIGHT = 120;
	private static final int EYES_WIDTH=15;
	private static final int EYES_HEIGHT=30;
	public void run (){
		addLine();
		addRobotFace();
	
 }

	private void addRobotFace() {
		addFace();
		addEyes();
		addMouth();
	}

	private void addEyes() {
		// TODO Auto-generated method stub
		double x1 = getWidth()/2 -40 + 20;
		double y1 = getHeight()/2 -60 +20;
		double width = EYES_WIDTH;
		double height = EYES_HEIGHT;
		GRect grect= new GRect(x1, y1,width, height);
		add (grect);
	}

	private void addFace() {
		// TODO Auto-generated method stub
		double x1 = getWidth()/2 - 40;
		double y1 = getHeight()/2 - 60;
		double width = FACE_WIDTH;
		double height = FACE_HEIGHT;
		GRect myGRect = new GRect(x1,y1, width, height);
		add (myGRect);
	}
	

	
	 
}
