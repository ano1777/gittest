import stanford.karel.*;
public class karel5 extends Karel{
	void turnaround(){
		turnLeft();
		turnLeft();
	}
public void run(){
	move();
	while (beepersPresent()){
		pickBeeper();
		move();
		move();
		putBeeper();
		turnaround();
		move();
		move();
		turnaround();
	}
	move();
	while (beepersPresent()){
		pickBeeper();
		move();
		putBeeper();
		turnaround();
		move();
		turnaround();
	}
	
}
}
