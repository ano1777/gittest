import stanford.karel.*;
public class problem extends Karel {
	void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
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
	 for(int i=0; i<10; i++){
		 putBeeper();
	 }
		
	 move();
	 turnRight();
   
 }
	 
}
