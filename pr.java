import stanford.karel.SuperKarel;

public class pr extends SuperKarel {
public void run(){
	putBeepersOnTheSides();
	fillTheRowAndMoveToTheMiddlePoint();
	pickBeepersExceptTheMiddle();
	
}
/*
 * before this function karel stands on 1x1, facing East. firstly, it puts beeper on that spot and then goes
 * to the last pile of the row, at the wall, puts beeper on it and finally turns around.
 * after this action karel is facing West.
 */
  private void putBeepersOnTheSides() {
	   putBeeper();
	     while(frontIsClear()){
	      move();
	      if(frontIsBlocked()){
	     	 putBeeper();
	    	 turnAround();
	    	 fillTheRowAndMoveToTheMiddlePoint();
	     }
	}
}
 /*
  * 
  */

    private void fillTheRowAndMoveToTheMiddlePoint() {
    	while(frontIsClear()){
    	move();
    	putBeeper();
    	while(noBeepersPresent()){
    		move();
    		if(beepersPresent()){
    			turnAround();
    			move();
    			putBeeper();
    			}
    		}
    	}
	
    }

    private void pickBeepersExceptTheMiddle() {
	
	
}


}














