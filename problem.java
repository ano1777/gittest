import stanford.karel.*;
public class problem extends Karel {
	void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
		
	}
}
 public void run(){
	 move();
	 move();
	 move();
	 move();
	 pickBeeper();
	 move();
	 putBeeper();
	 turnRight();
	
	 
   
 }
	 
}
