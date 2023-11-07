import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphics39 extends GraphicsProgram{
	private static final int PAUSE_TIME = 20;
	private static final int INITIAL_VELOCITY = 5;
	public void run(){
	GOval newOval = new GOval(0, getHeight()/2 - 15 , 50, 50);
	newOval.setFilled(true);
	add(newOval);
	int initialX = getWidth() - 60;

	while(newOval.getX() <= initialX){
	newOval.move(5,0);
	pause(PAUSE_TIME);
	}
	
}
}