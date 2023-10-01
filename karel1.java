import stanford.karel.*;
public class karel1 extends Karel{
 public void run(){

	while (noBeepersPresent()){
		putBeeper();
		move();
	}
	while (beepersPresent()){
		move();
}
}
}