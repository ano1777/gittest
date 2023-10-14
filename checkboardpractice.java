import stanford.karel.SuperKarel;

 public class checkboardpractice extends SuperKarel {
	public void run(){
		fillTheLine();
	}

	private void fillTheLine() {
		/*goes to the last pile and puts beeper on one pile from to
		  */
		while(frontIsClear()){
		putBeeper();
		if(frontIsClear()){
			move();
		}
		if (frontIsClear()){
			move();
         }
		
		if(frontIsBlocked()){
			turnLeft();
			fillTheLine();
		}
		
		
	}
		
}
 