import stanford.karel.*;
public class karel2 extends Karel{
public void run(){
	while (beepersPresent()){
		move();
	}
	while (noBeepersPresent()){
		putBeeper();
		move();
	}
	while (frontIsClear()){
		move();
		putBeeper();
	}
	
		
 }
}
