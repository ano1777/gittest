import stanford.karel.*;
public class problem extends Karel {
	void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}
	void pick10(){
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
		pickBeeper();
	}
	void put2(){
		putBeeper();
		putBeeper();
	}
 public void run(){
	 move();
	 move();
	 move();
	 move();
	 pick10();
	 move();
	 putBeeper();
	 move();
	 turnRight();
   
 }
	 
}
