import stanford.karel.SuperKarel;

 public class checkboardpractice extends SuperKarel {
	public void run(){
		while(frontIsClear()){
		  fillTheLine();
		  fillTheSecondLine();
		  
		}
		
		if(frontIsBlocked()){
			turnAround();
			if(frontIsBlocked()){
				turnRight();
			    fillOneLine();
		     }
			
			
		}
	}
		
	
	
	private void checkIfBeepersPresentOnThePreviousPile() {
	
		if(frontIsBlocked()){
		turnAround();
		move();
		if(noBeepersPresent()){
			turnAround();
			move();
			putBeeper();
		}else{
			turnAround();
			move();
		}
	}
	}


	private void goBackAndUpToTheNextLine() {
		
		/*goes back to the first column*/
		turnAround();
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				turnRight();
				move();
				turnRight();
				
			}
			
		}
	}
	

	private void fillTheSecondLine() {
		/*moves and puts beeper on one pile from two*/
		move();
		while(frontIsClear()){
		fillTheLine();
		
	
		}
	}


	private void goBackAndUpToTheNextLine2() {
		/*goes back to the first column*/
		turnAround();
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				turnRight();
				move();
				turnRight();	
		    }
		}
	}
	




	private void fillTheLine() {
		/*goes to the last pile and puts beeper on one pile from two
		  */
		while(frontIsClear()){
		putBeeper();
		if(frontIsClear()){
			move();
		}
		if (frontIsClear()){
			move();
         }
		
		if(frontIsBlocked()){
			checkIfBeepersPresentOnThePreviousPile();
			if(leftIsClear()){
			goBackAndUpToTheNextLine();
			}
		}
		}
		}
	
	
	private void fillOneLine() {
		
		/* fills one line in 1x8 world*/
		
		while(frontIsClear()){
			putBeeper();
			if(frontIsClear()){
			move();
			}
			if(frontIsClear()){
				move();
			}
			
			}
		}
	}
		
		
	
	
 
 