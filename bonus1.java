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
	}
	while(frontIsBlocked()){
		if (facingEast()){
			putBeeper();
			turnLeft();
			move();
			turnLeft();
			putBeeper();
		}
		while (frontIsBlocked()){
			if(facingWest()){
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
