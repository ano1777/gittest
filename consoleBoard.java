import acm.graphics.GLine;
import acm.program.GraphicsProgram;

public class consoleBoard extends GraphicsProgram{
	private static final int NUM_COLUMNS = 11;
	private static final int NUM_ROWS = 11;
	public void run() {
		int space = getWidth() / NUM_COLUMNS ;
		for (int i=0; i < NUM_COLUMNS ; i++){
			for (int j=0; j < NUM_ROWS ;  j++){
				int x = i * space;
				int y = j * space;
			
			GLine line = new GLine(x , y, getWidth(), getHeight());
			add( line);
		}
	
	}

}
}