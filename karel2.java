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
    			turnRight();
    			move();
    			turnRight();
    		}
    		putBeeper();
    		move();
    	}
    	
    	
     }
	

}