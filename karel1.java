import stanford.karel.*;
public class karel1 extends SuperKarel{
 public void run(){
	 while(frontIsClear()){ 
	    	move();
		    if(beepersPresent()){
		    	turnAround(); 
		    	move();
		    	if(noBeepersPresent()){
		    	putBeeper();
		    }
		    	if(beepersPresent()){
		    		move();
		    		if(noBeepersPresent()){
		    			move();
		    		
		    		if(noBeepersPresent()){
		    			turnAround();
		    			move();
		    			move();
		    			
		    		}
		    		}
		    	}
		    }     
			    while(noBeepersPresent()){
			    	move();
			    	if(beepersPresent()){
			    		turnAround();
			    		move();
			    		if(noBeepersPresent()){
			    		putBeeper();
			    		}
			    	}
			    }
			}
	 

}
}