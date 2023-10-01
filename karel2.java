import stanford.karel.Karel;
     public class karel2 extends Karel{
     public void run(){
    	 if(beepersInBag()){
    		 putBeeper();
    	 }
    	 if (frontIsClear()){
    		 move();
    	 }
     }
	

}