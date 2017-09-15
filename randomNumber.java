import java.util.*;

class randomNumber {
   public static void main(String arg[]) {
	   int r;
	   Random r = new Random();
	   
	   //random integers in [0, 100]
	   
	   for(i=1;i<=10;i++) {
		     System.out.println(r.nextInt(100));
	   }
   }
}