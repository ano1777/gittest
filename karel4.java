import stanford.karel.Karel;
public class karel4  extends Karel {
public void run() {
	move();
	while(beepersPresent()){
		pickBeeper();
		move();
		pickBeeper();
		move();
		putBeeper();
		putBeeper();
		turnLeft();
		turnLeft();
		move();
		move();
		turnLeft();
		turnLeft();
		
	}

		
		}
	}

