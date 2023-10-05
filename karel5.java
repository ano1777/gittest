import stanford.karel.SuperKarel;
public class karel5 extends SuperKarel{
	public void run(){
		move();
		backupBeepers();
		backupBeepersOnTheSecondPile();
		goBackAndPutBeepersBack1();
		goBackAndPutBeepersBack2();
		
	
	}
	
	private void goBackAndPutBeepersBack2() {
		turnAround();
		move();
		while(beepersPresent()){
		turnRight();
		move();
		pickBeeper();
		turnAround();
		move();
		putBeeper();
		turnAround();
		
	}

	private void goBackAndPutBeepersBack1() {
		turnLeft();
		move();

		while(beepersPresent()){
			pickBeeper();
			turnAround();
			move();
			putBeeper();
			turnAround();
			move();
			
		}
     		
	}

	private void backupBeepersOnTheSecondPile() {
		move();
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnAround();
		}
    		
	}

	private void backupBeepers(){
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
			turnAround();
			move();
			turnLeft();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	
}
}
