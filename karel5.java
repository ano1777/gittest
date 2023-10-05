import stanford.karel.SuperKarel;
public class karel5 extends SuperKarel{
	public void run(){
		move();
		backupBeepers();
		//backupBeepersOnTheSecondPile
		//goBackAndPutBeepersBack
		
	
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
