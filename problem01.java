import stanford.karel.karel;

public class problem01 extends karel{
	//* 1.karel is standing on 1x1, the beeper is on 3x1. 
	//* Karel must put beeper on 4x1 and finish working.
	
	public void run() {
		move();
		move();
		pickBeeper();
		move();
		turnRight();
		move();
		putBeeper();
		
	 function turnRight{
		turnLeft();
		turnLeft();
		turnLeft();
	}
	}
}
	
