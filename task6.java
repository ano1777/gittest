import stanford.karel.Karel;
public class task6 extends Karel{
	private void putBeeper2(){
		putBeeper();
		putBeeper();
	}
	private void turnAround(){
		turnLeft();
		turnLeft();
	}
public void run(){
	move();
	while (beepersPresent()){
		pickBeeper();
		turnLeft();
		move();
		putBeeper2();
	    turnAround();
	    move();
	    
	}
}
}
