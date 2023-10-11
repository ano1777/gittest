

import java.awt.Color;

import acm.graphics.GLine;
import acm.graphics.GObject;
import acm.graphics.GOval;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;


public class Graphics12 extends GraphicsProgram{
	public void run(){
		/*home*/
		GRect myRect = new GRect (200,300);
		add(myRect,250,200);
		
		add(myRect);
		myRect.setFilled(true);;
		myRect.setColor(Color.GRAY);
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
        add(GRect1);
        GRect1.setFilled(true);
        GRect1.setColor(Color.YELLOW);
        
        
        GRect GRect2=new GRect(70,100);
        add (GRect2,360,220);
        
        add(GRect2);
        GRect2.setFilled(true);
        GRect2.setColor(Color.YELLOW);
        
        GLine GLine2=new GLine(305,220,305,320);
        add (GLine2,305,220);

        GLine GLine4=new GLine(270,270,340,270);
        add (GLine4,270,270);
        
        GLine GLine3=new GLine(360,270,430,270);
        add (GLine3,360,270);
        
        GLine GLine5=new GLine(395,220,395,320);
        add (GLine5,395,220);
        
        /*draws door*/
        GRect Door=new GRect(90,160);
        add (Door,305,340);
        
       add(Door);
       Door.setFilled(true);;
       Door.setColor(Color.RED);
        
        /*draws chimney*/
        GRect chimney=new GRect(20,40);
        add (chimney,380,130);
        
        add(chimney);
        chimney.setFilled(true);
        chimney.setColor(Color.ORANGE);
	
	}
	

	
	}

