import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class consoleBoard extends GraphicsProgram{
	private static final int NUM_COLUMNS = 11;
	private static final int NUM_ROWS = 11;
	public void run() {
		addVerticalLine();
		addHorizontalLine();
	}
	private void addHorizontalLine() {
		// TODO Auto-generated method stub
		
	}
	private void addVerticalLine() {
		double width  = (double)getWidth() / NUM_COLUMNS - 1;
		for (int i=0; i< NUM_COLUMNS; i++);{
			double x = getWidth() / NUM_COLUMNS; 
		    double y = 0;
		    double x1 = x;
		    double y1 = getHeight();
			GLine verticalLine = new GLine( x, y, x1, y1);
			add (verticalLine);
		}
		
		
	}
	
	

}
