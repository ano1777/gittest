import stanford.karel.SuperKarel;

 public class checkboardpractice extends SuperKarel {
	public void run(){
		while(frontIsClear()){
		  fillTheLineAndGoBackAndUpToTheNextLine();
		  fillTheSecondLineAndGoBackAndToTheNextLine();
		  
		}
		
		  if(frontIsBlocked()){
			turnAround();
			if(frontIsBlocked()){
				turnRight();
			    fillOneLine();
		     }
			
		
		}
	}
		
	
	
	private void fillTheSecondLineAndGoBackAndToTheNextLine() {
		// TODO Auto-generated method stub
		fillTheSecondLine();
		goBackAndUpToTheNextLine();
		
	}



	private void fillTheLineAndGoBackAndUpToTheNextLine() {
		// TODO Auto-generated method stub
		fillTheLine();
		goBackAndUpToTheNextLine();

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
				fillTheSecondLine();
			}
			
		}
	}
	

	private void fillTheSecondLine() {
		/*moves and puts beeper on one pile from two*/
		move();
		fillTheLine();
		if(leftIsClear()){
		
		goBackAndUpToTheNextLine();
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
			if(leftIsClear()){
			goBackAndUpToTheNextLine();
			fillTheSecondLine();
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
		
		
	
	
 
 