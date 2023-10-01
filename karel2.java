import stanford.karel.*;
public class karel2 extends Karel{
public void run(){
	while (noBeepersPresent()){
		putBeeper();
		move();
	}
	
		
 }
}
