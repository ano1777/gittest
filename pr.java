import stanford.karel.SuperKarel;

public class pr extends SuperKarel {
public void run(){
	putBeepersOnTheSides();
	fillTheRowAnMoveToTheMiddlePoint();
	pickBeepersExceptTheMiddle();
	
}

private void putBeepersOnTheSides() {
	// TODO Auto-generated method stub
	putBeeper();
	while(frontIsClear()){
	     move();
	     if(frontIsBlocked()){
	    	 putBeeper();
	    	 turnAround();
	    	 
	     }
	}
}


private void fillTheRowAnMoveToTheMiddlePoint() {
	// TODO Auto-generated method stub
	

}

}














