import stanford.karel.Karel;
     public class karel2 extends Karel{
    	 void turnRight(){
      		turnLeft();
      		turnLeft();
      		turnLeft();
      	}
     public void run(){
    
    	while (frontIsClear()){
    		 if (frontIsBlocked()){
    	    	    putBeeper();
    				turnRight();
    				move();
    				putBeeper();
    				turnRight();
    		 }
    				
    		putBeeper();
    		move();
    	}
	
     }
}