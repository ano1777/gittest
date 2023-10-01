import stanford.karel.Karel;
public class karel2 extends Karel{
public void run(){
	while (noBeepersPresent()){
		putBeeper();
		move();
	}while (frontIsClear()){
		move();
	}
	
		
 }
}
