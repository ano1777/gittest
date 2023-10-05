import stanford.karel.SuperKarel;
public class task6 extends SuperKarel{
	public void run(){
		for(int i=0;i<7;i++){
			move();	
		
		jumpOverTheWall();
		}
	}
	
	private void jumpOverTheWall(){
		while(frontIsBlocked()){
		turnLeft();
		
		while(rightIsBlocked()){
			move();
		}
		turnRight();
		move();
		turnRight();
		decend();
		turnLeft();
        }
	}
	private void decend(){
		while (frontIsClear()){
			move();
			
		}
	}
	
}

