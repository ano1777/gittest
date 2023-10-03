import stanford.karel.Karel;
public class karel4 extends Karel{
	void turnaround(){
		turnLeft();
		turnLeft();
	}
public void run() {
  move();
	while(beepersPresent()){
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
		pickBeeper();
		pickBeeper();
		turnaround();
		move();
		
	}
	}
		}
		
