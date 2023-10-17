import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class problem extends GraphicsProgram {
	private static final double FACE_WIDTH = 80;
	private static final double FACE_HEIGHT = 120;
	private static final double EYES_WIDTH=15;
	private static final double EYES_HEIGHT=30;
	private static final Color FACE_COLOR = Color.YELLOW;
	private static final Color EYES_COLOR = Color.BLACK;
	private static final Color MOUTH_COLOR = Color.RED;
	public void run (){

		addRobotFace();
	
 }

	private void addRobotFace() {
		addFace();
		addEyes();
		drawMouth();
	}

	private void addEyes() {
		addLeftEye();
		addRightEye();
		
	}

	private void addLeftEye() {
		// TODO Auto-generated method stub
		double x1 = getWidth()/2 -40 + 20;
		double y1 = getHeight()/2 -60 +20;
		double width = EYES_WIDTH;
		double height = EYES_HEIGHT;
		GRect eye1= new GRect(x1, y1,width, height);
		add (eye1);
	}
	
	private void addRightEye() {
		double x1 = getWidth()/2 + FACE_WIDTH /2 -30 ;
		double y1 = getHeight()/2 - FACE_HEIGHT/2 +20 ;
		double width1 = EYES_WIDTH;
		double height1 = EYES_HEIGHT;
		GRect eye2= new GRect(x1, y1, width1, height1);
		add (eye2);
		
	}
	private void drawMouth(){
		double x1 = getWidth()/2 - EYES_WIDTH;
		double y1 = getHeight()/2 + EYES_WIDTH+10;
		double width = EYES_WIDTH + EYES_WIDTH;
		double height = EYES_WIDTH;
		GRect mouth = new GRect(x1, y1, width, height);
		add(mouth);
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
