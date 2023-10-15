import stanford.karel.SuperKarel;

public class pr extends SuperKarel {

  public void run(){
	  /*
	   * this methods make karel move to the middle point of the first row, 
	   * put beeper on it and stay there. it should work in any world, that is shaped like a square.
	   * at first karel stands on 1x1, facing East. the robots final orientation is depended 
	   * on the number of columns in the world. in 1x1 world it just puts beeper, in 2x2
	   *  it moves and puts beeper on 2x1.
	   */
   	if(frontIsClear()) {
		checkTheWorld2x2();
	}	  
	  if(frontIsBlocked()) {
		  if(leftIsBlocked()) {
			  putBeeper();
		  }
   
	  }else {
	     putTwoBeepersMirroringEachOther();
	     standOnTheMiddlePoint();
	   }
  }
  
/*
 * the function helps karel to solve the middle point finding problem in 2x2 world.
 *  it makes the robot move and put  the diamond on 2x1 pile.
 */

    private void checkTheWorld2x2() {
	    move();
	    if(frontIsBlocked()){
		  putBeeper();
	    }
    }

    
    private void standOnTheMiddlePoint() {
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
    
    

	









