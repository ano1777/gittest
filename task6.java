import stanford.karel.Karel;
public class task6 extends Karel{
	public void run(){
		for(int i=0;i<8;i++){
			move();
		}
		while(frontIsBlocked()){
			jumpOverTheWall();
		}
	}
	
	private void jumpOverTheWall(){
		turnLeft();
		while(rightIsBlocked()){
			move();
		}
		turnRight();
		move();
		turnRight();
		decend();
	}
	private void turnRight(){
		turnLeft();
		turnLeft();
		turnLeft();
	}
	private void decend(){
		while (frontIsClear()){
			move();
		}
	}
	

}
