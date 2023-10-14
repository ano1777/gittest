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
		  if(leftIsBlocked()){
			 
		  }
		 
	}
		



	private void fillTheSecondLineAndGoBackAndToTheNextLine() {
		// TODO Auto-generated method stub
		fillTheSecondLine();
		if(leftIsClear()){
		goBackAndUpToTheNextLine();
		}else{
			turnRight();
		}
	}



	private void fillTheLineAndGoBackAndUpToTheNextLine() {
		// TODO Auto-generated method stub
		fillTheLine();
		if(leftIsClear()){
		goBackAndUpToTheNextLine();
		}else{
			turnRight();
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
		if(leftIsClear()){
		turnAround();
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				turnRight();
				if(frontIsClear()){
				move();
				turnRight();
				fillTheSecondLine();
			}
			}
		}
	}
	}
	private void goBackAndUpToTheNextLine2(){
		if(leftIsClear()){
		turnAround();
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				turnRight();
				if(frontIsClear()){
				move();
				turnRight();
				fillTheLine();
			}
			}
		}
	}
	}

	private void fillTheSecondLine() {
		/*moves and puts beeper on one pile from two*/
		move();
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
		           goBackAndUpToTheNextLine2();	        
		       } else{
		    	   turnRight();
		       }
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
			turnLeft();
			if(frontIsClear()){
				turnRight();
		        goBackAndUpToTheNextLine();
			} else{
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
	
		
		
	
	
 
 