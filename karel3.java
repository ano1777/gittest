import stanford.karel.Karel;
public class karel3 extends Karel {
	void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
 public void run(){
	while(facingNorth()){
		for(int i=0;i<3;i++){
		putBeeper();
		move();
		}
		turnRight();
		move();
		turnRight();
	while (facingSouth()){
		for(int i=0;i<3;i++){
			move();
		}
		turnLeft();
		move();
		turnLeft();
	}
	}
	
	
	
	
	

	
}
}
