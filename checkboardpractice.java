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
			
			
		}
	}
		
	
	
	
	private void checkIfBeepersPresentOnThePreviousPile() {
		// TODO Auto-generated method stub
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


	private void goBack() {
		
		/*goes back to the first column*/
		turnAround();
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
		/*moves and puts beeper on one pile from two*/
		move();
		fillTheLine();
		if(frontIsBlocked()){
			goBack2();
		}
	}




	private void goBack2() {
		// TODO Auto-generated method stub
		/*goes back to the first column*/
		turnAround();
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				goUp2();
			}
			
		}
	}
	
	private void goUp2() {
		// TODO Auto-generated method stub
		turnRight();
		move();
		turnRight();
		fillTheLine();
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
			turnLeft();
			if(frontIsClear()){
				turnRight();
				goBack();	
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
		
		
	
	
 
 