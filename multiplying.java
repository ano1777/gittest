import stanford.karel.SuperKarel;

public class multiplying extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			move();
			backUpBeeperOnTheNextPill();
		}
		putMultipliedBeepersOnTheNextPill();
		
		
	}

	private void putMultipliedBeepersOnTheNextPill() {
		// puts beeper from 2x3 to 4x1
		turnLeft();
		move();
		while (beepersPresent()){
		pickBeeper();
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

	private void backUpBeeperOnTheNextPill() {
		// backs up the beeper while beeper is present
		pickBeeper();
		turnLeft();
		move();
		turnAround();
		putBeeper();
		move();
		putBeeper();
		turnLeft();	
	}
	

}
