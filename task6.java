import stanford.karel.SuperKarel;
public class task6 extends SuperKarel{
	public void run(){
		for (int i=0;i<8;i++){
			while(frontIsClear()){
				move();
			}
			while(frontIsBlocked()){
				turnLeft();
				putBeeper();
			}
		
			}
		
	}
	}
	


