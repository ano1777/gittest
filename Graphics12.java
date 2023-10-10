

import java.awt.Color;

import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Graphics12 extends GraphicsProgram{
	public void run(){
		GRect myRect = new GRect (100,200);
		add (myRect,200,300);
		add(myRect,250,270);
		
		GOval myOval =new GOval (100,100);
		add (myOval,100,100);
		
		add (myOval);
		myOval.setFilled(true);
		myOval.setColor(Color.YELLOW);
		
		GLine myGLine=new GRect(250,270,200,330);
		add (myGLine(200,330));
	
	}

	
	}

}
