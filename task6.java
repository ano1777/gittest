import stanford.karel.SuperKarel;
public class task6 extends SuperKarel{
	public void run(){
		putBeeper();
		while(frontIsClear()){
			move();
			putBeeper();
		}
		while(frontIsBlocked()){
			turnAround();
			goBack();
			turnRight();
			move();
			turnRight();
		}
		
	}

	private void goBack() {
		while(frontIsClear()){
			move();
		}
	}
	}
	


