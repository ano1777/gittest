import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class practice2 extends GraphicsProgram {
	public void run() {
		for( int j=1; j<=14; j++){
		for (int i=14; i>=1; i--) {
			double x = getWidth()/2 - (i/2)*30 ;
			double y = getHeight() - j * 12;
			GRect myRect = new GRect(x, y, 30, 12);
			add(myRect);
		
		}
	}

}
}