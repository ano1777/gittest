import stanford.karel.Karel;
     public class karel2 extends Karel{
    	 void turnRight(){
      		turnLeft();
      		turnLeft();
      		turnLeft();
      	}
     public void run(){
    
    	while (facingNorth()){
    		
    		putBeeper();
    		move();
    			if(frontIsBlocked()){
	    	    putBeeper();
				turnRight();
				move();
				turnRight();
		 }
    	
    	   while(facingSouth()){
    		putBeeper();
    	    move();
    	
    		 if (frontIsBlocked()){
    			 putBeeper();
    			 turnLeft();
    			 move();
    			 turnLeft();
    		 
    		 } 
    	 }
    	}		
	
     }
}