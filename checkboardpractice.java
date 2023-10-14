import stanford.karel.SuperKarel;

 public class checkboardpractice extends SuperKarel {
	public void run(){
		while(frontIsClear()){
		fillTheLine();
	}
		
		if(frontIsBlocked()){
			turnAround();
			if(frontIsBlocked()){
				turnRight();
			    fillOneLine();
		     }
            turnLeft();
            if(frontIsBlocked()){
			goBack();
		}
	}
	   
	}
	
	
	
	
	private void goBack() {
		
		/*goes back to the first column*/
		
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				goUp();
			}
			
		}
	}
	private void goUp() {
		/* goes up to the next line*/
		turnRight();
		move();
		turnRight();
		fillTheSecondLine();
	}




	private void fillTheSecondLine() {
		/*moves and puts beeper on  one pile from two*/
		move();
		fillTheLine();
	}




	private void fillTheLine() {
		/*goes to the last pile and puts beeper on one pile from to
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
		}
		}
		
		
		}
	
	
	
	
	
	
	
	private void checkIfBeepersPresentOnThePreviousPile() {
		/* goes back on the previous pile and if beeper is not present puts 
		*beeper on the next pile*/
		turnAround();
		
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
		
		
	
	
 
 