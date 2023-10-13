import stanford.karel.SuperKarel;

public class checkboardpractice extends SuperKarel {
	public void run(){
		
		
		fillTheLine();
		goBack();
		goUpToTheNextLine1();
		fillTheLine2();
		goBack();
		
	

}

	private void goUpToTheNextLine1() {
		// TODO Auto-generated method stub
		while(rightIsClear()){
		turnRight();
		}
		move();
		turnLeft();
		fillTheLine2();
		}

	private void fillTheLine2() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
			move();
			putBeeper();
			if(frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
			    putBeeper();
			}
			while(leftIsClear()){
			  if(frontIsBlocked()){
				goBack();
			  }
		    }
	  }
	}

	private void fillTheLine() {
		// TODO Auto-generated method stub
		while(frontIsClear()){
			putBeeper();
			if (frontIsClear()){
				move();
			}
			if(frontIsClear()){
				move();
			}
			while(leftIsClear()){
			  if(frontIsBlocked()){
				goBack();
			 }
			}
		}
	}

	private void goBack() {
		// TODO Auto-generated method stub
		turnAround();
		while(frontIsClear()){
			move();
			if(frontIsBlocked()){
				goUpToTheNextLine1();
			}
		}
		
	}
}

