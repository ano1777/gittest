import stanford.karel.SuperKarel;

public class pr extends SuperKarel {
public void run(){
	fillTheLine();
	checkBeepers();
	goBackAndUpToTheNextLine();
	fillTheSecondLine();
	checkBeepers();
	
	
}

private void fillTheSecondLine() {
	// TODO Auto-generated method stub
	move();
	fillTheLine();
}

private void goBackAndUpToTheNextLine() {
	// TODO Auto-generated method stub
	while(frontIsClear()){
		move();
		if(frontIsBlocked()){
			turnRight();
			move();
			turnRight();
			fillTheSecondLine();
		}
	}
}

private void fillTheLine() {
	// TODO Auto-generated method stub
	while(frontIsClear()){
		putBeeper();
		if(frontIsClear()){
			move();
		}
		if (frontIsClear()){
			move();
         }
		
		if(frontIsBlocked()){
			checkBeepers();		
			}
}
}

private void checkBeepers() {
	// TODO Auto-generated method stub
	if(frontIsBlocked()){
		turnAround();
		move();
		if(noBeepersPresent()){
			turnAround();
			move();
			putBeeper();
		}else{
			turnAround();
			move();
		}
	}
}
}




putBeeper();
while(frontIsClear()){
	move();
	if(frontIsBlocked()){
		putBeeper();
		turnAround();
		while(noBeepersPresent()){
			move();
			if(beepersPresent()){
				turnAround();
				while(noBeepersPresent()){
				  move();
			}
			}
		}
	}
}
















