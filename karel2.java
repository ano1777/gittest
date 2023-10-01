import stanford.karel.Karel;
public class karel2 extends Karel{
public void run(){
	while(frontIsClear()){
		move();
	}
	if (noBeepersPresent()){
		putBeeper();
		move();
	} else{
		move();
	}
		
 }
}
