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
 *  it makes the robot move to the East and put  the diamond on 2x1 pile.
 */

    private void checkTheWorld2x2() {
	    move();
	    if(frontIsBlocked()){
		  putBeeper();
	    }
    }
   
/*
 * before doing this method, karel stands on 1x1, facing East. at first, it must move
 * forwards until the wall is present. when it reaches the wall, it puts diamond on
 * the pile on which it is standing, turn around and do the same thing on the West
 * side of the world. Then it takes beeper from the 1x1 pile and carries it to 2x1,
 * does the same thing on the East side, turns back to the West and does the same 
 * thing until it reaches the middle point of the first row.
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
 * before this action karel stands on 1x1, facing East.
 * this function makes karel put diamonds on the edges of the first row. 
 * at first it moves while front is clear and puts beeper on the last pile. then
 * the robot turns around and moves to the West until the wall is present, it puts beeper there, too.
 * after this method the robot stands on the 1x1, facing West.
 */

	private void putBeepersOnTheSides() {
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
 * before this function karel stands on 1x1, facing West, and the beeper is present on that pile.
 * karel must take this beeper and put it on 2x1. to do this, it must  pick the beeper, turn around,
 * move and put beeper. with this function the robot carries beepers from West to the East and
 * it works on the West side of the middle point. this method is in the "while" cycle, which means that it will be 
 * repeated until it reaches the middle point of the row.
 */
	private void carryBeeperToTheNextPile() {		
		pickBeeper();
		turnAround();
		move();
		putBeeper();
	}
   
	
/*
 * 
 */

	private void moveForwards() {
		move();
	    while(noBeepersPresent()){
		move();
		if(beepersPresent()){
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



	
	
	 
    private void standOnTheMiddlePoint() {
	    turnAround();
	    move();
	    pickBeeper();
}
}
    
    

	









