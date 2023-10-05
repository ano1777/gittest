import stanford.karel.SuperKarel;
public class task6 extends SuperKarel{
	public void run(){
		for(int i=0;i<8;i++)
		moveTowards();
		makeOperation();
			
		}

	private void makeOperation() {
        putBeeper();
        turnLeft();
	}

	private void moveTowards() {
		while(frontIsClear()){
			move();
			while(frontIsBlocked()){
				makeOperation();
			}
		}
	}
	}
	


