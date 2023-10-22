import com.sun.prism.paint.Color;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;

public class checkerboardgraphics extends GraphicsProgram{
	private static final int NUM_COLUMNS = 8;
	private static final int NUM_ROWS = 8;
	public void run() {
		int squareSize = getWidth() / NUM_COLUMNS;
		for (int i = 0; i < NUM_COLUMNS ;i++ ){
			for (int j=0; j< NUM_ROWS ; j++){
				int x = i * squareSize;
				int y = j * squareSize;
				GRect square = new GRect(x, y,squareSize, squareSize );
				square.setFilled(((i*j) % 2) == 1);
				add(square);
				
			}
		}
		
	}

}
