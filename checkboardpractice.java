import stanford.karel.SuperKarel;

 public class checkboardpractice extends SuperKarel {
	public void run(){
		while(frontIsClear()){
		fillTheLine();
	}
		if(frontIsBlocked()){
			turnAround();
			if(frontIsBlocked()){
				turnAround();
			    fillOneLine();
		}
	}
	   
	}
	
	
	
	
	private void goBack() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				turnRight();
				move();
				turnLeft();
			}
			goBack();
		}
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
		}
	       goBack();
		
		}

	private void fillOneLine() {
		
		/* one line in 1x8 world*/
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
		
		
	
	
 
 