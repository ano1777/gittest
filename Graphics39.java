import acm.graphics.GOval;
import acm.program.GraphicsProgram;

public class Graphics39 extends GraphicsProgram{
	public void run(){
	GOval newOval = new GOval(0, getHeight()/2-15 , 30, 30);
	newOval.setFilled(true);
	add(newOval);
	double x = 0; 

	while(x < getWidth()-30){
	newOval.move(10,0);
	pause(10);
	}
}
}