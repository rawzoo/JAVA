import java.util.*;

class GarbageCollection {
   public static void main(String s[]) throws Exception {
      Runtime rs = Runtime.getRuntime();
	  
	  System.out.prinln("Free memory in JVM before COllection = "+rs.freeMemory());
	  rs.gc();
	  	  System.out.prinln("Free memory in JVM after COllection = "+rs.freeMemory());
		  
		 }
	}