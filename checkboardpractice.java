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
		while(leftIsClear()){
		goBackAndUpToTheNextLine();
		}
	}



	private void fillTheLineAndGoBackAndUpToTheNextLine() {
		// TODO Auto-generated method stub
		fillTheLine();
		while(leftIsClear()){
		goBackAndUpToTheNextLine();
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
		while(leftIsClear()){
		turnAround();
		while(frontIsClear()){
			move();
			}
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
	
	private void goBackAndUpToTheNextLine2(){
		while(leftIsClear()){
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
				
				while(leftIsClear()){
					
		           goBackAndUpToTheNextLine2();	        
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
			    
			while(leftIsClear()){
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
	
		
		
	
	
 
 