import stanford.karel.SuperKarel;

public class pr extends SuperKarel {
  public void run(){
    checkIfFrontAndLeftIsClear();
    if
	putTwoBeepersMirroringEachOther();
	standOnTheMiddlePoint();
	
}


   private void checkIfFrontAndLeftIsClear() {

	   if(frontIsBlocked()){
			turnLeft();
			if(frontIsBlocked()){
				putBeeper();
			}
		}
}


private void standOnTheMiddlePoint() {
	// TODO Auto-generated method stub
	   
	turnAround();
	move();
	pickBeeper();
}
   
/*
 * 
 */


   private void putTwoBeepersMirroringEachOther() {
	
	 putBeepersOnTheSides();
	 while(beepersPresent()){	
		carryBeeperToTheNextPile();
	
		moveForwards();
		carryBeeperToTheNextPile2();
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
    
    

	









