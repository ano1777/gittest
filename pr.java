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
		carryBeeperToTheNextPile2();
	}
}
    private void carryBeeperToTheNextPile2() {
	// TODO Auto-generated method stub
	pickBeeper();
	turnAround();
	move();
	putBeeper();
	move();
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
	turnAround();
	move();
	putBeeper();
}


	private void moveForwards() {
	// TODO Auto-generated method stub
		move();
	while(noBeepersPresent()){
		move();
		if(beepersPresent()){
		carryBeeperToTheNextPile2();
		}
	}
 }
}
    
    

	









