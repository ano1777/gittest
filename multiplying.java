import stanford.karel.SuperKarel;

public class multiplying extends SuperKarel{
	public void run(){
		move();
		while(beepersPresent()){
			pickBeeper();
			backUpBeeper();
		}
		
		
	}

	private void backUpBeeper() {
		// backs up the beeper while beeper is present
		turnLeft();
		move();
		putBeeper();
		turnAround();
		move();
		turnLeft();
		
	}

}
