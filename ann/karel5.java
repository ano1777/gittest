package ann;
import stanford.karel.SuperKarel;
public class karel5 extends SuperKarel{
	public void run(){
		move();
		backupBeepers();
		backupBeepersOnTheSecondPile();
		//goBackAndPutBeepersBack1();
		//goBackAndPutBeepersBack2();
		
	}
	
	

	private void backupBeepersOnTheSecondPile() {
		    turnAround();
		    move();
		    turnRight();
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
