import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphics39 extends GraphicsProgram{
	public void run(){
	GOval newOval = new GOval(0, getHeight()/2, 30, 30);
	newOval.setFilled(true);
	add(newOval);
	newOval.move(10,0);
	pause(1);

}
}