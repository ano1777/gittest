import stanford.karel.SuperKarel;

public class bonus1 extends SuperKarel{
	public void run(){
		move();
		backupBeeperson1Pile();
		goBack();
		backupBeepersOn2Pile();
		goBack();
		
			
		}

	private void backupBeeperson1Pile() {
		while(beepersPresent()){
			pickBeeper();
			turnLeft();
			move();
			putBeeper();
		
	}
	}
}


