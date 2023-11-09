import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class bonus13 extends GraphicsProgram{
	public void run() {
		while(true) {
		//	removeAll();
			remove(line);
			GLine line = new GLine(0, getHeight()/2, getWidth(), getHeight()/2);
			add(line);
			pause(20);
			
		}
	}

}
