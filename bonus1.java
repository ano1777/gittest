import stanford.karel.*;
public class bonus1 extends Karel{
	void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	
	}
public void run(){
	while(frontIsClear()){
		putBeeper();
		move();

	while(facingEast()){
		if (frontIsBlocked()){
			putBeeper();
			turnLeft();
			move();
			turnLeft();
			putBeeper();
		}
		while (facingWest()){
			if(frontIsBlocked()){
			putBeeper();
			turnRight();
			move();
			turnRight();
			putBeeper();
			}
		}
	
	}
	}
}
}
