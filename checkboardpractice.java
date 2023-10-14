import stanford.karel.SuperKarel;

 public class checkboardpractice extends SuperKarel {
	public void run(){
		while(frontIsClear()){
		fillTheLine();
	}
		goBack();
		if(frontIsBlocked()){
			turnAround();
			if(frontIsBlocked()){
				turnAround();
			    fillOneLine();
		}
	}
	   
	}
	
	
	
	
	private void goBack() {
		
		/*goes back to the first column*/
		
		while(rightIsClear()){
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
		turnLeft();
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
		
		
	       goBack();
		}
		}
	
	private void fillOneLine() {
		
		/* fills one line in 1x8 world*/
		
		turnLeft();
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
		
		
	
	
 
 