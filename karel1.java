import stanford.karel.*;
public class karel1 extends SuperKarel{
 public void run(){
	 while(frontIsClear()){ 
	    	move();
		    if(beepersPresent()){
		    	turnAround(); 
		    	move();
		    	if(noBeepersPresent()){
		    	putBeeper();
		    }
		    	if(beepersPresent()){
		    		move();
		    		if(noBeepersPresent()){
		    			move();
		    		
		    		if(noBeepersPresent()){
		    			turnAround();
		    			move();
		    			move();
		    			
		    		}
		    		}
		    	}
		    }     
			    while(noBeepersPresent()){
			    	move();
			    	if(beepersPresent()){
			    		turnAround();
			    		move();
			    		if(noBeepersPresent()){
			    		putBeeper();
			    		}
			    	}
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
























