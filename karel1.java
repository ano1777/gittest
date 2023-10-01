import stanford.karel.*;
public class karel1 extends Karel{
 public void run(){
	while (beepersPresent()){
		move();
	}while (noBeepersPresent()){
		putBeeper();
	}
}
}
