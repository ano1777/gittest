import stanford.karel.SuperKarel;

 public class checkboardpractice extends SuperKarel {
	public void run(){
		while(frontIsClear()){
		fillTheLine();
		goBackAndUpToTheNextLine1();
		fillTheSecondLine();
		goBackAndUpToTheNextLine2();
	
			
		if(frontIsBlocked()){
			turnAround();
			if(frontIsBlocked()){
				turnRight();
			    fillOneLine();
		     }
			
			
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


	private void goBackAndUpToTheNextLine1() {
		
		/*goes back to the first column*/
		turnAround();
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				turnRight();
				move();
				turnRight();
				
			}
			
				fillTheSecondLine();
			
			
		}
	}
	

	private void fillTheSecondLine() {
		/*moves and puts beeper on one pile from two*/
		while(frontIsClear()){
		move();
		fillTheLine();
		if(frontIsBlocked()){
			goBackAndUpToTheNextLine2();
		}
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
			fillTheLine();
			
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
			turnLeft();
			if(frontIsClear()){
				turnRight();	
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
		
		
	
	
 
 