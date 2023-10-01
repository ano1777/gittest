import stanford.karel.Karel;
     public class karel2 extends Karel{
     public void run(){
    	 if(frontIsBlocked()){
    		 turnLeft();
    		 turnLeft();
    		 move();
    	 }else {
    		 move();
    	 }
     }
	

}