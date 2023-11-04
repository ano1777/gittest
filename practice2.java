import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class practice2 extends GraphicsProgram {
	public void run() {
		for( int j=1; j<=14; j++){
		for (int i=1; i<=14; i++) {
			double x = getWidth()/2 - (14/2)*30 + i*30;
			double y = getHeight() - j * 12;
			GRect myRect = new GRect(x, y, 30, 12);
			add(myRect);
		
		}
	}

}
}