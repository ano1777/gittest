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
	 for(int i=0; i<10; i++){
		 pickBeeper();
	 }
	 move();
	 for (int i=0; i<10; i++){
		 putBeeper();
	 }
		 
	 move();
	 turnRight();
   
 }
	 
}
