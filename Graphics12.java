

import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Graphics12 extends GraphicsProgram{
	public void run(){
		GRect myRect = new GRect (200,400);
		add(myRect,250,200);
		
		GOval myOval =new GOval (100,100);
		add (myOval,100,100);
		
		add (myOval);
		myOval.setFilled(true);
		myOval.setColor(Color.yellow);
		
        GLine myGLine=new GLine(250,200,350,100);
        add (myGLine,250,200);
	
	}
	

	
	}

