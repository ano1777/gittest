import stanford.karel.*;
public class karel2 extends Karel{
public void run(){
	if(frontIsClear()){
		putBeeper();
		move();
	}else{
		move();
	
	}
		
}
}
