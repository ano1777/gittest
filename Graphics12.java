

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
        GRect GRect1=new GRect(70,100);
        add (GRect1,270,220);
        
        GRect GRect2=new GRect(70,100);
        add (GRect2,360,220);
        
        GLine GLine2=new GLine(305,220,305,320);
        add (GLine2,305,220);

        GLine GLine4=new GLine(270,270,305,270);
        add (GLine4,270,270);
        
        GLine GLine3=new GLine(360,270,430,270);
        add (GLine3,360,270);
        
        GLine GLine5=new GLine(395,220,395,320);
        add (GLine5,395,220);
        
        
       
	
	}
	

	
	}

