import stanford.karel.SuperKarel;
public class task6 extends SuperKarel{
	public void run(){
		moveTowards();
		makeOperation();
		}
		
	private void makeOperation() {
        putBeeper();
        turnLeft();
	}

	private void moveTowards() {
		 for (int i=0;i<8;i++){
			if (frontIsClear()){
		 
			move();
			}else{
				move();
			
			}
		}
	}
	}
	


