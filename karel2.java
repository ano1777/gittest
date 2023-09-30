import stanford.karel.*;
public class karel2 extends Karel{
public void run(){
	while(frontIsClear()){
		putBeeper();
		move();
	}
	while(beepersPresent()){
		move();
	}
		
}
}
