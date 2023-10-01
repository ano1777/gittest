import stanford.karel.Karel;
public class karel2 extends Karel{
public void run(){
	
	for (int i=0; i<100; i++){
		 if (noBeepersPresent()){
				putBeeper();
				move();
			} else{
				move();
 }
}
