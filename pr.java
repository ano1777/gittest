import stanford.karel.SuperKarel;

public class pr extends SuperKarel {
  public void run(){

	putTwoBeepersMirroringEachOther();
	standOnTheMiddlePoint();
	
}


   private void standOnTheMiddlePoint() {
	// TODO Auto-generated method stub
	   if(frontIsClear()){
	turnAround();
	move();
	pickBeeper();
}
   }
/*
 * 
 */


   private void putTwoBeepersMirroringEachOther() {
	
	 putBeepersOnTheSides();
	 while(beepersPresent()){
		 if(frontIsClear()){
		
		carryBeeperToTheNextPile();
	
		moveForwards();
		carryBeeperToTheNextPile2();
	}
}
   }

 /*
  * 
  */

    private void carryBeeperToTheNextPile2() {

	pickBeeper();
	turnAround();
	move();
	putBeeper();
	move();
}
    
/*
 * 
 */

	private void putBeepersOnTheSides() {
	// TODO Auto-generated method stub
    	while(frontIsClear()){
    		move();
    		if(frontIsBlocked()){
    			putBeeper();
    		    turnAround();
    		    while(frontIsClear()){
    		    	move();
    		    	if(frontIsBlocked()){
    		    		putBeeper();
    		    	}
    		    }
    		}
    		
    	}
}
	
/*
 */
 

	private void carryBeeperToTheNextPile() {
	// TODO Auto-generated method stub
	pickBeeper();
	turnAround();
	move();
	putBeeper();
}
	
/*
 * 
 */

	private void moveForwards() {
	// TODO Auto-generated method stub
		move();
	while(noBeepersPresent()){
		move();
		if(beepersPresent()){
		carryBeeperToTheNextPile2();
		}
	}
 }
}
    
    

	









