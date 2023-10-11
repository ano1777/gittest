

import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Graphics12 extends GraphicsProgram{
	public void run(){
		GLine GLine1=new GLine(0,350,1000,350);
		add(GLine1,350,400);
		GRect myRect = new GRect (200,400);
		add(myRect,250,200);
		
		GOval myOval =new GOval (100,100);
		add (myOval,100,100);
		
		add (myOval);
		myOval.setFilled(true);
		myOval.setColor(Color.yellow);
		
		GLine myGLine=new GLine(250,270,200,270);
		add (myGLine,200,270);
	
	}

	

	
	}


