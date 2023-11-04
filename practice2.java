import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class practice2 extends GraphicsProgram {

	public void run() {
		int numBricks = 14;
		for( int j=1; j<=numBricks; j++){
		for (int i=1; i<=14; i++) {
			double x = getWidth()/2 - (numBricks/2)*30 + numBricks*30;
			double y = getHeight() - j * 12;
			GRect myRect = new GRect(x, y, 30, 12);
			add(myRect);
		
		}
		numBricks--;
	}

}
}