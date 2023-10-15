import stanford.karel.SuperKarel;

public class pr extends SuperKarel {
public void run(){
	putBeepersOnTheSides();
	fillTheRowTowardsTheMiddlePoint();
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
	    	
	      }
	  
	     
	}
	     }

 /*
  * 
  */

    private void fillTheRowTowardsTheMiddlePoint() {
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
    	while(beepersPresent()){
    		pickBeeper();
    		turnAround();
    		move();
    		if(noBeepersPresent()){
    			move();
    		}else{
    		putBeeper();
    		}
    	}
    	}
    			}
    		
    	
	
    

    private void pickBeepersExceptTheMiddle() {
    	if(beepersPresent()){
    		while(frontIsClear()){
    			move();
    			pickBeeper();
    			if(frontIsBlocked()){
    				pickBeeper();
    				turnAround();
    				goToTheOtherHalf();
    			}
    		}
    	}
	
	
}
    /*
     * karel is facing West.it must go to the 1x1 pile, picking up 
     * remaining beepers except the middle one.
     */
	 private void goToTheOtherHalf() {
		 while(noBeepersPresent()){
			 move();
			 if(beepersPresent()){
				 move();
				 pickUpAllBeepers();
			 }
			 if(frontIsBlocked()){
				 goToTheMiddlePoint();
			 }
		 }
		
		
	}
	private void goToTheMiddlePoint() {
		// TODO Auto-generated method stub
		turnAround();
		while(noBeepersPresent()){
			move();
		}
	}
	private void pickUpAllBeepers() {
		// TODO Auto-generated method stub
		while(beepersPresent()){
		pickBeeper();
		if(frontIsClear()){
		move();
		}
		
	}


}


}











