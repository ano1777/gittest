import stanford.karel.Karel;
     public class karel2 extends Karel{
    	 void turnRight(){
      		turnLeft();
      		turnLeft();
      		turnLeft();
      	}
     public void run(){
    
    	while (frontIsClear()){
    		putBeeper();
    		move();
    	}
    	
     while (frontIsBlocked()){
    	    putBeeper();
			turnRight();
			move();
			putBeeper();
			turnRight();
			
    	
    	
     }
	
     }
}