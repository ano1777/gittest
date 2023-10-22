import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class consoleBoard extends GraphicsProgram{
	private static final int NUM_LINES = 11;
	
    public void run() {
	
	for (int i=0; i< NUM_LINES; i++) {
        addVerticalLine(i);
		addHorizontalLine(i);
	}
}
    
	private void addHorizontalLine(int i) {
		double height = (double)getHeight()/(NUM_LINES -1);
		double x = 0;
		double y = i * height;
		double x1 = getWidth();
		GLine horizontalLine = new GLine(x,y,x1,y);
		add(horizontalLine);
	}
	
	private void addVerticalLine(int i) {
		double width  = (double)getWidth() /(NUM_LINES - 1);
			double x = i * width; 
		    double y = 0;
		    double y1 = getHeight();
			GLine verticalLine = new GLine( x, y, x, y1);
			add (verticalLine);
		}		
		
}
	



