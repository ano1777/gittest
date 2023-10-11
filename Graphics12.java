

import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Graphics12 extends GraphicsProgram{
	public void run(){
		/*home*/
		GRect myRect = new GRect (200,400);
		add(myRect,250,200);
		/*sun*/
		GOval myOval =new GOval (100,100);
		add (myOval,100,100);
		
		add (myOval);
		myOval.setFilled(true);
		myOval.setColor(Color.yellow);
		
		   /*draws triangle on the roof*/
        GLine myGLine=new GLine(250,200,350,100);
        add (myGLine,250,200);
     
        GLine GLine1=new GLine(450,200,350,100);
        add (GLine1,450,200);
        
        /*draws windows*/
        GRect GRect1=new GRect(60,120);
        add (GRect1,260,220);
        
        GRect GRect2=new GRect(60,120);
        add (GRect2,330,220);
	
	}
	

	
	}

