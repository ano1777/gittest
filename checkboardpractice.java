import stanford.karel.SuperKarel;

public class checkboardpractice extends SuperKarel {
	public void run(){
		
		
		  putBeeper();
		    while(frontIsClear()){
		    if(frontIsClear()){
			   move();
		    }
		    if(frontIsClear()){
			   move();
		    }
		    
		      if(frontIsBlocked()){
		    	checkIfBeepersPresentOnThePreviousPile();
		    	}
			
			   goBackAndUpToTheNextLine();
	

}
	}

	private void goBackAndUpToTheNextLine() {
		// TODO Auto-generated method stub
		 turnAround();
			while(frontIsClear()){
				move();
				if (frontIsBlocked()){
					turnRight();
					move();
					turnRight();
					
				}
			}
					
			}
	

	private void checkIfBeepersPresentOnThePreviousPile() {
		// TODO Auto-generated method stub
		turnAround();
    	move();
    	while(noBeepersPresent()){
    		turnAround();
    		move();
    		putBeeper();
	}
	}
	
	
	}

