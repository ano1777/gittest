import stanford.karel.SuperKarel;

public class checkboardpractice extends SuperKarel {
	public void run(){
		while(frontIsClear()){
			putBeeper();
			move();
			turnLeft();
			move();
			putBeeper();
			turnLeft();
			move();
		}
	}

}
