import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphics39 extends GraphicsProgram{
	public void run(){
	GOval newOval = new GOval(0, getHeight()/2);
	newOval.setFilled(true);
	add(newOval);
	newOval.move(1, 0);
	pause(1);

}
}