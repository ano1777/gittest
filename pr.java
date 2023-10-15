import stanford.karel.SuperKarel;

public class pr extends SuperKarel {
public void run(){
	putTwoBeepersMirroringEachOther();
	
	
}


private void putTwoBeepersMirroringEachOther() {
	// TODO Auto-generated method stub
	putBeepersOnTheSides();
	while(beepersPresent()){
		carryBeeperToTheNextPile();
		moveForwards();
	}
}
    private void putBeepersOnTheSides() {
	// TODO Auto-generated method stub
    	while(frontIsClear()){
    		move();
    		if(frontIsBlocked()){
    			putBeeper();
    		    turnAround();
    		    while(frontIsClear()){
    		    	move();
    		    	if(frontIsBlocked()){
    		    		putBeeper();
    		    	}
    		    }
    		}
    		
    	}
}


	private void carryBeeperToTheNextPile() {
	// TODO Auto-generated method stub
	pickBeeper();
	
	move();
	putBeeper();
}


	private void moveForwards() {
	// TODO Auto-generated method stub
		move();
	while(noBeepersPresent()){
		move();
		turnAround();
		if(beepersPresent()){
		carryBeeperToTheNextPile();
		}
	}
 }
}
    
    

	









